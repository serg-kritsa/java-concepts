package syntax.basics;

public class DemoIncDec {

    public static void main(String[] args) {

        System.out.println("No difference ");
    	int x1=5;
        x1++;  //++x1
        System.out.println(x1);

        System.out.println("Difference 1");
        int x2=5,y2,x3=5,y3;
        y2 = x2++;
        y3 = ++x3;
        System.out.println(x2+" "+y2); // 6 5 
        System.out.println(x3+" "+y3); // 6 6

        System.out.println("Difference 2");
        int x4=5,y4=4,z4,x5=5,z5;
        z4=2 * x4++ + 3 * ++y4; // 2*5 + 3*5
        z5=2 * x5++ + 3 * ++x5; // 2*5 + 3*7
        System.out.println(z4); // 25 
        System.out.println(z5); // 31
        
        float x6=3.5f;
        x6++; // 4.5
        char x7='A';
        x7++; // B        
        byte x8=5;
        x8++; // 6
//        x8 = x8 + 1; // ERROR // // byte + literal int expects int 
        
    }
    
}
