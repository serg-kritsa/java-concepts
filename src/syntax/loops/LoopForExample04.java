package syntax.loops;

//import java.util.*;

public class LoopForExample04 {
    
    public static void main(String[] args) {
    	System.out.println("Program to Fibonacci Series");
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter number of Terms");
//        int n=sc.nextInt();
        int n=147;
        
        int a=0,b=1,c;
        
        System.out.print(a+","+b+",");
        for(int i=0;i<n-2;i++) {
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }

        System.out.println("");
        System.out.println("==========================");
        System.out.println("Program to print GP Series");
//        System.out.println("Enter a, r and n");
//        Scanner sc=new Scanner(System.in);
//        int gpStart=sc.nextInt();
//        int multiplier=sc.nextInt();
//        int gpSteps=sc.nextInt();
	    int gpStart=1;
	    int multiplier=5;
	    int gpSteps=10;
        for(int i=0;i<gpSteps;i++) {
        	System.out.print(gpStart+",");
        	gpStart=gpStart*multiplier;
        }    

        System.out.println("");
        System.out.println("==========================");
        System.out.println("Program to print AP Series");
//        System.out.println("Enter a, d and n");
//        Scanner sc=new Scanner(System.in);        
//        int apStart=sc.nextInt();
//        int adder=sc.nextInt();
//        int apSteps=sc.nextInt();
        int apStart=1;
        int adder=5;
        int apSteps=10;
        
        for(int i=0;i<apSteps;i++)
        {
        	System.out.print(apStart+",");
        	apStart=apStart+adder;
        }     
    }
    
        
        
}
