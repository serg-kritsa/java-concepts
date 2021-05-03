package oop.inheritance.inner;

class Outer {
    static int x=10;
    Inner i=new Inner(); // 1.2) available globally for all methods of Outer class
    
    class Inner {
        int y=20;
        public void innerDisplay() {
            System.out.println("Inner.innerMethod invoked: "+x+" "+y);
        }
    }
    
    public void outerDisplay() {        
//    	Inner i=new Inner(); // 1.2) available locally for one method
        i.innerDisplay(); // 10 20 
        System.out.println("access to props of Inner class from Outer: " +i.y);        
    }
}

public class NestedInnerDemo {
    public static void main(String[] args) {
//    	as usual
    	System.out.println("access to static props from main: "+Outer.x); // access to static props from main: 10
    	System.out.println();
    	
    	new Outer().outerDisplay();
    	System.out.println();    	
    	
    	// 1) to get access to inner class, outer should create an object 
        Outer.Inner oi=new Outer().new Inner(); // 1.1) manually
//        Outer.class and Outer$Inner.class was created
        oi.innerDisplay(); // Inner.innerMethod invoked: 10 20
        System.out.println();    	

        Outer o=new Outer();
        o.i.innerDisplay(); // 1.2) from already created
    }    
}
