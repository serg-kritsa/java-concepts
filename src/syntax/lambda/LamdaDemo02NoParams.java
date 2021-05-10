package syntax.lambda;

@FunctionalInterface
interface MyInterfaceForLambda {    public void display(); }

public class LamdaDemo02NoParams {
    public static void main(String[] args) {        
    	// 1) anonymous inner class
    	MyInterfaceForLambda a1 = new MyInterfaceForLambda() { 
            public void display() {            	System.out.println("Hello World");            }
        };
        a1.display(); // Hello World

//		2) implementation of unique method of interface w/ lambda
//        anonymous method
		MyInterfaceForLambda a2 = ()->{ System.out.println("Hello World"); };
  		a2.display(); // Hello World
	}
}
