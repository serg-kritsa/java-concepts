package syntax.io;

public class DataStreamExample {
    public static void main(String[] args) throws Exception {
        float list[]={1.2f , 3.45f , 6.78f , 9.01f , 2.34f};
        IOStreamLib.writeFloatNumbersInFile(list, "List.txt");
        IOStreamLib.readFloatNumbers("List.txt");
        
    }   
}
