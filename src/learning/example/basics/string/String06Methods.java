package learning.example.basics.string;

public class String06Methods {

    public static void main(String[] args) {
    	
    	System.out.print("=== * - any times \n");
        System.out.printf("%s %s \n","abc".matches("[abc]*"),"ccbb".matches("[abc]*"),"".matches("[abc]*")); // true true true
        System.out.printf("%s %s \n","ambc".matches("[abc]*"),"Q1".matches("[a-z]*")); // false false 

    	System.out.print("=== + - min 1 time \n");
        System.out.printf("%s \n","".matches("[a-z]+")); // false
        System.out.println("john@gmail.com".matches(".+gmail\\..+")); // true
        System.out.println("john@gmail.com".matches("\\w*@gmail(.+)")); // true
        System.out.println("joh-n@gmail.com".matches("\\w*@gmail(.+)")); // false
        
    	System.out.print("=== ? - 0 or 1 \n");
        
    	System.out.print("=== {X} - X times \n");
        System.out.printf("%s \n","big".matches("[a-z]{3}")); // true
        System.out.printf("%s %s \n","big".matches("[a-z]{3}"),"best".matches("[a-z]{3}"),"ww3".matches("[a-z]{3}")); // false false
        
    	System.out.print("=== {X,Y} - between X and Y time \n");
    	System.out.println("accbdefg".matches("[abc]{3,7}")); // false
    	
    }
    
}
