package syntax.io;

import java.io.RandomAccessFile;

public class RandomAccessDemo {
    public static void main(String[] args) throws Exception {
    	IOStreamLib.writeContentInFile("src.txt", "ABCDEFGHIJK");
        RandomAccessFile rf = new RandomAccessFile("src.txt","rw");

//        System.out.println((char)rf.read()); // A
//        rf.seek(3); System.out.println((char)rf.read()); // D

//        System.out.println((char)rf.read()); // A
//        rf.skipBytes(3); System.out.println((char)rf.read()); // E
        
//        rf.write('d');
//        System.out.println((char)rf.read()); // B
//        rf.seek(0);
//        System.out.println((char)rf.read()); // d


        
//        rf.seek(3); // from 0
//        System.out.println((char)rf.read()); // D
//        System.out.println(rf.getFilePointer()); // 4 // from 1
//        rf.seek(rf.getFilePointer()+2); // index 6 from 0 
//        System.out.println((char)rf.read()); // G

        rf.close();

       
    }   
}
