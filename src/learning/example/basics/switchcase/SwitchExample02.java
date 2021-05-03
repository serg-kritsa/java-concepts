package learning.example.basics.switchcase;

import java.util.Scanner;

public class SwitchExample02{
    public static void main(String[] args){
       try (Scanner sc = new Scanner(System.in)) {
    	   System.out.println("Available Operations: ");
		   System.out.print("+ "); // ADD
		   System.out.print("- "); // SUB
		   System.out.print("* "); // MUL
		   System.out.print("/ "); // DIV
		   System.out.println("");
		   
		   System.out.println("Enter 2 Numbers: ");
		   int x=sc.nextInt();
		   int y=sc.nextInt();
		   sc.nextLine();
		   System.out.println("Enter Operation Sign: ");
		   String operation=sc.nextLine();
		   String option=operation.toUpperCase();
		   
		   switch(option){
		       case "+": System.out.println("Sum is "+(x+y));break;
		       case "-": System.out.println("Difference is "+(x-y));break;
		       case "*": System.out.println("Product is "+(x*y));break;
		       case "/": System.out.println("Ratio is "+(x/y));break;
		       default:     System.out.println("Invalid Operation");break;             
		   }
       }       
    }    
}
