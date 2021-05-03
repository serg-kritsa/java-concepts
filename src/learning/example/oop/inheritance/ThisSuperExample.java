package learning.example.oop.inheritance;

class Rectangle01 {
    int length;
    int breadth;
    int x=10;
    
    Rectangle01(int l,int b) { // no this
        length=l;
        breadth=b;
    }
   
}

class Rectangle02 {
    int length;
    int breadth;
    int x=10;
    
    Rectangle02(int length,int breadth) { // with this
        this.length=length;
        this.breadth=breadth;
    }
}

class CuboidExampleSuper extends Rectangle02 {
    int height;
    int x=20;
    
    CuboidExampleSuper(int l,int b,int h) {
        super(l,b);
        height=h;
    }
    
    void display() {
        System.out.println(super.x);
        System.out.println(x);
    }
}


public class ThisSuperExample {
    public static void main(String[] args) {    
    	CuboidExampleSuper c=new CuboidExampleSuper(10,5,15);
    	c.display();        
    }   
}
