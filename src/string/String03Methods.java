package string;

public class String03Methods {

    public static void main(String[] args) {
        
        String str1="Mr. Shahrukh Khan";
        System.out.printf("%s %s %s \n",
        		str1.startsWith("Mr."),str1.startsWith("Shah" , 4),str1.endsWith("Khan")); // true true true 
        System.out.printf("%s \n", str1.charAt(4)); // S
        
        for(int i=0;i<str1.length();i++)
            System.out.printf("%d=%s ", i, str1.charAt(i)); // 0=M 1=r 2=. 3=  4=S 5=h 6=a 7=h 8=r 9=u 10=k 11=h 12=  13=K 14=h 15=a 16=n 
        
        System.out.println("\n======================= indexOf");
        
        String str2="www.udemy.co.in";
        System.out.printf("%d %d \n",str2.indexOf("."), str2.indexOf(".",4)); // 3 9
        System.out.printf("%d %d \n",str2.indexOf("."), str2.indexOf("any other")); // 3 -1 
        System.out.println(str2.lastIndexOf(".")); // 12
    }
    
}
