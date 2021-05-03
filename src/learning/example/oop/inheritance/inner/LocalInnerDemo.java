package learning.example.oop.inheritance.inner;

class AnotherOuter {
    static int x = 10;    
    
    public void outerDisplay() {    	
	    class InnerLocal {
	        int y=20;
	        public void innerDisplay() {
	            System.out.println("InnerLocal.innerMethod invoked: "+x+" "+y);
	        }
	    }
    	InnerLocal i=new InnerLocal();
        i.innerDisplay(); // 10 20 
        System.out.println("access to props of InnerLocal class from Outer: " +i.y);        
    }
}

public class LocalInnerDemo {
    public static void main(String[] args) {
    	AnotherOuter o = new AnotherOuter();
    	o.outerDisplay();
    }    
}
