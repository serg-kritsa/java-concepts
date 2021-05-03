
package learning.example.basics;

import java.lang.*;
import java.util.*;


public class TriangleArea 
{
	public static void areaFromBaseHeight(){
    	Scanner sc=new Scanner(System.in);
    	
    	float base,height,area1, area2;
    	int area3;
        System.out.println("Enter Base and Height");
        base=sc.nextFloat();
        height=sc.nextFloat();
        area1=base*height*0.5f;
        area2=1f/2f*base*height;
        area3=(int) (base*height/2);
        System.out.println("Area of Triangle is "+area1);
        System.out.println("Area of Triangle is "+area2);
        System.out.println("Area of Triangle is "+area3);
	}
    
	public static void areaFromThreeSides(){

    	Scanner sc=new Scanner(System.in);
        int a,b,c;
        double s,area;
        
        System.out.println("Enter 3 Sides of a Triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        s=(a+b+c)/2f;
        
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

        System.out.println("Area of Triangle is "+area);
	}
    public static void main(String[] args) 
    {    	
//    	areaFromBaseHeight();
    	areaFromThreeSides(); 
    }
}
