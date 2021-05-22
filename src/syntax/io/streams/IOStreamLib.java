package syntax.io.streams;

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
	static byte[] endOfLineByte = {10};
	public static void printTextFrom(String path) throws FileNotFoundException, IOException {    	
////		01
//        try(FileInputStream fis=new FileInputStream(path)) {
//    	  	System.out.println("reading w/ resources");
//    	  	byte streamData[]=new byte[fis.available()];
//	        fis.read(streamData);
//	        String str = new String(streamData);
//	        System.out.println(str);   
//        }	
        
////		02 do-while
//        try(FileInputStream fis=new FileInputStream(path)) {
//        	System.out.println("reading w/ resources in do-while loop");
//        	int x;
//        	do {
//				x = fis.read();
//				if (x != -1) { // don't write not printed char
//					System.out.print((char)x); // convert to char from ASCII code
//				}
//			} while (x != -1);
//        	System.out.println();
//        }	
        
//        03 Shorthand While
        try(FileInputStream fis = new FileInputStream(path)) {
        	System.out.println("reading w/ resources in while loop");
        	int x;
        	while ((x = fis.read()) != -1) {
				System.out.print((char)x); // convert to char from ASCII code
			}
        	System.out.println();
        }	
        
////        04 using FileReader
//        try(FileReader fr = new FileReader(path)) {
//        	System.out.println("reading w/ resources using FileReader");
//        	int x;
//        	while ((x = fr.read()) != -1) {
//				System.out.print((char)x); // convert to char from ASCII code
//			}
//        	System.out.println();
//        }
	}
	
	public static void saveFloatsArray(float[] data, String path) throws FileNotFoundException, IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream(path));
        dos.writeInt(data.length);
        System.out.println("writing in file");
        for(float f:data) {		            dos.writeFloat(f);	        }
        dos.close();
	}
	
	public static void printFloatsArray(String path) throws IOException {        
        DataInputStream dis=new DataInputStream(new FileInputStream(path));
        int length=dis.readInt();
        float data;
        System.out.println("reading from file");
        for(int i=0;i<length;i++) {            
        	data=dis.readFloat();
            System.out.println(data);
        }
        dis.close();
	}
	
	public static void saveText(String text, String path) throws FileNotFoundException, IOException {
    	try(FileOutputStream fos=new FileOutputStream(path)) {    		
    		System.out.println("writing text in file w/ resources");
    		byte streamData[]=text.getBytes();
    		fos.write(streamData);
    		fos.write(endOfLineByte);
    	}	
	}
	
	public static void save(ByteArrayOutputStream baos, String filename) throws FileNotFoundException, IOException {
		baos.writeTo(new FileOutputStream(filename));
	}
	
	public static void readAndDecapitalizeAndSave(String pathToSrc, boolean hasCapitalLetters, String pathToDest) throws FileNotFoundException, IOException   {
        FileInputStream fis=new FileInputStream(pathToSrc);
        FileOutputStream fos=new FileOutputStream(pathToDest);
		
		System.out.println("copying content");
        int b;
        while((b=fis.read())!=-1) {
            if (hasCapitalLetters && b >= 65 && b <= 90) {            	fos.write(b+32);			}
            else {            										fos.write(b);	            }
        }
        fis.close();
        fos.close();
	}
	
	public static void appendText(String pathFrom,String appendedContent, String pathTo) throws FileNotFoundException, IOException {
        FileInputStream fis1=new FileInputStream(pathFrom);
        FileInputStream fis2=new FileInputStream(appendedContent);
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        FileOutputStream fos=new FileOutputStream(pathTo);
		System.out.println("appending content");
        int b;
        while((b=sis.read()) != -1) {        	fos.write(b);        }
      
        fis1.close();
        fis2.close();
        sis.close();
        fos.close();
	}
	
	public static void print(byte[] b) throws IOException  {
        ByteArrayInputStream bis = new ByteArrayInputStream(b);
        byte[] read = bis.readAllBytes();
        System.out.println("printing bytes in console");
//        one by one
        for (byte x : b) {
			System.out.print((char)x); // convert ascii code to char
		}
        System.out.println();
        
////        as string
//        String str = new String(read);
//        System.out.println(str);
        bis.close();		
	}

	public static void print(char[] c) throws IOException  {
        CharArrayReader car=new CharArrayReader(c);
        int x;
        System.out.println("printing chars in console");
        while((x=car.read())!=-1) {            System.out.print((char)x);        }
        System.out.println();
        car.close();
	}
	
//	public static void writeBytesFrom(String storeType, String path) throws IOException {
//		ByteArrayOutputStream baos = new ByteArrayOutputStream(20);
//		baos.write('a');
//		baos.write('b');
//		baos.write('c');
//		if (storeType.equals("console")) {
//			System.out.println("writing bytes in console");
//	        byte b[] = baos.toByteArray();
//	        
//		} else if (storeType.equals("file")) {
//			System.out.println("writing bytes in file");
//	        baos.writeTo(new FileOutputStream("dest.txt"));
//		}
//        baos.close();		
//	}
}
