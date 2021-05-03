package learning.example.basics.string;

public class String05Methods {

    public static void main(String[] args) {
    	
    	System.out.print("=== . - any single character (letter, number or symbol)\n");
        System.out.printf("%s %s %s \n","f".matches("."),"1".matches("."),"%".matches(".")); // true true true
        System.out.printf("%s \n","aaa".matches(".")); // false
        
        System.out.print("=== [abc] - exact given letters\n"); // a,b
        System.out.printf("%s %s \n","a".matches("[ab]"),"b".matches("[ab]")); // true true 
        System.out.printf("%s %s \n","ab".matches("[ab]"),"z".matches("[ab]")); // false false 
        
        System.out.print("=== [^abc] - except abc\n"); // other than a, b
        System.out.printf("%s %s \n","a".matches("[^ab]"),"s".matches("[^ab]")); // false true 

        System.out.print("=== [a-z1-7] - a-z or 1-7\n"); // range
        System.out.printf("%s %s \n","a".matches("[a-z0-9]"),"0".matches("[a-z0-9]"),"%".matches("[a-z0-9]")); // true true 
        System.out.printf("%s \n","q1".matches("[a-z][0-9]")); // true
        System.out.printf("%s %s %s \n","q".matches("[a-z][0-9]"),"qq".matches("[a-z][0-9]"),"q!".matches("[a-z][0-9]")); // false false false 
        System.out.printf("%s %s \n","%".matches("[a-z0-9]"),"A".matches("[a-z0-9]")); // false false 
        
        System.out.print("=== A|B - A or B\n"); 
        System.out.printf("%s %s \n","a".matches("[a|b]"),"b".matches("[a|b]")); // true true
        System.out.printf("%s %s \n","q".matches("[a|b]"),"qq".matches("[a|b]")); // false false 
        
        System.out.print("=== XZ - exactly XZ\n"); 
        System.out.printf("%s \n","XZ".matches("XZ")); // true 
        System.out.printf("%s %s %s \n","XZ".matches("XZ"),"ZX".matches("XZ"),"XX".matches("XZ")); // true false false 

        System.out.print("=== meta character\n"); 
        System.out.printf("%s %s %s \n","q".matches("\\w"),"!".matches("\\w"),"1".matches("\\w")); // true false true 
        System.out.printf("%s %s %s \n","!".matches("\\W"),"q".matches("\\W"),"1".matches("\\W")); // true false false  //// neither letter or number
        System.out.printf("%s %s %s \n","1".matches("\\d"),"!".matches("\\d"),"q".matches("\\d")); // true false false //// 0-9
        System.out.printf("%s %s %s \n","%".matches("\\D"),"q".matches("\\D"),"1".matches("\\D")); // true true false /// not number
        System.out.printf("%s %s %s %s \n"," ".matches("\\s"),"%".matches("\\s"),"q".matches("\\s"),"1".matches("\\s")); // true false false false /// space
        System.out.printf("%s %s %s %s \n","%".matches("\\S"),"%".matches("\\S"),"q".matches("\\S")," ".matches("\\S")); // true true true false /// not space
        
    }
    
}
