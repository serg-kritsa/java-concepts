package syntax.io.streams;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Student {
    int rollno;
    String name;
    String dept;
    float avg;
    
    public Student() {}
    public Student(int theRollno, String theName, String theDept) {
        rollno = theRollno;
        name = theName;
        dept = theDept;
	}
}

public class DataIOStreamDemo {
	public static void readDataAsText(String filename) {
		Student s = new Student();
		try {
			BufferedReader br = new BufferedReader(
									new InputStreamReader(
											new FileInputStream(filename)));
			s.rollno = Integer.parseInt(br.readLine());
			s.name = br.readLine();
			s.dept = br.readLine();
			s.avg = Float.parseFloat(br.readLine());
			System.out.println("read from text "+s.rollno+" "+s.name+" "+s.dept+" "+s.avg);
			br.close();
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (NumberFormatException e) {e.printStackTrace();} 
	}
	public static void writeDataAsText(String filename, Student s) {
        File f = new File(filename); // way w/ File        
		try {
			PrintStream ps=new PrintStream(new FileOutputStream(f));
	        ps.println(s.rollno);
	        ps.println(s.name);
	        ps.println(s.dept);
	        ps.print(s.avg);
	        ps.close();
	        
//			MyFileOutputStream mfos = new MyFileOutputStream(f);
//			mfos.writeln(""+s.rollno);
//			mfos.writeln(s.name);
//			mfos.writeln(s.dept);
//			mfos.close();
		} catch (FileNotFoundException e) {e.printStackTrace();} 
	}

	public static void readDataAsBinary(String filename) {
		try {
		    DataInputStream dis=new DataInputStream(new FileInputStream(filename));
		    
		    Student s=new Student();
		    s.rollno=dis.readInt();		    
		    s.name=dis.readUTF();		    
		    s.dept=dis.readUTF();
		    s.avg=dis.readFloat();
		    dis.close();

			System.out.println("read from binary "+s.rollno+" "+s.name+" "+s.dept+" "+s.avg);
		} catch (FileNotFoundException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
		
	}
	public static void writeDataAsBinary(String filename, Student s) {        
		try {
	        DataOutputStream dos=new DataOutputStream(new FileOutputStream(filename));
	        dos.writeInt(s.rollno);
	        dos.writeUTF(s.name);
	        dos.writeUTF(s.dept);
	        dos.writeFloat(s.avg);
	        dos.close();	        
		} catch (FileNotFoundException e) { e.printStackTrace();} 
		catch (IOException e) { e.printStackTrace(); } 
	}
    public static void main(String[] args) throws Exception {
        Student s=new Student(10,"John","CSE");
        s.avg = 90.9f;
        writeDataAsText("Student.txt", s);
        readDataAsText("Student.txt");
        
        writeDataAsBinary("Student.bin", s);
        readDataAsBinary("Student.bin");
    }    
}
