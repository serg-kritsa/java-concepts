package syntax.lang;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

//import java.lang.reflect.*;

class My {
    private int a;
    protected int b;
    public int c;
    int d;
    
    public My() {}
    
    public My(int x,int y) {}
    
    public void display(String s1,String s2) {}
    public int show(int x,int y) {return 0;}
    
}

public class ReflectDemo01 {
    public static void main(String[] args) {
        Class c = My.class;
        
        String name = c.getName();System.out.println(name);
        System.out.println(); // syntax.lang.My
        
        Field field[] = c.getDeclaredFields();
        for(Field f : field) System.out.println(f);
//        private int syntax.lang.My.a
//        protected int syntax.lang.My.b
//        public int syntax.lang.My.c
//        int syntax.lang.My.d
        System.out.println();
        
        Constructor ctor[] = c.getDeclaredConstructors();
        for (Constructor constr : ctor) System.out.println(constr);
//        public syntax.lang.My()
//        public syntax.lang.My(int,int)
        System.out.println();
        
        Method meth[] = c.getMethods();        
        for(Method m : meth) System.out.println(m);
//        public void syntax.lang.My.display(java.lang.String,java.lang.String)
//        public int syntax.lang.My.show(int,int)
//        public final void java.lang.Object.wait(long,int) throws java.lang.InterruptedException
//        public final void java.lang.Object.wait() throws java.lang.InterruptedException
//        public final native void java.lang.Object.wait(long) throws java.lang.InterruptedException
//        public boolean java.lang.Object.equals(java.lang.Object)
//        public java.lang.String java.lang.Object.toString()
//        public native int java.lang.Object.hashCode()
//        public final native java.lang.Class java.lang.Object.getClass()
//        public final native void java.lang.Object.notify()
//        public final native void java.lang.Object.notifyAll()
        System.out.println();
        
        Parameter param[] = meth[0].getParameters();        
        for(Parameter p:param) System.out.println(p);
//        java.lang.String arg0
//        java.lang.String arg1
        System.out.println();
    }   
}
















