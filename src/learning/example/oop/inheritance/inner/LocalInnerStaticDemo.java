package learning.example.oop.inheritance.inner;

class OuterWithStatics {
    int x=10;
    static int y=20;
    
    static class My {
        public void show() {
//            System.out.println(x); // ERROR // no access to non-static member
            System.out.println(y);
        }
    }
}

public class LocalInnerStaticDemo {
    public static void main(String[] args) {
    	OuterWithStatics.My m=new OuterWithStatics.My();
        m.show(); // 20
    }    
}
