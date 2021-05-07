package syntax.multithread;

public class MyRunnableDemo02 implements Runnable {
	@Override
    public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" Hello from the same class");			
		}
    }
    public static void main(String[] args) {   
        Thread t = new Thread(new MyRunnableDemo02());
        t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(i+" World");			
		}
    }    
}
