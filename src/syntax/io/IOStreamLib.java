package syntax.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharArrayReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.SequenceInputStream;

class MyFileOutputStream extends FileOutputStream {
	byte newLineByte = 10;
	
	public MyFileOutputStream(File file) throws FileNotFoundException {
		super(file);
	}
	public void writeln(String str) {
		try {
			this.write(str.getBytes());
			this.write(newLineByte);
		} catch (IOException e) {			e.printStackTrace();		}
	}
}

public class IOStreamLib {
	public static void readFromFile(String path) throws Exception {    	
        try(FileInputStream fis=new FileInputStream(path)) {
    	  	System.out.println("reading w/ resources");
    	  	byte streamData[]=new byte[fis.available()];
	        fis.read(streamData);
	        String str = new String(streamData);
	        System.out.println(str);   
        }		
	}
	public static void readFromFileByCharacter01DoWhileLoop(String path) throws Exception {    	
        try(FileInputStream fis=new FileInputStream(path)) {
        	System.out.println("reading w/ resources in do-while loop");
        	int x;
        	do {
				x = fis.read();
				if (x != -1) { // don't write not printed char
					System.out.print((char)x); // convert to char from ASCII code
				}
			} while (x != -1);
        }		
	}
	public static void readFromFileByCharacter02WhileLoop(String path) throws Exception {    	
        try(FileInputStream fis = new FileInputStream(path)) {
        	System.out.println("reading w/ resources in while loop");
        	int x;
        	while ((x = fis.read()) != -1) {
				System.out.print((char)x); // convert to char from ASCII code
			}
        }		
	}
	public static void readFromFileByCharacter03FileReader(String path) throws Exception {    	
        try(FileReader fr = new FileReader(path)) {
        	System.out.println("reading w/ resources using FileReader");
        	int x;
        	while ((x = fr.read()) != -1) {
				System.out.print((char)x); // convert to char from ASCII code
			}
        }		
	}
	public static void writeToFile(String path) throws Exception {
    	try(FileOutputStream fos=new FileOutputStream(path)) {    		
    		System.out.println("writing w/ resources");
    		String str="Learn Java Programming w/ resources";
    		byte streamData[]=str.getBytes();
    		fos.write(streamData);
    	}
		
	}
	public static void writeFloatNumbersInFile(float[] data, String pathTo) throws FileNotFoundException, IOException {
        FileOutputStream fos=new FileOutputStream(pathTo);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeInt(data.length);
        System.out.println("writing in file");
        for(float f:data) {		            dos.writeFloat(f);	        }
        dos.close();
        fos.close();
		
	}
	public static void readFloatNumbers(String pathFrom) throws IOException {        
        FileInputStream fis=new FileInputStream(pathFrom);
        DataInputStream dis=new DataInputStream(fis);
        int length=dis.readInt();
        float data;
        System.out.println("reading in file");
        for(int i=0;i<length;i++) {            
        	data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
        fis.close();
		
	}
	public static void writeContentInFile(String path, String content) throws Exception {
    	try(FileOutputStream fos=new FileOutputStream(path)) {    		
    		System.out.println("writing w/ resources");
    		byte streamData[]=content.getBytes();
    		fos.write(streamData);
    	}		
	}
	public static void copyContentInFile(String path, String content, boolean isCapitalized) throws Exception {
        FileInputStream fis=new FileInputStream("src.txt");
        FileOutputStream fos=new FileOutputStream("dest.txt");
		
		System.out.println("copying content");
        int b;
        while((b=fis.read())!=-1) {
            if (isCapitalized && b >= 65 && b <= 90) {            	fos.write(b+32);			}
            else {            										fos.write(b);	            }
        }
        fis.close();
        fos.close();
	}
	public static void appendContent(String pathFrom,String appendedContent, String pathTo) throws FileNotFoundException, IOException {
        FileInputStream fis1=new FileInputStream(pathFrom);
        FileInputStream fis2=new FileInputStream(appendedContent);
        FileOutputStream fos=new FileOutputStream(pathTo);
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
		System.out.println("appending content");
        int b;
        while((b=sis.read())!=-1) {        	fos.write(b);        }
      
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
	}
	public static void readBytes() throws Exception {
        byte b[]={'a','b','c'};
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        String str = new String(bis.readAllBytes());
        System.out.println("reading bytes");
        System.out.println(str);
        bis.close();		
	}
	public static void writeBytesInConcole() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(20);
		baos.write('a');
		baos.write('b');
		baos.write('c');
        byte b[] = baos.toByteArray();
        System.out.println("writing bytes in console");
        for (byte x : b) {
			System.out.println((char)x); // convert ascii to char
		}
        baos.close();		
	}
	public static void writeBytesInFile() throws Exception {
		ByteArrayOutputStream baos = new ByteArrayOutputStream(20);
		baos.write('d');
		baos.write('e');
		baos.write('f');
		System.out.println("writing bytes in file");
        baos.writeTo(new FileOutputStream("dest.txt"));
        baos.close();		
	}
	public static void writeCharsInConsole() throws Exception {
        char c[]={'g','h','i'};
        CharArrayReader car=new CharArrayReader(c);
        int x;
        System.out.println("writing chars in console");
        while((x=car.read())!=-1) {            System.out.print((char)x);        }
        car.close();
	}

}
