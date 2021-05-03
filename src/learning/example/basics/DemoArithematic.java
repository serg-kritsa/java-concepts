package learning.example.basics;
public class DemoArithematic {

    public static void main(String[] args) {
        
        System.out.println("\t Integers");
        int a1=14,b1=5;
        
        int c1=a1/b1;
        float d1 = (float)a1/b1;
        int e1=a1%b1;

        System.out.println(c1); // 2
        System.out.println(d1); // 2.8
        System.out.println(e1); // 4
        
        System.out.println("\t Floats");
        float a2=14.3f,b2=3.2f;
         
        float c2=a2/b2;
        float e2=a2%b2;
        
        System.out.println(c2); // 4.46875 
        System.out.println(e2); // 1.5
        
        

        System.out.println("\t Different data types");
        byte a3=10;
        short b3=15;
        int c3=a3+b3; // result should be int here
        
        float a4=12.5f;
        long b4=1231;
        float c4=a4*b4; // result should be float here 
        int d4 = 123;
        c4=a4*d4; 
        
        float a5=12.5f;
        double b5=123;
        double c5=a5*b5; // result should be double here 
        
        char a6=40;
        int b6=30;
        int c6=a6-b6; // result should be int here 
        System.out.println(c6); // 10
        

        System.out.println("\t Math operations order");
        System.out.println(10+20/2); // 20
        System.out.println((10+20)/2); // 15
        System.out.println(10/2*5); // 25
        System.out.println(10/(2*5)); // 1
    }
    
}
