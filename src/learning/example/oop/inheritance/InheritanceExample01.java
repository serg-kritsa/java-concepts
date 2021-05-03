package learning.example.oop.inheritance;

class Circle {
    public double radius;
    public double area() { return Math.PI * radius *radius; }
    public double perimeter() { return 2*Math.PI*radius; }
    public double circumference() { return perimeter(); }
}

class Cylinder extends Circle {
    public double height;
    public double volume() { return area()*height; }    
}

public class InheritanceExample01{
       public static void main(String[] args) { 
           Cylinder c=new Cylinder();
          
           c.radius=7; // inherited form base class
           c.height=10; // own properties
           
           System.out.println("Volume "+c.volume()); // own method
           System.out.println("Area "+c.area()); // inherited form base class
       }
}
