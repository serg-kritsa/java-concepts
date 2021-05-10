package syntax.lambda;

@FunctionalInterface
interface MyInterface {    public void display(); }

class My implements MyInterface {
    public void display() {        System.out.println("Hello World");    }
}

public class LamdaDemo01 {
    public static void main(String[] args) {
    	My m = new My(); // instance of implementing class 
	    m.display(); // Hello World
	}
}
