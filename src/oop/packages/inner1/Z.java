package oop.packages.inner1;

public class Z { 
    A a=new A();
    public void show() { 
    	System.out.println(a.defaultA);
//    	System.out.println(d.privateB); //except private from the same package
    	System.out.println(a.protectedC);
    	System.out.println(a.publicD);   
	}
    
}
