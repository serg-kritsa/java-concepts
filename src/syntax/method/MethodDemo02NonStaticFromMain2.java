package syntax.method;


public class MethodDemo02NonStaticFromMain2 {    
    void doSomething() { System.out.println("done"); }
    
    public static void main(String[] args) {
//        doSomething(); // not allowed 
//        MethodDemo02NonStaticFromMain2.doSomething(); // not allowed

        MethodDemo02NonStaticFromMain2 fromObj=new MethodDemo02NonStaticFromMain2();
        fromObj.doSomething(); // done
    }
}
    
