package syntax.method;

public class MethodDemo01PassedBy {
	static void passObject(int A[], int index, int value) {
		A[index] = value;
	}
	static void passPrimitive(int x, int value) {
		x = value;
	}
	static void greet(String user) {
		System.out.println("Welcome Mr./Miss " + user);
	}

    static String findModifiedUsername(String email) {
    	email = "mr/miss-" + email;
    	int indexOfAt = email.indexOf("@");
    	return email.substring(0,indexOfAt); // 
    }

    static String findUsername(String email) {
    	email = email;
    	int indexOfAt = email.indexOf("@");
    	return email.substring(0,indexOfAt); // 
    }
    
    public static void main(String[] args) {
    
        int A[] = {1,2,3,4,5,6};
        passObject(A, 2, 987); // passed by reference
        for(int x : A) {
        	System.out.print(x + " "); // 1 2 987 4 5 6 // was changed
        }
        System.out.println();
        System.out.println();
        
        int x = 10;        
        passPrimitive(x, 20); // passed by value
        passPrimitive(x, 20); // passed by value
        passPrimitive(x, 20); // passed by value
        System.out.println(x); // 10 // wasn't changed
        System.out.println();
        
        String user = "Victor";
        greet(user); // Welcome Mr./Miss Victor
        System.out.println();
    	
    	String email = "user@gmail.com";
    	System.out.println(findUsername(email)); // user
        System.out.println(email); // user@gmail.com
        System.out.println("=== String is considered as primitive type, passed by value ===");
    	System.out.println(findModifiedUsername(email)); // mr./miss-user
        System.out.println(email); // user@gmail.com
        
    }
}
