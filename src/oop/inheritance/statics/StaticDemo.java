package oop.inheritance.statics;

class Test {
    static int x=10;
    int y=20;
    
    void show() {        System.out.println(x+" "+y);    }    
    static void display() {        System.out.println(x);    }
}

public class StaticDemo {
    public static void main(String[] args) {
    	Test.display(); // 10
    	System.out.println(Test.x); // 10
    	System.out.println();
    	
        Test t1=new Test();
        t1.show(); // 10 20 
        Test.x=30; // 1) static changed for all objects
        t1.y=50; 
        t1.show(); // 30 50 
    	System.out.println();
        
        Test t2=new Test();
        t2.show(); // 30 20
        
    }
    
}
