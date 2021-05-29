//download jdbc sqlite driver
//	https://github.com/xerial/sqlite-jdbc/releases
//	https://mvnrepository.com/artifact/org.xerial/sqlite-jdbc
//	https://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/

//in terminal set classpath=c:\path\to\lib.jar; 
//	set classpath=c:\path\to\lib.jar 

package syntax.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteDemo02 {
  public static void populateTables(Statement statement) throws SQLException {
      statement.executeUpdate("DROP TABLE if exists student");
      statement.executeUpdate("DROP TABLE if exists department");
      statement.executeUpdate("CREATE TABLE department(departmentid INTEGER PRIMARY KEY, departmentname TEXT)");      
      statement.executeUpdate("CREATE TABLE student(studentid INTEGER PRIMARY KEY, studentname TEXT, studentcity TEXT, studentdepartment INTEGER, FOREIGN KEY(studentdepartment) REFERENCES department (departmentid))");
      statement.executeUpdate("PRAGMA foreign_keys=ON"); // activating foreign key feature
      statement.executeUpdate("INSERT INTO department values(1, 'Dept1')");
      statement.executeUpdate("INSERT INTO department values(2, 'Dept2')");
      statement.executeUpdate("INSERT INTO department values(3, 'Dept3')");
//      ResultSet rsd = statement.executeQuery("SELECT * FROM department;");
//      while(rsd.next()) { System.out.println(rsd.getInt("departmentid") +"\t"+ rsd.getString("departmentname")); }
      
      statement.executeUpdate("INSERT INTO student values(1, 'Student01', 'City1', 1)");
      statement.executeUpdate("INSERT INTO student values(2, 'Student02', 'City1', 2)");
      statement.executeUpdate("INSERT INTO student values(3, 'Student03', 'City1', 3)");
//      statement.executeUpdate("INSERT INTO student values(33, 'Student03', 'City1', 4)"); // [SQLITE_CONSTRAINT_FOREIGNKEY]  A foreign key constraint failed (FOREIGN KEY constraint failed)
      statement.executeUpdate("INSERT INTO student values(4, 'Student04', 'City1', 1)");
      statement.executeUpdate("INSERT INTO student values(5, 'Student05', 'City2', 2)");
      statement.executeUpdate("INSERT INTO student values(6, 'Student06', 'City2', 3)");
      statement.executeUpdate("INSERT INTO student values(7, 'Student07', 'City2', 1)");
      statement.executeUpdate("INSERT INTO student values(8, 'Student08', 'City2', 2)");
      statement.executeUpdate("INSERT INTO student values(9, 'Student09', 'City3', 3)");
      statement.executeUpdate("INSERT INTO student values(10,'Student10', 'City3', 1)");
      statement.executeUpdate("INSERT INTO student values(11,'Student11', 'City3', 2)");
      statement.executeUpdate("INSERT INTO student values(12,'Student12', 'City3', 3)");
  }	
  
  public static void printJoinResult(Statement statement) throws SQLException {
    ResultSet rs = statement.executeQuery("SELECT * FROM student S JOIN department D ON S.studentdepartment = D.departmentid WHERE S.studentcity = 'City3' ");
    while(rs.next()) { System.out.println(rs.getInt("studentid") +"\t"+ rs.getString("studentname") +"\t"+ rs.getString("departmentname")); }  
  }
  
  public static void printWhereResult(Statement statement) throws SQLException {
    ResultSet rs = statement.executeQuery("SELECT * FROM student S WHERE S.studentcity = 'City3' ");
	while(rs.next()) { System.out.println(rs.getInt("studentid") +"\t"+ rs.getString("studentname") ); }
  }
  
  public static void printPreparedStatementResult(Connection connection, Statement statement) throws SQLException {
    PreparedStatement pStatement = connection.prepareStatement(" SELECT * FROM student S WHERE S.studentcity = ? ");
    pStatement.setString(1, "City3");
    ResultSet rs = pStatement.executeQuery();
    while(rs.next()) { System.out.println(rs.getInt("studentid") +"\t"+ rs.getString("studentname") ); }
  }
  
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // create a database connection
      connection = DriverManager.getConnection("jdbc:sqlite:db/university.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // set timeout to 30 sec.

      populateTables(statement);
//      printWhereResult(statement);
//      printJoinResult(statement);
      printPreparedStatementResult(connection, statement);
    }
    catch(SQLException e) { System.err.println(e.getMessage()); }
    finally {
      try {
        if(connection != null) connection.close();
      }
      catch(SQLException e) {
        // connection close failed.
        System.err.println(e);
      }
    }
  }
}