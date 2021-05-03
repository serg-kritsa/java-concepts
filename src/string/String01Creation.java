package string;

public class String01Creation {

    public static void main(String[] args) {
//    	javap java.lang.String
        String str1="Java Program";
        String str2=new String("JAVA");
        System.out.printf("%s %s \n", str1, str2);
        
        char c[]={'H','e','l','l','o'};
        String str3=new String(c);
        String str4=new String(c,1,3);
        System.out.printf("%s %s \n",str3, str4); // Hello ell
        
        byte b[]={65,66,67,68};
        String str5=new String(b);
        String str6=new String(b,1,2);
        System.out.printf("%s %s \n", str5, str6); // ABCD BC       
        
        String str11="Java"; // in pool
        String str12="Java"; // in pool // same object
        String str13=new String("Java"); // object in heap // in pool already exists
        System.out.printf("%s %s \n", str11==str12, str11==str13); // true false
        
        String str14=new String("Java language v15"); // in heap and pool both?
    }
}
