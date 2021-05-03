package learning.example.oop.inheritance.inner;

abstract class MyAbstract { 	abstract void display();}
abstract class MyInterface{ 	abstract void display();}

class YetAnotherOuter {
    static int x = 10;     
    public void outerDisplay() {	    
    	MyAbstract ma=new MyAbstract() {
    		int ay = 20;
			@Override
			void display() {
				System.out.println("access to props from MyAbstract: " + x +" "+ ay);
			}
    	};
        ma.display(); // access to props from MyAbstract: 10 20
        // 1) System.out.println("no access to props of My class from YetAnotherOuter: " +ma.y);  // ERROR
        
        MyInterface mi = new MyInterface() {
    		int iy = 30;
			@Override
			void display() {
				System.out.println("access to props from MyInterface: " + x +" "+ iy);
			}
		};
		mi.display(); // access to props from MyInterface: 10 30
    }
}

public class AnonymousInnerDemo {
    public static void main(String[] args) {
    	YetAnotherOuter o = new YetAnotherOuter();
    	o.outerDisplay();
    }    
}
