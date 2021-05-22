package syntax.io;
//import java.io.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerializedStudent implements Serializable {
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;
    public transient int t; // will be 0 after serialization
    
    public SerializedStudent(int r,String n,float a,String d) {
        rollno=r;
        name=n;
        dept=d;
    	avg=a;
        Data=500;
        t=500; // will be 0 after serialization
    }
    
    public String toString() {
        return "\nStudent Details"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
}

public class SerializationDemo {
	public static void deserialize(String filename) {
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
			SerializedStudent s=(SerializedStudent)ois.readObject();
			
			System.out.println(s);
			ois.close();		
		} 
		catch (IOException e) { e.printStackTrace(); } 
		catch (ClassNotFoundException e) { e.printStackTrace(); }
        
	}
	public static void serialize(String filename, SerializedStudent s) {
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeObject(s);        
			oos.close();
		} catch (IOException e) { e.printStackTrace(); }       
	}
    public static void main(String[] args) throws Exception {        
    	SerializedStudent s=new SerializedStudent(10,"John",89.9f,"CSE");
    	System.out.println("transient value " +s.t); // 500
    	s.t = 999; // will be 0 after serialization
    	System.out.println("transient value " +s.t); // 999
    	System.out.println(s);
    	
        serialize("Student.dat", s);
        deserialize("Student.dat");
    }
}
