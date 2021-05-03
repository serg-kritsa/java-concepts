package syntax.exceptions;

class StackOverflow extends Exception{
	public int pushedValue;
	StackOverflow(int x){
		this.pushedValue = x;
	}
    public String toString(){
        return "Pushing "+this.pushedValue+" Stack gets Full";
    }
}

class StackUnderflow extends Exception{
    public String toString(){
        return "Stack is Empty";
    }
}

class Stack{
    private int size;
    private int top=-1;
    private int S[];
    
    public Stack(int sz){
        size=sz;
        S=new int[sz];
    }
    
    public void push(int pushedValue) throws StackOverflow{
        if(top==size-1) throw new StackOverflow(pushedValue);
        top++;
        S[top]=pushedValue;
    }
    
    public int pop() throws StackUnderflow{
        int topValue=-1;
        
        if(top==-1) throw new StackUnderflow();
        topValue=S[top];
        top--;
        return topValue;              
    }
}

public class ExceptionExample01Stack{
    public static void main(String[] args){
        Stack st=new Stack(5);
        try{
	        st.push(1);
	        st.pop();
	        st.push(1);
	        st.push(2);
	        st.push(3);
	        st.push(4);
	        st.push(5);
        }
        catch(StackOverflow s){
            System.out.println(s);
        }    
        catch(StackUnderflow s){
            System.out.println(s);
        }        
    }   
}
