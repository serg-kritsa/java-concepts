package syntax.multithread;

class EmptyThread extends Thread {
    public EmptyThread(String name) {
        super(name);
        //setPriority(Thread.MAX_PRIORITY);
        setPriority(Thread.MIN_PRIORITY+2);
    }
}

public class ThreadMethodsDemo01 {
    public static void main(String[] args) {
    	EmptyThread t=new EmptyThread("My Thread 1");
        System.out.println("ID "+t.getId());
        System.out.println("Name "+t.getName());
        System.out.println("Priority "+t.getPriority());
        t.start();
        System.out.println("State "+t.getState());
        System.out.println("Alive "+t.isAlive());
    }    
}
