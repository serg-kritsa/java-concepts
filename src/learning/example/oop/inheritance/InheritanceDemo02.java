package learning.example.oop.inheritance;

class ParentParametrized {
    ParentParametrized() {
        System.out.println("Non-Param of parent");
    }
    ParentParametrized(int x) {
        System.out.println("Param of parent "+x);
    }
}

class ChildParametrized extends ParentParametrized {
    ChildParametrized() {
        System.out.println("Non-Param of child");
    }
    ChildParametrized(int y) {
        System.out.println("Param of child");
    }
    ChildParametrized(int x,int y) {
        super(x);
        System.out.println("2 param of child "+y);
    }
}

public class InheritanceDemo02 {
    public static void main(String[] args) {
    	System.out.println("=== 0 params");
//    	Parent Constrcutor
//    	Non-Param of child
        ChildParametrized c1 = new ChildParametrized();
    	System.out.println("=== 1 param");
//    	Parent Constrcutor
//    	Param of child
        ChildParametrized c2 = new ChildParametrized(20);
    	System.out.println("=== 2 params");
//        Param of parent 10
//        2 param of child 20
        ChildParametrized c3 = new ChildParametrized(10,20);
    }    
}
