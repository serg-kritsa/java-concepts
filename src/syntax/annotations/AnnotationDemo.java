package syntax.annotations;

import java.util.List;

class A {
    public void display() {}
}

class B extends A {
    @Override // ensure that methods is overriden // best practice
    // compiler shows error if typo 
    public void display() {}
    @Deprecated
    public void show() {}    
}

class C<T> {
	@SafeVarargs // Type safety: Potential heap pollution via varargs parameter arg // only for final method
	final public void show(T ...arg) {
		for(T x : arg) System.out.println(x);
	}	
}

@FunctionalInterface
// interface w/ one method
interface I {
	public void show1();
//	public void show2(); // not allowed
}

public class AnnotationDemo {
	static List l;

//	@SuppressWarnings("deprecation")
    @SuppressWarnings("unchecked") // check type safety
	public static void main(String[] args) {
		l.add(10);
        int i;

        B b=new B();  
        b.show();
        
        C c = new C();
        c.show(1,2,3);
    }    
}
