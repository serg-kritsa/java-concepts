package syntax.lang;

public class IntegerDemo01 {

    public static void main(String[] args) {


//      Integer deprecatedWaySinceV9 = new Integer(10); // deprecated since v9
        Integer integer1 = Integer.valueOf(10);
        Integer integer2 = 10;
        
        int int3=10;
        Integer integer4=Integer.valueOf(int3); // "boxing" value
        Integer integer5=int3; // "boxing" value
        int int6=integer5.intValue(); // "unboxing"
        int int7=integer5; // intValue() will be called automatically
        int m1=15;
        
    	int int8 = 15;
        Integer integer9 = int8;
        Integer integer10 = 15;
        System.out.println(integer9.equals(int8)); // true // compare by value
        System.out.println(integer9.equals(integer10)); // true // compare by value
        System.out.println();
        System.out.println(Integer.valueOf("11111111", 2)); // 255
        System.out.println(Integer.toBinaryString(128)); // 10000000
        System.out.println(Integer.valueOf("7", 8)); // 7
        System.out.println(Integer.valueOf("10", 8)); // 8
        System.out.println(Integer.valueOf("A7", 16)); // 167
        System.out.println(Integer.decode("0xA7")); // 167

        String s1="123"; // 123q throws NumberFormatException
    	Integer integer11 = Integer.parseInt(s1);
    	int int9 = Integer.parseInt(s1);
        String s2="123q";
        try {        	Integer.parseInt(s2); }
        catch (NumberFormatException e) {
        	System.err.println(e); // java.lang.NumberFormatException: For input string: "123q"
        }
        System.out.println(Integer.MIN_VALUE+" "+ Integer.MAX_VALUE);
        
    }
    
}
