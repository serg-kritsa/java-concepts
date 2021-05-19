package syntax.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWriting01 {
    public static void main(String[] args) {
	      try {
	    	  	String path = "C://Users//user//Desktop//WritingInFileByJava.txt";
	    	  	FileOutputStream fos=new FileOutputStream(path);
	        	
//	    	  	System.out.println("1st writing way");
//	        	String str01="Learn Java Programming. 1st writing way";
//	        	fos.write(str01.getBytes());
	    	  	

	    	  	System.out.println("2nd writing way");
	    	  	String str02="Learn Java Programming. 2nd writing way";
	        	byte streamData[]=str02.getBytes();
	        	for(byte x:streamData) {	        	fos.write(x);	        }
	    	  	

//	    	  	System.out.println("3rd writing way");
//	    	  	String str03="Learn Java Programming. 3rd writing way";
//		    	byte streamData[] = str03.getBytes();
//		    	int offset = 6; // skip 6 chars
//		    	fos.write(streamData, offset, str03.length()-offset);
		    	
		    	
		    	fos.close();		    
		    }
		    catch(FileNotFoundException e) {            System.out.println(e);        }
		    catch(IOException e) {            System.out.println(e);        }
	      
	      
    }    
}
