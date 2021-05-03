
package learning.example.basics.string;


public class StringExample {

    
    public static void main(String[] args) 
    {
      System.out.println("=== Extract domain name");
    	String str1="programmer@gmail.com";
//      String str1="programmer@hotmail.com";
      
      int i=str1.indexOf("@");
      String uname=str1.substring(0,i);
      String domain=str1.substring(i+1, str1.length());
      
      System.out.println("Username :"+uname);
      System.out.println("Domain :"+domain);
      
      int j=domain.indexOf(".");
      String name=domain.substring(0, j);
      System.out.println(name.equals("gmail")); // true
      
    }
    
}
