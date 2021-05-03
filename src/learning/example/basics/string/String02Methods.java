package learning.example.basics.string;

public class String02Methods {

    public static void main(String[] args) {
        
        String str1=new String("eclipse                      ");
        int len=str1.length();
        System.out.printf("%s %d \n",str1.length(), len); // 10 10
        
        String str2=str1.toUpperCase();
        str1 = str1.toUpperCase(); // string is immutable // changed reference // result obj will be created in heap
        System.out.printf("%s %s \n",str2, str1); // "ECLIPSE                       ECLIPSE                       "
        
        str1=str1.trim().toLowerCase(); // string is immutable // changed reference
        System.out.println(str1); // eclipse // no spaces
        
        String str3=str1.substring(3);
        System.out.println(str3); // ipse
        str3=str1.substring(3,6);
        System.out.println(str3); // ips
        
        String str4=str1.replace('e', 'M'); // every letters
        System.out.println(str4+ " " +str1); // MclipsM eclipse
        
    }
    
}
