package oop.packages;

import oop.packages.inner1.A;
    
public class PackagesDemo {    
    public static void main(String[] args) {
    	A a=new A(); 
//    	System.out.println(a.defaultA);
//    	System.out.println(a.privateB);
//    	System.out.println(a.protectedC);
    	System.out.println(a.publicD); // only public from other package  
    }
}
