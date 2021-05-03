package oop.inheritance.overriding;

class DynamicDispatchBase {
    public void meth1() {        System.out.println("Base Meth1");    }    
    public void meth2() {        System.out.println("Base Meth2");    }
}

class DynamicDispatchExtended extends DynamicDispatchBase {
    @Override 
    public void meth2() {        System.err.println("Extended Meth2");    }    
    public void meth3() {        System.out.println("Extended Meth3");    }
}

public class DynamicDispatchDemo{
    public static void main(String[] args) {
    	DynamicDispatchBase baseBase = new DynamicDispatchBase();
    	baseBase.meth1(); // Base Meth1
    	baseBase.meth2(); // Base Meth2    	
        
//							reference to object in heap limited by reference // created runtime
    	DynamicDispatchBase baseExtended = new DynamicDispatchExtended();
       
    	baseExtended.meth1(); // Base Meth1 // 
    	baseExtended.meth2(); // Extended Meth2 // !!! overridden method of created-in-heap object will be called
//    	baseExtended.meth3(); // ERROR // no such method in base class
    }   
}
