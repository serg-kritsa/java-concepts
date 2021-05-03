package learning.example.basics.string;

public class String04Methods {

    public static void main(String[] args) {
        
        String str1="Pyramid";
        String str2="pyramid";
        String str3="pyramid";
        String str4="pyramid";
        String str5=new String("pyramid");

        System.out.printf("%s %s \n", str1.equals(str2), str1.equalsIgnoreCase(str2)); // false true //// as characters
        System.out.printf("%s %s %s \n",str1==str2, str2==str3, str3==str4); // false true true //// as objects in memory
        System.out.printf("by letters %s   by references %s \n",str4.equals(str5), str4==str5); // by letters true   by references false 

        String str11="china wall";
        String str12=new String("china tall");
        String str13="China wall";
        System.out.printf("%s %d %d \n", str11.equals(str12), str11.compareTo(str12), str11.compareTo(str13)); //false 3 32   //// as ASCI  65-90   97-122

        System.out.printf("%s %s %s %s \n", String.valueOf(123), String.valueOf(123.456f), String.valueOf(123.456), String.valueOf(true)); // 123 123.456 123.456 true 
        
        String str21="the great wall ";
        String str22="of china";
        System.out.println(str21.contains("wall")); // true
        System.out.println(str21.concat(str22)); // the great wall of china
        //System.out.println(str1 + str2); // the great wall of china
        
    }
    
}
