
package learning.example.basics.bitwise;

public class Bitwise03Masking {

	public static void main(String[] args){    
		
		System.out.println("Storing 2 numbers up to 15 in left and right parts using variables");
		
//		System.out.println(Integer.toBinaryString(9)); // 1001
//		System.out.println(Integer.toBinaryString(12)); // 1100
//		System.out.println(Integer.toBinaryString(15)); // 1111
		
		byte a=9, b=12;
		byte c;
		
		c=(byte)(a<<4);
//		System.out.println( c ); // -112		11111111111111111111111110010000
//		System.out.println(Integer.toBinaryString( c )); 
		c=(byte)(c|b);
//		System.out.println( c ); // -100		11111111111111111111111110011100
		
		System.out.println((c & 0b11110000)>>4);
		System.out.println((c & 0b00001111));
		
		System.out.println("Storing 2 numbers up to 15 in left and right parts using literals");
		byte d;
		
		d=(byte)(9<<4);
		d=(byte)(d|12);
		
		System.out.println((d&0b11110000)>>4);
		System.out.println(d&0b00001111);
	  
	}
}
