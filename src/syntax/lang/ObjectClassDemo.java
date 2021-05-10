package syntax.lang;

//import java.lang.*; // automatically imported

class MyObject { // extends Object automatically
    public String toString() {        return "My Object";    }
    
    public int hashCode() { // allowed       
    	return 100;    }
    public boolean equals(Object o) { // allowed
        return this.hashCode()==o.hashCode(); // comparison by hash code
    }
//  public void wait() {} // not allowed to override because of final
//  public void notify() {} // not allowed to override because of final
}

public class ObjectClassDemo {
    public static void main(String[] args) {
        Object o1=new Object();
        System.out.println(o1); // java.lang.Object@7637f22 // toString() will be called
        Object o2=o1;
        System.out.println((o1.hashCode()==o2.hashCode())+" "+o1.equals(o2)); // true true
        
        MyObject o11=new MyObject();
        System.out.println(o11); // MyObject
        MyObject o12=new MyObject();        
        System.out.println(o11.equals(o12)); // true
    }    
}
