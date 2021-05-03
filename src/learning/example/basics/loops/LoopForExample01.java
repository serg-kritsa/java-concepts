package learning.example.basics.loops;

import java.util.*;

public class LoopForExample01 {
    public static void main(String[] args) {
        System.out.println("Calculate Factorial Of Number: ");
//        System.out.println("Enter a Number");
//        Scanner sc=new Scanner(System.in);
//        int ii=sc.nextInt();
        int ii = 3;     
        long factorial=1;        
        for(int i=1;i<=ii;i++){
            factorial=factorial*i;
        }        
        System.out.println("Factorial is "+factorial);

		System.out.println("====================================");
		System.out.println("Calculate Sum of n Natural Numbers: ");
		//    Scanner sc=new Scanner(System.in);        
		//    System.out.println("Enter a Number");
		//    int jj=sc.nextInt();
		int jj = 4;     
		int sum=0;           
        for(int i=1;i<=jj;i++){sum+=i;}        
        System.out.println("Sum of "+jj+" Number is "+sum);

		System.out.println("====================================");
		System.out.println("Display Multiplication Table: ");
//		Scanner sc=new Scanner(System.in);
//        System.out.println("Enter a Number");
//        int k=sc.nextInt();
        int kk=9;
    	System.out.print("\t");
        for(int i=1;i<=10;i++) {
        	System.out.print(i + "\t");
        	if (i == 10) {System.out.print("\n");}
        }
        System.out.print(kk);
        for(int i=1;i<=10;i++) {
//          System.out.println(kk+" x "+i+" = "+kk*i);
          System.out.print("\t" + kk*i);
        }        
    }
}
