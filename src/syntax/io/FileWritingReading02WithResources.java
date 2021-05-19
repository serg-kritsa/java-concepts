package syntax.io;

public class FileWritingReading02WithResources {
    public static void main(String[] args) throws Exception {
    	String path = "C://Users//user//Desktop//WritingInFileByJava.txt";
    	IOStreamLib.writeToFile(path);
    	IOStreamLib.readFromFile(path);
    	IOStreamLib.readFromFileByCharacter03FileReader(path);
    }    
}
