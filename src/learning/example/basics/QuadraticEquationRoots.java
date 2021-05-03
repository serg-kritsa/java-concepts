
package learning.example.basics;

import java.lang.*;
import java.util.*;

public class QuadraticEquationRoots {

   
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       
       int a,b,c;
       double r1,r2;
       
       System.out.println("Enter the values of a ,b and c"); // 1 -4 4 // // 1 5 6
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       
       r1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
       r2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
       
       System.out.println("Roots are "+r1+" "+r2 );
    }
    
}
