package learning.example.oop.inheritance.overriding;

class Super {
////	1) final method can't be overriden
//	final public void display() { 
//        System.out.println("Super Display");
//    }
    public void display() {
        System.out.println("Super Display");
    }

	private void show() {
	    System.out.println("Super Show");
	}
}

class Sub extends Super {
	@Override // 2) signature (modifier returned params) should be the same 
    public void display() {
        System.out.println("Sub Display");
    }
//	@Override
//	public void show() { // 3) ERROR for overriding private method
//	    System.out.println("Sub Show");
//	}
}

public class OverridingDemo01 {
    public static void main(String[] args) {
        Super s=new Sub();
        s.display();          
    }    
}
