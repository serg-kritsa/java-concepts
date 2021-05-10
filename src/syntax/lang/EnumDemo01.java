package syntax.lang;

enum DeptSimple {
    CS,IT,CIVIL,ECE; // should be in upper case
}

public class EnumDemo01 {
    public static void main(String[] args) {
    	DeptSimple ds = DeptSimple.CIVIL;    	
    	for(DeptSimple el : ds.values()) System.out.println(el);
    	System.out.println();
    	
    	System.out.println(ds +" "+ ds.ordinal() +"-"+ ds.name()); // CIVIL 2-CIVIL
    	System.out.println();
    	
		System.out.println(ds.valueOf("IT")); // IT
    	try {    		
    		System.out.println(ds.valueOf("It")); // case sensitive   	
		} catch(IllegalArgumentException e) {    		System.err.println("UNDEF IN ENUM");	}
    	System.out.println();
    	
    	switch(ds) {
    		case CS: System.out.println("Head: John \nBlock: A"); break;
    		case IT: System.out.println("Head: Smith \nBlock: B"); break;
    		case CIVIL: System.out.println("Head: Rob \nBlock: C"); break;
    		case ECE: System.out.println("Head: Dave \nBlock: D"); break;
    	}
    	System.out.println();
    }   
}
