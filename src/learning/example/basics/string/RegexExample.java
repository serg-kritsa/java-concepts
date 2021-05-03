
package learning.example.basics.string;


public class RegexExample {

    
    public static void main(String[] args) 
    {
      System.out.println("=== Cheking if a string is Date");  
      String str1="20/02/2002";   
      System.out.println(str1.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")); // true
      
      System.out.println("=== Cheking if a string is Binary number");   
      int b=100110010;      
      String str2=String.valueOf(b);      
      System.out.println(str2.matches("[01]+")); // true

      System.out.println("=== Cheking if a string is Hexadecimal number");
      String str3="15f";      
      System.out.println(str3.matches("[0-9A-F]+")); // true
      
      System.out.println("=== Remove special chars from string");
      String str4="a!B@c#1$2%3";      
      str4=str4.replaceAll("[^a-zA-Z0-9]", "");              
      System.out.println(str4); // aBc123
      
      System.out.println("=== Counting words in a String");          
      String str5="      The      Volga      is      a      famous      river      ";
      str5=str5.replaceAll("\\s+", " ").trim();      
      String words[]=str5.split("\\s");      
      System.out.println(words.length); // 6
      
      
      
    }
    
}
