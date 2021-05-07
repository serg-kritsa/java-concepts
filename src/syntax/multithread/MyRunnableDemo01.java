package syntax.multithread;

class MyRunnable implements Runnable{
	@Override
    public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" Hello from the separated class");			
		}
    }
}
public class MyRunnableDemo01 {    
    public static void main(String[] args) {        
        Thread t = new Thread(new MyRunnable());
        t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(i+" World");			
		}
    }    
}