package syntax.multithread;

public class DaemonThreadDemo02 extends Thread {
	@Override
    public void run(){
		int count = 1;
		while (true) {
			System.out.println(count++ +"Hello from the DaemonThreadDemo02 class ");			
		}
    }
    public static void main(String[] args) {
//    	//  waiting finishing. way 1
//    	DaemonThreadDemo02 t=new DaemonThreadDemo02();
//    	t.setDaemon(false); // can be omitted
//    	t.start();
    	
    	//  waiting finishing. way 2    	
    	DaemonThreadDemo02 t=new DaemonThreadDemo02();
    	t.setDaemon(true);
        t.start();        
        Thread mainThread = Thread.currentThread();
        try {
        	System.out.println("Main thread will wait finishing of deamon");
			mainThread.join(); // join means wait finishing 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

    }
}
