
package learning.example.basics.loops;

//import java.util.*;
public class LoopForExample02 {    
	public static void main(String[] args){
       
    	
		System.out.println("Display Digits of number");
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n=scan.nextInt();
		int l=257;
		int r;
		while(l>0) {
			r=l%10;
			l=l/10;
			System.out.println(r);
		}
		System.out.println(l);


		System.out.println("Count Digits Of a Number");
//		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a Number");
//		int n=scan.nextInt();

		int m=123;
		int count=0;
		while(m>0) {
			m=m/10;
			count++;
		}
	    System.out.println(count);
    
	    System.out.println("armstrong number");
//	    Scanner scan=new Scanner(System.in);
//	    System.out.println("Enter a Number");
//	    int z=scan.nextInt();
	    int z=123;   
	    int y=z;
	    int sum=0;
	    int x;
	    while(z>0) {
	        x=z%10;
	        z=z/10;
	        sum=sum+x*x*x;
	    }
	    if(sum==y) {	    	
            System.out.println("Its a Armstrong Number");
	    } else {	    	
            System.out.println("Its not an Armstrong Number");
	    }        
    }    
}
