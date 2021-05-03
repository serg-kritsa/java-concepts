
package learning.example.basics.bitwise;


public class Bitwise01 {

    public static void main(String[] args) 
    {
    	// BASICS
//    		&
//    	0 0 0
//    	0 1 0
//    	1 0 0
//    	1 1 1
    	int a1 = 10, b1 = 6, c1;
    	c1 = a1 & b1;
    	System.out.printf("%s & %s === %s as %s \n", 
    			Integer.toBinaryString(a1),
    			Integer.toBinaryString(b1),
    			Integer.toBinaryString(c1),
    			c1
		); // 1010 & 0110 = 0010 as 2
    	// ==========================================================================================
		//		|
		//	0 0 0
		//	0 1 1
		//	1 0 1
		//	1 1 1
    	int a2 = 0b1010, b2 = 0b0110, c2;
    	c2 = a2 | b2;
    	System.out.printf("%s | %s === %s as %s \n", 
    			Integer.toBinaryString(a2),
    			Integer.toBinaryString(b2),
    			Integer.toBinaryString(c2),
    			c2
		); 
    	// 1010 | 0110 = 1  1  1  0 as 14
    	// 				 8  4  2  1 as 8 + 4 + 2
    	// ==========================================================================================
		//		^
		//	0 0 0
		//	0 1 1
		//	1 0 1
		//	1 1 0
    	int a3 = 0b1010, b3 = 0b0110, c3;
    	c3 = a3 ^ b3;
    	System.out.printf("%s ^ %s === %s as %s \n", 
    			Integer.toBinaryString(a3),
    			Integer.toBinaryString(b3),
    			Integer.toBinaryString(c3),
    			c3
		); 
    	// 1010 ^ 110 === 1  1  0  0 as 12 
    	// 				  8  4  2  1 as 8 + 4      
    }
}
