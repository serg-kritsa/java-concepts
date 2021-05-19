package syntax.io;

import java.io.*;

public class BufferedDemo {
	public static void readAfterReset(BufferedInputStream bis) throws IOException   {
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
		
	}
	public static void readAfterReset(BufferedReader br) throws IOException   {
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.mark(10);
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        br.reset();
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
        System.out.print((char)br.read());
		
	}
	public static void read(BufferedInputStream bis) throws IOException   {
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
	}
	public static void readLine(BufferedReader br) throws IOException   {
		System.out.println(">>>"+br.readLine());
	}
    public static void main(String[] args) throws Exception {
    	IOStreamLib.writeContentInFile("dest.txt", "Learn Java Programming");
    	FileInputStream fis = new FileInputStream("dest.txt");
    	BufferedInputStream bis = new BufferedInputStream(fis);
//        System.out.println(fis.markSupported()); // false
//        System.out.println(bis.markSupported()); // true
    	
//        read(bis); // Learn Java Pro
    	
        readAfterReset(bis); // Learn JavaJava
        System.out.println();                    
        read(bis); 			 //  Programming??
        System.out.println();       

        FileReader fr = new FileReader("dest.txt");
        BufferedReader br = new BufferedReader(fr);
        
        readAfterReset(br); // Learn JavaJava
        System.out.println();       
        readLine(br); 		// >>> Programming
    }    
}
