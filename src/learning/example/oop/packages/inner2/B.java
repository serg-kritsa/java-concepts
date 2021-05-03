package learning.example.oop.packages.inner2;

import learning.example.oop.packages.inner1.A;

class B extends A {
    public void show() { 
//    	System.out.println(defaultA);
//    	System.out.println(privateB); // no access to private from the same package
    	System.out.println(protectedC);
    	System.out.println(publicD); 
	}
}
