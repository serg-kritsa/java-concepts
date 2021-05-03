package learning.example.oop.inheritance.abstracts;

abstract class ASuper {
    abstract public void meth1();
    abstract public void meth2();
    abstract public void meth3();
    abstract public void meth4();
}

class ExtendedASuper extends ASuper {
    public void meth1() {}
    public void meth2() {}
    public void meth3() {}
    public void meth4() {}
}

public class AbstractDemo02 {
    public static void main(String[] args) {        
        ASuper s; // reference for extended object
        s = new ExtendedASuper();
        System.out.println(s); // address in memory
    }    
}
