package syntax.multithread;

class YieldThread01 extends Thread {
	@Override
    public void run(){
		int count = 1;
		while (true) {
			System.out.println(count++ +"Thread");			
		}
    }
}

public class YieldThreadDemo01 {
    public static void main(String[] args) {    	
    	//  waiting finishing. way 1
    	YieldThread01 t=new YieldThread01();
        t.start();

		int count = 1;
		while (true) {
			System.out.println(count++ +"Main");		
			Thread.yield(); // give more time for executing thread
		}
    }
}
