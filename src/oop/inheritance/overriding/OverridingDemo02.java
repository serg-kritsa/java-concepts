package oop.inheritance.overriding;

class A {}
class B extends A {}

class SuperA {
    public A display() {
        System.out.println("Super Display");
        return new A();
    }
}

class SubB extends SuperA {
	@Override 
    public B display() { // allowed despite of different return type 
        System.out.println("Sub Display");
        return new B();
    }
}

public class OverridingDemo02 {
    public static void main(String[] args) {
        SuperA s=new SubB();
        s.display();          
    }    
}
