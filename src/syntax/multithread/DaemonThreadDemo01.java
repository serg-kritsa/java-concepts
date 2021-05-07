package syntax.multithread;

public class DaemonThreadDemo01 extends Thread {   	
	@Override
    public void run(){
		for (int i = 0; i < 1e9; i++) {
			System.out.println(i+" Hello from the DaemonThreadDemo01 class");			
		}
    }
	
    public static void main(String[] args) {        
    	DaemonThreadDemo01 t = new DaemonThreadDemo01();
    	t.setDaemon(true); // daemon will finish after main thread 
        t.start();

        try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}        
    }    
}
