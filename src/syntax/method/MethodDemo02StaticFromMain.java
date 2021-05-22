package syntax.method;


public class MethodDemo02StaticFromMain {
    
    static void doSomething() { System.out.println("done"); }
    
    public static void main(String[] args) {
        doSomething(); // done 
        
        MethodDemo02StaticFromMain.doSomething(); // done

        MethodDemo02StaticFromMain fromObj=new MethodDemo02StaticFromMain();
        fromObj.doSomething(); // done
    }
}
    
