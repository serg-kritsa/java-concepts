package syntax.io.streams;

public class FileIOStreamDemo {
    public static void main(String[] args) throws Exception {
    	String absolutePathInWin = "C://Users//user//Desktop//WritingInFileByJava.txt";
    	IOStreamLib.saveText("Learn", absolutePathInWin);
    	IOStreamLib.readAndDecapitalizeAndSave(absolutePathInWin, true, "src1.txt");
    	IOStreamLib.printTextFrom("src1.txt");
     	IOStreamLib.saveText("Java", "src2.txt");
     	IOStreamLib.appendText("src1.txt","src2.txt","dest.txt");
    }    
}
