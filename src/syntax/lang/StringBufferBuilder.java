package syntax.lang;

public class StringBufferBuilder {
    public static void main(String[] args) {
//    	String Object is Immutable

    	String s1=new String("Hello");        
        StringBuffer s2=new StringBuffer("Hello"); // thread-safe
        StringBuilder s3=new StringBuilder("Hello"); // not thread-safe

        s1.concat(" World");
//        System.out.println(s1.concat(" World")); // Hello World
        s2.append(" World"); // slower  
        s3.append(" World"); // faster
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
    }   
}
