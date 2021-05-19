package syntax.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileClassDemo {
	public static void printDir(String path) {
        // select path of any directory on you computer
        File f=new File(path);        
        if(f.isDirectory()) {
        	File list[]=f.listFiles();
	        for(File x:list) {
	//        	System.out.println(x.getParent()+" "+x.getName());
	        	System.out.print(x.getName()+" ");
	        }
	    	System.out.println();
        } else {
        	System.out.println("Not a directory");
        }
	}
    public static void main(String[] args) {
       File file= new File("C:\\Users\\user\\Desktop\\src.txt");
       FileOutputStream fos;
       try {
    	   file.setReadOnly();
    	   fos = new FileOutputStream("C:\\Users\\user\\Desktop\\src.txt"); 
       } catch(FileNotFoundException fnfe) {
    	   System.err.println("EN Access is denied - RU Отказано в доступе");
       }
        try {
        	file.setWritable(true);
			fos = new FileOutputStream("C:\\Users\\user\\Desktop\\src.txt");
		} catch (FileNotFoundException e) {} 

        printDir("C:\\Users\\user");
        printDir("C:\\Users\\user\\Desktop\\src.txt");
      
    }
}
