package syntax.loops;

public class NestedLoopsExamples02 {
    public static void main(String[] args) {
////    	1 
////    	1 2 
////    	1 2 3 
////    	1 2 3 4 
////    	1 2 3 4 5 
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(j+" ");
//            }
//            System.out.println("");
//        }

////    	1 
////    	2 3 
////    	4 5 6 
////    	7 8 9 10 
////    	11 12 13 14 15 
//        int count=0;
//        for(int i=1;i<=5;i++) {
//        	for(int j=1;j<=i;j++) {
//        		count++;
//        		System.out.print(count+" ");
//        	}
//        	System.out.println("");
//        }

////    	1 2 3 4 5 
////    	1 2 3 4 
////    	1 2 3 
////    	1 2 
////    	1 
//        for(int i=1;i<=5;i++) {
//        	for(int j=1;j<=5-i+1;j++) {
//        		System.out.print(j+" ");
//        	}
//        	System.out.println("");
//        }
    
////    	0102030405
////    	06070809
////    	101112
////    	1314
////    	15
//        int count=0;
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=5-i+1;j++) {
//                count++;
//                System.out.format("%02d",count);
//            }
//            System.out.println("");
//        }
        
        
    }
}
