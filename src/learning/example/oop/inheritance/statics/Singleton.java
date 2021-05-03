package learning.example.oop.inheritance.statics;

class CoffeeMachine {
    private float coffeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;
    
    private CoffeeMachine() { // 1) private constructor
        coffeQty=1;
        milkQty=1;
        waterQty=1;
        sugarQty=1;
    }
    
    static private CoffeeMachine my=null; // 2) static reference
    
    // 3) singleton controller
    static CoffeeMachine getInstance() { 
        if(my==null) { my=new CoffeeMachine(); }
        return my;
    }       
    
//    public void fillWater(float qty) {        waterQty=qty;    }
//    public void fillSugar(float qty) {        sugarQty=qty;    }
//    public float getCoffee() {        return 0.15f;    }
    
}
public class Singleton {
    public static void main(String[] args) {
//    	CoffeeMachine m0=new CoffeeMachine(); // cannot be used because of private constructor
        CoffeeMachine m1=CoffeeMachine.getInstance();
        CoffeeMachine m2=CoffeeMachine.getInstance();
        CoffeeMachine m3=CoffeeMachine.getInstance();
        
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");
        
    }   
}
