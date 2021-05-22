package syntax.io.streams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ArrayIOStreamDemo {
	public static ByteArrayOutputStream initBAOS() {
    	ByteArrayOutputStream baos = new ByteArrayOutputStream(20);
    	baos.write('d');
    	baos.write('e');
    	baos.write('f');
		try {
			baos.write(new byte[4]);
		} catch (IOException e) { e.printStackTrace(); }
		baos.write(111);
		return baos;
	}
    public static void main(String[] args) throws IOException {
    	byte[] b = {'a','b','c',111};
    	IOStreamLib.print(b);
    	
    	char[] c = {'g','h','i',111};
    	IOStreamLib.print(c);
    	
    	ByteArrayOutputStream baos = initBAOS();
		IOStreamLib.print(baos.toByteArray());
		IOStreamLib.save(baos, "baos.txt");
		baos.close();

        float[] list = { 1.2f, 3.45f, 6.78f };
        float[] heapList = new float[2];
        heapList[0] = 9.01f;
        heapList[1] = 2.34f;        
        IOStreamLib.saveFloatsArray(list, "List1.txt");
        IOStreamLib.saveFloatsArray(heapList, "List2.txt");
        IOStreamLib.printFloatsArray("List1.txt");
        IOStreamLib.printFloatsArray("List2.txt");
    }
}