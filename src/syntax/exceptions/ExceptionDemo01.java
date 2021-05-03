package syntax.exceptions;

//import java.util.Scanner;

public class ExceptionDemo01 {
    public static void main(String[] args) {
        System.out.println("=== Multiple Try Catch Exception Demo ===");
    	int a,b,c;
        
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter 2 numbers");        
//        a=sc.nextInt();
//        b=sc.nextInt();
    	
    	a=10;b=0;
        
        try {
            c=a/b;
            System.out.println("Division Result is " +c);
        }
        catch(ArithmeticException e) {
//          System.out.println("Default message is " + e.getMessage());
//          e.printStackTrace();
            System.out.println("Denominator should not be 0, try again");
        }
        System.out.println("Bye");
    } 
}
