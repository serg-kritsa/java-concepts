package learning.example.basics.exceptions;

class NegativeDimensionException extends Exception{
    public String toString(){
        return "Dimensions of a Rectangle cannot be Negative";
    }
}

public class ExceptionDemo05ThrowThrows {
    static int area(int length,int breadth) throws NegativeDimensionException { 
    	// throw passes an exception to calling method
        if(length<0 || breadth<0) {
            throw new NegativeDimensionException(); // exception case
        }
        return length*breadth;
    }
    static void meth1() throws NegativeDimensionException { 
    	// throw passes an exception to calling method
        System.out.println("Area is "+area(10,5));
    }
    
    public static void main(String[] args) {
        try{ // place for catching passed exceptions
        	meth1();
        }
        catch(NegativeDimensionException e){
            System.out.println(e);
        }
        System.err.println("end of main will be reached");
    } 
}
