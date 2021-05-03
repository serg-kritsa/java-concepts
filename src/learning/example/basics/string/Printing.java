package learning.example.basics.string;

public class Printing {
    public static void main(String[] args) {
        
        int a=10;
        float b=123.45f;
        char c='A';
        String str="Hello";
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(str);
        
        System.out.println("\t Operations");
        int x=10,y=20;
//        System.out.println(x+y);
//        System.out.println("Number is " +y);
//        System.out.println(x+y+" sum");
//        System.out.println("sum "+(x+y));
        System.out.println("sum of "+x+" and "+y+" is "+(x+y));

        System.out.printf("\t printf \n"); 
        System.out.printf("output for int is %d %o %x \n",a,a,a);
        System.out.printf("%32d 0s are not printed \n",a);
        System.out.printf("%032d 0s are printed \n",a);
        System.out.printf("output for float is %f %e \n",b,b);
        System.out.printf("1) %f %6.2f \n",b,b); // 123,449997 123,45 
        System.out.printf("2) %.3f %6.6f \n",b,b); // 123,450 123,449997 
        float b1 = 123.456f, b2 = 1.23f, b3 = 12345678.9f;
        System.out.printf("3) %6.2f %06.2f %6.2f \n",b1,b2,b3); // 123,46 001,23 12345679,00 // not limited to 1st number (in total) if longer
        System.out.printf("output for char is %c \n",c);
        System.out.printf("output for string is %s \n",str);
        System.out.printf("%-8s|||%8s \n",Integer.toBinaryString(15),Integer.toBinaryString(9)); // 1111    |||    1001 
        int d= -10;
        System.out.printf("%(03d %(03d negative value in parantesis \n",a,d);
        System.out.printf("%+3d %-3d negative value with sign \n",a,d);
        System.out.printf("%3$s %2$f %1$d \n",a,b,str); // changed order // 1$ - take arg from params 
    }
    
}
