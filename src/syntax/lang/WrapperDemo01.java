package syntax.lang;

public class WrapperDemo01 {

    public static void main(String[] args) {
        
        Byte byte1 = 15;
        Byte byte2 = Byte.valueOf("15"); // wrapper around primitive value // "boxing"
        byte byte3 = 15;
        Byte byte4 = Byte.valueOf(byte3); // Byte.valueOf(15); // literal is not allowed
        
        Short short1=Short.valueOf("123");
        
        Double double1=Double.valueOf(123.456);
        
        Character char1=Character.valueOf('A');
        
        Boolean boolean1=Boolean.valueOf("true");
       
        
    }
    
}
