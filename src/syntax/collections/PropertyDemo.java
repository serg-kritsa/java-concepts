package syntax.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) {
        Properties p=new Properties();
        
        p.setProperty("Brand", "Dell");
        p.setProperty("Processor", "i7");
        p.setProperty("OS", "Windows10");
        p.setProperty("Model", "Latitude");

        try {
			p.store(new FileOutputStream("MyData.txt"), "Laptop");
			p.storeToXML(new FileOutputStream("MyData.xml"), "Laptop");

			p.load(new FileInputStream("MyData.txt"));
		} catch (IOException e) { e.printStackTrace(); }
        
        System.out.println(p.getProperty("pName")); // propName OR null
               
    }  
}
