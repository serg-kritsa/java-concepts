package learning.example.basics.loops;

public class LoopWhileExample01 {
    public static void main(String[] args) {
        
    	System.out.println("=== while loop");
        int i=1;//100
        while(i<100){ // 1 10
            System.out.println(i);
            i*=10;
        }

    	System.out.println("=== do-while loop");
        int j=1;//100
        do{ // 1 5 25
            System.out.println(j);
            j*=5;
        }
        while(j<100);

//    	System.out.println("=== infinite while loop");
//        byte k=1;
//        while(true){ // NEVER do this
//            System.out.println(k);
//            k++;
//        }
    }
    
}
