
package bitwise;


public class Bitwise02Shift {

    public static void main(String[] args) 
    {
    	// SHIFTS
//    	0000 1010 << 1   
//    	0001 0100 // left shift
//    	n << k   //// n * (2 ** k)
    	int a1 = 0b1;
    	int b1 = a1 << 1;
    	System.out.println(String.format("1 left shift of %s result is %s", 
    			a1, 
    			b1 
		)); // 1 * (2**1) = 2
    	int a2 = 0b1000;
    	int b2 = a2 <<1 ; // 8 * (2**1) = 16
    	System.out.println(String.format("1 left shift of %s result is %s", 
    			a2, 
    			b2
		)); 
    	b2 = a2<<2; // 8 * (2**2) = 32
    	System.out.println(String.format("2 left shift of %s result is %s", 
    			a2, 
    			b2
		)); 

//    	0000 1010 >> 1
//    	0000 0101 // right shift
//    	n >> k   //// n / (2 ** k)
    	b2 = a2>>1; // 8 / (2**1) = 4
    	System.out.println(String.format("1 right shift of %s result is %s", 
    			a2, 
    			b2
		));
    	b2 = a2>>2; // 8 / (2**2) = 2
    	System.out.println(String.format("2 right shift of %s result is %s", 
    			a2, 
    			b2
		)); 
    	// ===================================================================
    	
//    	10   		     0  0  0  0  1  0  1  0
//    	1st compliment   1  1  1  1  0  1  0  1   // invert 
//    	2nd compliment                       +1   // increment
//    	-10              1  1  1  1  0  1  1  0       
//    	>> 1             1  1  1  1  1  0  1  1   // sign bit is remained the same
//    			1C       0  0  0  0  0  1  0  0    
//    			2C       0  0  0  0  0  1  0  1    
//    			                        4     1 
//    			sign                             = -5         
    	int a3 = -0b1010; // -10
    	int b4 = a3 >> 1; // -5   
    	System.out.println(String.format("1 right shift WITHOUT SIGN BIT of %s result is %s", 
    			a3,
    			b4
		));     
    	System.out.println(String.format("%s", Integer.toBinaryString(a3))); // -10
    	System.out.println(String.format("%s", Integer.toBinaryString( b4 ))); // -5 
//    	>>> 1            0  1  1  1  1  0  1  1   // with sign bit
//    	                   64 32 16  8  4  2  1   
//    	                   64+32+16 +8    +2 +1   // 123
    	int b5 = a3 >>> 1; // 2147483643    
    	System.out.println(String.format("1 right shift WITH SIGN BIT of %s result is %s", 
    			a3, 
    			b5    
		));
    	System.out.println(String.format("%s", Integer.toBinaryString(a3))); // -10
    	System.out.println(String.format("%32s", Integer.toBinaryString( b5 ))); // 2147483643
    	// ==========================================================================================
    	System.out.println("NOT OPERATION");
//	    	~ 0000 1 0 1 0// "not operation"
//	    	       8 4 2 1 = 8 + 2 = 10
//	    	  1111 0 1 0 1 // ?
//	    1Ñ    0000 1 0 1 0 // 1) invert
//	    2C              +1
//	          0000 1 0 1 1
//    	           8   2 1 = 11 // 2) get value
//    	                    -11 // 3) sync with sign bit that is after result of not operation
    	int a6 = 0b1010;
    	int b6 = ~a6; // -11
    	System.out.println(String.format("%32s", Integer.toBinaryString(a6))); // 10
    	System.out.println(String.format("%32s", Integer.toBinaryString( b6 ))); // 11111111111111111111111111110101
    }
}
