package learning.example.oop.inheritance.interfaces;

interface Test {
    int X=10; // 9) by default 	-	final static 
    public abstract void meth1(); // should be overriden
//    private abstract void meth1(); // 8) can't be private
    public abstract void meth2(); // should be overriden
    public static void meth3() {        System.out.println("Meth3 of Test");    } // already implemented
    // default for implemented methods
    default void meth5() {        System.out.println("Meth5 of Test");    } 
}

interface Test2 extends Test {    void meth4();} // interface can be extended 

//class My extends Test2 { // 2) not allowed to extend interface
//class My implements Test2 {} // 3) empty class on interface will become abstract
class My1 implements Test {
    public void meth1(){System.out.println("Meth1 of class My1");}
    public void meth2(){System.out.println("Meth2 of class My1");}
    public void meth4(){System.out.println("Meth4 of class My1");} // 4) not in interface method is OK
}

class My2 implements Test2 {
	public void meth1(){System.out.println("Meth1 of class My2");}
	public void meth2(){System.out.println("Meth2 of class My2");}
	public void meth3(){System.out.println("Meth3 of class My2");}
	public void meth4(){System.out.println("Meth4 of class My2");}
//	public void meth5(){System.out.println("Meth5 of class My2");} // if commented default implementation will be used
//	public void meth5(){} // if commented default implementation will be used
}

public class InterfaceDemo {
    public static void main(String[] args) {
//    	Test t = new Test(); // 1) not allowed to create object from interface
    	Test t = new My1(); // 5) allowed to create object implemented from interface
    	t.meth1();
    	t.meth2();
        System.out.println(Test.X); // 10
//        t.meth3(); // 6) not allowed for static methods of interface
        Test.meth3(); // Meth3 of Test       
//    	t.meth4(); // 7) not allowed // not in interface
        
        Test t2 = new My2();
        t2.meth5();
    }
}
