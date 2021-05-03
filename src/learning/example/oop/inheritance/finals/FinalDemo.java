package learning.example.oop.inheritance.finals;

final class FinalTest {
    public void method() {        System.out.println("method from Test");    }
}
class Test {
    public final void finalMethod() {        System.out.println("finalMethod from Test");    }
}

class Test1 extends Test {
//    public void finalMethod(){} //ERROR // 1) cannot be overriden
}
//class Test2 extends FinalTest {} //ERROR // 2) cannot be extended

public class FinalDemo {
	final String INITIALIZING_PLACE_ONE = "1) within declaration";
	final String INITIALIZING_PLACE_TWO;
	final String INITIALIZING_PLACE_THREE;
    final float PI_GLOBAL;      
    
    public FinalDemo() {
    	INITIALIZING_PLACE_TWO= "2) in constructor"; 
        PI_GLOBAL=3.1425f;
        System.out.println(PI_GLOBAL); // 3.1425
    }
    
    {
    	INITIALIZING_PLACE_THREE = "3) from block";
    }
    
    public static void main(String[] args) {
    	FinalDemo fd = new FinalDemo();    
//        System.out.println(PI_GLOBAL);	// ERROR // no access in static method
        final float PI_LOCAL;
        PI_LOCAL=3.14f;
        System.out.println(PI_LOCAL); // 3.14
    }    
}
