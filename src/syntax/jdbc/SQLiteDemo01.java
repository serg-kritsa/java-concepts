package syntax.jdbc;
//download jdbc sqlite driver from https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDemo01 {
  public static void repairForeignkey(Statement statement) throws SQLException {
	statement.executeUpdate("CREATE TABLE artist(artistid    INTEGER PRIMARY KEY,artistname  TEXT);");
	// fk works w/o PRIMARY KEY in connected table
	statement.executeUpdate("CREATE TABLE track(trackid     INTEGER, trackname   TEXT, trackartist INTEGER, FOREIGN KEY(trackartist) REFERENCES artist(artistid));");
  }
  
  public static void breakForeignkey(Statement statement) throws SQLException {
    statement.executeUpdate("CREATE TABLE artist(artistid    INTEGER,artistname  TEXT);"); // fk doesn't work w/o PRIMARY KEY
    statement.executeUpdate("CREATE TABLE track(trackid     INTEGER PRIMARY KEY, trackname   TEXT, trackartist INTEGER, FOREIGN KEY(trackartist) REFERENCES artist(artistid));"); 
  }
	
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:db/audio.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.
      statement.executeUpdate("drop table if exists artist");
      statement.executeUpdate("drop table if exists track");
      
//      breakForeignkey(statement);
      repairForeignkey(statement);
      
      statement.executeUpdate("pragma foreign_keys=ON"); 
      statement.executeUpdate("insert into artist values(1, 'Artist');"); 
      statement.executeUpdate("insert into track values(1, 'Track', 1);"); 
      ResultSet rsd = statement.executeQuery("select * from track;");
      while(rsd.next()) { System.out.println(rsd.getInt("trackid") +"\t"+ rsd.getString("trackname")); }
    }
    catch(SQLException e) { System.err.println(e.getMessage()); }
    finally {
      try { 
	    if(connection != null) { connection.close(); }
      }
      catch(SQLException e) { System.err.println(e); } // connection close failed.
    }
  }
}