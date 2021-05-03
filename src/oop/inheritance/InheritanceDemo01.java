package oop.inheritance;

class Parent {
    public Parent() {
        System.out.println("Parent Constrcutor");
    }            
}

class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("Grand Child Constructor");
    }
}

public class InheritanceDemo01{
    public static void main(String[] args) {
//    	Parent Constrcutor
//    	Child Constructor
//    	Grand Child Constructor
        GrandChild c=new GrandChild();        
    }    
}
