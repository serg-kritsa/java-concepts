package oop.inheritance;

class Holder {
    private String name;
    private String address;
    private String phno;
    private String dob;
	
    public Holder(String n,String add,String phno,String dob) {
        name=n;
        address=add;
        this.phno=phno;
        this.dob=dob;    	
    }
    public String getName(){return name;}
    public String getAddress(){return address;};
    public String getPhno(){return phno;}
    public String getDOB(){return dob;}

    public void setAddress(String add) { address=add; }
    public void setPhno(String phno) { this.phno=phno; }
}

class Account {
    private long accNo;
    protected Holder holder;
    protected long balance;
    
    public Account(long acc,String n,String add,String phno,String dob) {
        accNo = acc;
        holder = new Holder(n, add, phno, dob);
        balance = 0;
    }
    public long getAccNo(){return accNo;}
    public Holder getHolder() { return holder; }
	public long getBalance(){return balance;}
    
	public void setHolder(Holder holder) { this.holder = holder; }
}

class SavingsAccount extends Account {
	public SavingsAccount(long acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
	}
    public void deposit(long amt) { balance+=amt; }
    public void withdraw(long amt) { balance-=amt; }
}

class LoanAccount extends Account {	
    public LoanAccount(long acc, String n, String add, String phno, String dob) {
		super(acc, n, add, phno, dob);
	}
	public void payEMI(long amt) {
        balance-=amt;
    }
    public void repay(long amt) {
        if(balance==amt) { balance=0; }
    }
}

public class InheritanceExample03 {
    public static void main(String[] args) {
    	SavingsAccount saveAcc = new SavingsAccount(1L, "bankUser", "Some where", "12345", "00-00-0000");
    	saveAcc.deposit(5000);
    	saveAcc.withdraw(3000);
    	System.out.println(saveAcc.getBalance());
    }   
}
