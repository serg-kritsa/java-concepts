package syntax.io;

import java.io.BufferedReader;
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
    public Student() {}
    public Student(int theRollno, String theName, String theDept) {
        rollno = theRollno;
        name = theName;
        dept = theDept;
	}
}

public class PrintStreamDemo {
	public static void readData(String filename) {
		Student s = new Student();
		try {
			BufferedReader br = new BufferedReader(
									new InputStreamReader(
											new FileInputStream(filename)));
			s.rollno = Integer.parseInt(br.readLine());
			s.name = br.readLine();
			s.dept = br.readLine();
			System.out.println(s.rollno+" "+s.name+" "+s.dept);
			br.close();
		} 
		catch (FileNotFoundException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();} 
		catch (NumberFormatException e) {e.printStackTrace();} 
	}
	public static void writeData(String filename) {
        Student s=new Student(10,"John","CSE");
        File f = new File(filename);
        
		try {
			PrintStream ps=new PrintStream(new FileOutputStream(f));
	        ps.println(s.rollno);
	        ps.println(s.name);
	        ps.println(s.dept);
	        ps.close();
	        
//			MyFileOutputStream mfos = new MyFileOutputStream(f);
//			mfos.writeln(""+s.rollno);
//			mfos.writeln(s.name);
//			mfos.writeln(s.dept);
//			mfos.close();
		} catch (FileNotFoundException e) {e.printStackTrace();} 
	}
    public static void main(String[] args) throws Exception {
        writeData("Student.txt");
        readData("Student.txt");
    }    
}
