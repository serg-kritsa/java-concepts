package data.arrays;

public class ArrayExample02 {
    
    public static void main(String[] args) {

//    	System.out.println("Inserting an Element with shift other values. last value will be lost");
//        int A[]=new int[10];
//        A[0]=3;A[1]=9;A[2]=7;A[3]=8;A[4]=12;A[5]=6;
//        int n=6;
//        
//        for(int i=0;i<n;i++)
//            System.out.print(A[i]+",");
//        System.out.println("");
//     
//        int x=20;
//        int index=2;
//        
//        for(int i=n;i>index;i--)
//            A[i]=A[i-1];
//        A[index]=x;
//        
//        for(int i=0;i<n;i++)
//            System.out.print(A[i]+",");
//      System.out.println("");
//      System.out.println("====================");
//     
        
        
        System.out.println("Left Rotation");        
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        for(int x:A)
        	System.out.print(x+",");
        System.out.println("");
        
        int firstElement=A[0];
        
        for(int i=1;i<A.length;i++) {
        	A[i-1]=A[i];
        }
        A[A.length-1]=firstElement;
        
        for(int x:A)
        	System.out.print(x+",");
      System.out.println("");
      System.out.println("====================");
        
        
        
    }
    
}
