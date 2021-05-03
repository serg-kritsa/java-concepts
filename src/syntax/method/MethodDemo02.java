package syntax.method;


public class MethodDemo02 {
    
    static int max(int x, int y) {
//        if(x > y) return x;
//        else return y;
    	return x > y? x : y;
    }
    
    static void increment(int x) {
        x++;
        System.out.println(x); // 11
    }
    
    
    public static void main(String[] args) {
    	
    	int a=10,b=15;
        System.out.println(max(a,b)); // 15 
        
        MethodDemo02 mp=new MethodDemo02();
        System.out.println(mp.max(a,b)); // 15
        System.out.println(MethodDemo02.max(a,b)); // 15
        
        
        int c=10;
        increment(c);
        System.out.println(c); // 10
        
        
    }
}
    
