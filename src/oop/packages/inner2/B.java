package oop.packages.inner2;

import oop.packages.inner1.A;

class B extends A {
    public void show() { 
//    	System.out.println(defaultA);
//    	System.out.println(privateB); // no access to private from the same package
    	System.out.println(protectedC);
    	System.out.println(publicD); 
	}
}
