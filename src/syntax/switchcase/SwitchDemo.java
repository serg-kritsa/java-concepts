
package syntax.switchcase;

public class SwitchDemo{

    public static void main(String[] args){
        System.out.println("=== w/ break");
        String str="3"; // faster than else if loop // goes in case 3 directly
        switch(str){
            case "1": System.out.println("One");break;
            case "2": System.out.println("Two");break;
            case "3": System.out.println("Three");break; // Three
            default : System.out.println("Invalid");  
        }
        
        System.out.println("=== w/o break");
        str="1";
        switch(str){
            case "1": System.out.print("One ");
            case "2": System.out.print("Two ");
            case "3": System.out.print("Three ");break; // One Two Three
            default : System.out.print("Invalid ");  
        }
    }
    
}
