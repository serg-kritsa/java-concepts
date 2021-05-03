package learning.example.oop.inheritance.statics;

class TestStaticBlocks {
    static {
        System.out.println("3");
    }
    
    static {
    	System.out.println("4");
    }
}

public class StaticBlocksDemo {
    static {
        System.out.println("1");
    }
    
    public static void main(String[] args) {
////    	1
////    	2
////    	3
////    	4
////    	5 from main
//    	TestStaticBlocks t1 = new TestStaticBlocks();
//        System.out.println("5 from main");
//        TestStaticBlocks t2 = new TestStaticBlocks(); // static blocks were executed
    	

////		1
////		2
////		5 from main
////		3
////		4
//        System.out.println("5 from main");
//        TestStaticBlocks t3 = new TestStaticBlocks(); // static blocks were executed
    }
    
    static {
    	System.out.println("2");
    }    
}
