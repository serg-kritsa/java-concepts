package learning.example.basics.switchcase;

//import java.util.*;

public class SwitchExample01{
    public static void main(String[] args){

        System.out.println("=== Display site type");
        System.out.println("Enter Domain name: ");
//        Scanner sc=new Scanner(System.in);
//        String domain=sc.nextLine();
        String domain="com";
        String ext=domain.substring(domain.lastIndexOf(".")+1);
        
        switch(ext){
            case "com": System.out.println("Commercial");break;
            case "org": System.out.println("Organisation");break;                        
            case "gov": System.out.println("Government");break;
            case "net": System.out.println("Network");break;
        }

        System.out.println("==============================");
	    System.out.println("=== Display Day name");
	    System.out.println("Enter Day Number");
//	    Scanner scan=new Scanner(System.in);
//	    int day=scan.nextInt();
	    int day=5;
	    
	    switch(day){
	        case 1: System.out.println("Mon");break;
	        case 2: System.out.println("Tue");break;
	        case 3: System.out.println("Wed");break;
	        case 4: System.out.println("Thur");break;
	        case 5: System.out.println("Fri");break;
	        case 6: System.out.println("Sat");break;
	        case 7: System.out.println("Sun");break;
	        default: System.out.println("Invalid");break;                    
	    }     
    }
}
