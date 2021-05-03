
package learning.example.basics.bitwise;

public class Bitwise03SwapExample {

    public static void main(String[] args) 
    {
    	// ==========================================================================================    	           
      int a=11, b=9;
      System.out.println("Swapping two numbers: " + a+ " "+b);
      System.out.printf("0) a=%8s %8d \n", Integer.toBinaryString(a), a);
      System.out.printf("0) b=%8s %8d \n", Integer.toBinaryString(b), b);
      // 1 to 0, 0 to 1 
      // 1) get bit mask 2) save in a
      a=a^b; 
      System.out.printf("1) a=%8s %8d \n", Integer.toBinaryString(a), a);
      System.out.printf("1) b=%8s %8d \n", Integer.toBinaryString(b), b);
      // 3) mask a is applied to b value 4) reverted value is saved in b // so a is mask, b is a 
      b=a^b; 
      System.out.printf("2) a=%8s %8d \n", Integer.toBinaryString(a), a);
      System.out.printf("2) b=%8s %8d \n", Integer.toBinaryString(b), b);
      // 5) mask is applied to reverted b 6) reverted value is saved in a // so a is b, b is a  //
      a=a^b; 
      System.out.printf("3) a=%8s %8d \n", Integer.toBinaryString(a), a);
      System.out.printf("3) b=%8s %8d \n", Integer.toBinaryString(b), b);
      System.out.println("Result of swapping two numbers: " + a+ " "+b);
    }
}
