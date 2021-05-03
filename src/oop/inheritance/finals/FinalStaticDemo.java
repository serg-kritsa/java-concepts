package oop.inheritance.finals;

public class FinalStaticDemo {
	final static String INITIALIZING_PLACE_ONE = "1) within declaration";
	final static String INITIALIZING_PLACE_TWO;
    
    static {
    	INITIALIZING_PLACE_TWO = "2) in static block";
    }
    public FinalStaticDemo() {}
    
    public static void main(String[] args) {}    
}
