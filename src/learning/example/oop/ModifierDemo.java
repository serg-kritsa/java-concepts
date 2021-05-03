package learning.example.oop;

class PrivateRectangle {
    private double length;
    private double breadth;
    
    public double getLength() { return length; }
    public double getBreadth() { return breadth; }    
    public void setLength(double l) { length = l >= 0 ? l : 0; }    
    public void setBreadth(double b) { breadth = b >= 0 ? b: 0; }
    public double area() { return getLength()*getBreadth(); }
    public double perimeter() { return 2*(length+breadth); }
    public boolean isSquare() { return length == breadth ? true : false; }
}

public class ModifierDemo {

    public static void main(String[] args) {
    	PrivateRectangle r=new PrivateRectangle();
        r.setLength(10.5);//check with negative values.
        r.setBreadth(5.5);
        
        System.out.println("Area "+r.area());
        System.out.println("Perimeter "+r.perimeter());
        System.out.println("Is Square "+r.isSquare());
        
        System.out.println("Length "+r.getLength());
        System.out.println("Breadth "+r.getBreadth());
    }
    
}
