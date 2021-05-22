package syntax.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class SavingInFileDemo {
    public static void main(String[] args) {
    	byte[] endOfLineByte = {10};
	      try {
	    	  	String path = "C://Users//user//Desktop//WritingInFileByJava.txt";
	    	  	FileOutputStream fos=new FileOutputStream(path);
	        	
	    	  	System.out.println("1st writing way");
	        	String str01="Learn Java Programming. 1st writing way";
	        	fos.write(str01.getBytes());
//	    	  	fos.write(endOfLineByte);
	    	  	
	    	  	System.out.println("2nd writing way");
	    	  	String str02="Learn Java Programming. 2nd writing way";
	        	byte streamData02[]=str02.getBytes();
	        	for(byte x:streamData02) {	        	fos.write(x);	        }
	    	  	fos.write(endOfLineByte);

	    	  	System.out.println("3rd writing way");
	    	  	String str03="Learn Java Programming. 3rd writing way";
		    	byte streamData03[] = str03.getBytes();
		    	int offset = 6; // skip 6 chars
		    	fos.write(streamData03, offset, str03.length()-offset);
//	    	  	fos.write(endOfLineByte);		    	
		    	
		    	fos.close();		    
		    }
		    catch(FileNotFoundException e) {            System.out.println(e);        }
		    catch(IOException e) {            System.out.println(e);        }
	      
	      
    }    
}
