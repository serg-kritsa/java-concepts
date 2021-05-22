package syntax.method;

class OverloadingDemo {
    public int max(int a,int b) {
        return a>b?a:b;
    }
    
    public int max(int a,int b,int c) {
        if(a>b && a>c) return a;
        else if(b>c) return b;
        return c;
    }
}

public class MethodExample04Overloading { // overloading methods
    // overloaded argument type
	boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }    
    boolean validate(int age) {
        return age>=3 && age<=15;
    }
    
    // overloaded arguments number
    static double area(double radius){
    	return Math.PI*radius*radius;
    }
    
    static double area(double length, double breadth) {
    	return length*breadth;
    }

    // overloaded return type
    int reverse(int n) {
        int rev=0;
        
        while(n>0) {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    int [] reverse(int A[]) {
        int B[]=new int[A.length];
        
        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j]=A[i];
        }
        return B;
    }
    
    public static void main(String[] args) {
        OverloadingDemo t=new OverloadingDemo();
        t.max(10,5);
        t.max(10,15,5);
    }
}
