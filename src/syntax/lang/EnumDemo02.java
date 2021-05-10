package syntax.lang;

enum Dept {
    CS("John","Block A"),IT("Smith","Block B"),CIVIL("Srinivas","Block C"),ECE("Dave","Block D");
    
    String head;
    String location;
    
    private Dept(String head,String loc) { // called on loading
        this.head=head;
        System.err.println(this.head);
        this.location=loc;
    }
    public void display() {        System.out.println("Head: "+ head +", Block: "+ location);    }
    public String getHeadName() {        return head;    }
    public String getLocation() {        return location;    }
}

public class EnumDemo02 {
    public static void main(String[] args) {    	
        Dept d=Dept.CS;
        d.display();
        System.out.println(d.getHeadName());
        System.out.println(d.getLocation());
    }   
}
