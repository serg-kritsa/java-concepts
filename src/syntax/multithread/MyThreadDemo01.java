package syntax.multithread;

class MyThread extends Thread{
	@Override
    public void run(){
		for (int i = 0; i < 100; i++) {
			System.out.println(i+" Hello from the separated class");			
		}
    }
}

public class MyThreadDemo01 {    
    public static void main(String[] args) {        
        MyThread t=new MyThread();
        t.start();

		for (int i = 0; i < 100; i++) {
			System.out.println(i+"World");			
		}
    }
    
}
