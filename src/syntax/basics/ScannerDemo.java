package syntax.basics;

import java.util.*;

public class ScannerDemo {

    public static void main(String[] args) {
        String name;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("May I know your Name: ");
        name=sc.nextLine();
        
        System.out.println("Welcome "+name);
    }
    
}
