package syntax.method;

public class MethodExample02Prime {
    static boolean isPrime(int n) {
//        System.out.printf("%s %s %s %s %s %s %s %s %s %s \n", 
//        					12%2,12%3,12%4,12%5,12%6,12%7,12%8,12%9,12%10,12%11); // 0 0 0 2 0 5 4 3 2 1 
        for(int i=2;i<n/2;i++) {
        	System.out.println(n + "%" + i + "  " + n%i);
            if(n%i==0) {
            	System.out.println(n + " is not a prime");
            	return false;
            }
        }
    	System.out.println(n + " is a prime");
        return true;
    }

    public static void main(String[] args) {
//        isPrime(21); // not primes are 12	15	21
        isPrime(23); // primes are 17	19	23
    }
}
