package learning.example.oop.packages.inner1;

public class A {
    int defaultA=10;
    private int privateB=20;
    protected int protectedC=30;
    public int publicD=40;
    
    public void display() { // all access from inside class
    	System.out.println(defaultA);
    	System.out.println(privateB);
    	System.out.println(protectedC);
    	System.out.println(publicD);    
	}
}
