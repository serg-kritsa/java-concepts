package syntax.multithread;

class SleepingThread extends Thread{
    public SleepingThread(String name){
        super(name);
    }
    
    public void run(){
        int count=1;
        while(true){
            System.out.println(count++);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadMethodsDemo02Interrupted {
    public static void main(String[] args) {
        //Thread t=new Thread(new MyRun(),"My Name");
    	SleepingThread t=new SleepingThread("My Thread 1");
        t.start();
        t.interrupt();
    }    
}
