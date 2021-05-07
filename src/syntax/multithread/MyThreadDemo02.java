package syntax.multithread;

public class MyThreadDemo02 extends Thread {
	@Override
    public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" Hello from the same class");			
		}
    }
    public static void main(String[] args) {        
    	MyThreadDemo02 t=new MyThreadDemo02();
        t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(i+" World");			
		}
    }
    
}
