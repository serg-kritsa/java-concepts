package syntax.collections;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;

class Account implements Serializable {
    String accno;
    String name;
    double balance;
    
    Account(){}    
    Account(String a,String n,double b) {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString() {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}

public class CollectionExample01 {
	public static void loadAccountsInMemoryFromFile(Account account, HashMap<String, Account> memory, String filename) {
		File file = new File(filename);
        if (file.exists() && file.length() > 0) {
	        try {
		        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
		        int count=ois.readInt();
		        for(int i=0;i<count;i++) {
		            account = (Account) ois.readObject();
		            memory.put(account.accno,account);
		        }
		        ois.close();        
	        }
	        catch (ClassNotFoundException e) { e.printStackTrace(); }
	        catch(EOFException e) { e.printStackTrace(); } 
	        catch(IOException e) { e.printStackTrace(); } 
		}
	}
	public static void saveFromMemoryToFile(HashMap<String, Account> hm, String filename) {
		try {      
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filename));
			oos.writeInt(hm.size());
			for(Account a:hm.values()) { oos.writeObject(a); }    	
	        oos.flush();
	        oos.close();
        }
		catch (FileNotFoundException e) { e.printStackTrace(); } 
        catch (IOException e) { e.printStackTrace(); }
	}
	public static void saveAccountFromScannerInMemory(Account account, Scanner scanner, HashMap<String, Account> memory) {
        
		account=new Account();
		System.out.println("Enter AccNo: ");
		account.accno = scanner.nextLine();
		System.out.println("Enter Name: ");
		account.name = scanner.nextLine();
		System.out.println("Enter balance as double: ");
		account.balance = scanner.nextDouble();
        memory.put(account.accno, account);
        System.out.println("Account Created for "+account.name);
	}
	public static void printAllFromMemory(HashMap<String, Account> memory) {
		for(Account account : memory.values()) { System.out.println(account); }
	}
	public static void removeScannerValueFromInMemory(Scanner scanner, HashMap<String, Account> memory) {
		System.out.println("Enter Accno to remove");
        memory.remove(scanner.nextLine());
	}
	public static void printScannerValueFromInMemory(Scanner scanner, HashMap<String, Account> memory) {
		System.out.println("Enter Accno");
        System.out.println(memory.get(scanner.nextLine()));
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Account> memory = new HashMap<>();
        Account account = null;
        int choice;
        
        loadAccountsInMemoryFromFile(account, memory, "Accounts.dat");
        do {
            System.out.println("	Account Menu	");
    		System.out.println("1. Create");
            System.out.println("2. Delete");
            System.out.println("3. View");
            System.out.println("4. View All");
            System.out.println("5. Save");
            System.out.println("6. Exit");            
            System.out.println("Enter your choice: ");
            
            choice=scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?"); // ignore new line char // means flush 
	      	switch(choice) {
	      		case 1: saveAccountFromScannerInMemory(account, scanner, memory);break;
	      		case 2: removeScannerValueFromInMemory(scanner, memory);break;
	      		case 3: printScannerValueFromInMemory(scanner, memory);break;
	      		case 4: printAllFromMemory(memory);break;
	      		case 5: saveFromMemoryToFile(memory, "Accounts.dat");break;
	      	}
        }   
        while(choice != 6);
	}
}


    

