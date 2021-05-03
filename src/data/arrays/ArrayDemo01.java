package data.arrays;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5}; // ERROR if declaration and initialization are separated
        int C[];
        C=new int[10];        

        System.out.println(A.length); // 10 
        for(int i=0;i<A.length;i++) {
            System.out.print(A[i] + " ");
        } // 0 0 0 0 0 0 0 0 0 0 
        System.out.println("");

        System.out.println(B.length); // 5
        for(int i=0;i<B.length;i++) {
            System.out.print(B[i] + "_" + B[i]++ + " "); // value is read-only in loop
        } // 1_1 2_2 3_3 4_4 5_5 
        System.out.println("");
        
        for(int x:B) {
        	System.out.print(x + "-" + x++ + ", "); // value is read-only in loop
        } // 1-1, 2-2, 3-3, 4-4, 5-5, 
        System.out.println("");       
        
        B[2]=15;      
        for(int i=0;i<B.length;i++) {
            System.out.print(B[i] + " ");
        } // 1 2 15 4 5 
        System.out.println("");
         
        
    }
    
}
