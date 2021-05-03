package learning.example.oop.inheritance.abstracts;

abstract class Super { // 1) should be abstaract if at least one method is abstract 
//abstract final class Super { // 2) abstaract class can't be final
//abstract static class Super { // 3) abstaract class can't be static
    public Super() { System.out.println("Super Constructor"); }    
    public void meth1() { System.out.println("Meth1 of Super"); }    
    abstract public void meth2(); // 4) abstract methods // ) no method body // ) should be overriden
//  abstract static public void meth2(); // 5) abstract methods can't be static
//  abstract final public void meth2(); // 5) abstract methods can't be final
}

class Sub extends Super {
    @Override
    public void meth2() {
        System.out.println("Sub meth2");
    }
}
public class AbstractDemo01{
    public static void main(String[] args) {
//    	Super base; // reference to abstract is allowed
//    	base = new Super(); // not allowed for abstract classes
        Super s=new Sub(); // Super Constructor
        s.meth1(); // Meth1 of Super
        s.meth2(); // Sub meth2
    }    
}
