package syntax.io;

import syntax.io.IOStreamLib;

public class CopyingContentExample01 {
    public static void main(String[] args) throws Exception {
        
    	IOStreamLib.writeContentInFile("src.txt", "TEXT");
    	IOStreamLib.copyContentInFile("src.txt","dest.txt", false);
		
    	IOStreamLib.writeContentInFile("src1.txt", "TEXT");
    	IOStreamLib.writeContentInFile("src2.txt", "TEXT2");
    	IOStreamLib.appendContent("src1.txt","src2.txt","dest.txt");
        
        
    }   
}
