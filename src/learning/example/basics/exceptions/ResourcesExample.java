package learning.example.basics.exceptions;

import java.io.FileInputStream;
import java.util.Scanner;

//    		WINDOWS absolute - "C://Users//user//Desktop//Test.txt"
//    		UNIX absolute - "/Users/user/Desktop/Test.txt"

public class ResourcesExample{
//************************************
//*				TryResourcesExample	**
//************************************
	
    static void Divide() throws Exception{        
        try(
    		FileInputStream fi=new FileInputStream("resourses//numbers"); // relative to project
    		Scanner sc=new Scanner(fi) )
        {
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        int c=sc.nextInt();
	        System.out.println(a+"/"+ c +" = "+ a/c);
        }        
    }
    
    public static void main(String[] args) throws Exception {
        try{
        	Divide();
        }
    	catch(Exception e){
           System.out.println(e);
        }
//        int x=sc.nextInt(); // ERROR // no more scanner       
//        System.out.println("main "+x);
    }

//************************************
//*		UnclosedResourcesExample	**
//************************************
	
//	static FileInputStream fi;
//	static Scanner sc;
//    static void Divide() throws Exception{  
//		fi=new FileInputStream("resourses//numbers"); // relative to project
//		sc=new Scanner(fi);
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        System.out.println(a+"/"+ c +" = "+ a/c);        
//    }
//    
//    public static void main(String[] args) throws Exception {
//        try{
//        	Divide();
//        }
//    	catch(Exception e){            System.out.println(e);
//        }
//        int x=sc.nextInt();     // LEAK   
//        System.out.println("main "+x);
//    }

	
	
	

}

