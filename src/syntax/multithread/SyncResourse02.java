package syntax.multithread;

class Network02If {
    int value;
    boolean flag=true; // 0 - w, 1 - r
    
    synchronized void startWaiting(String msg) {
    	try { 
    		System.out.println("waiting "+msg);
    		wait(); } catch(InterruptedException e){}
    }
    
    synchronized void stopWaiting(){
    	System.out.println("notified");
        notify(); 
    }

    synchronized public void send(int v) {
        if(flag != true) { startWaiting("signal"); }
        value=v;
        System.err.println(value);
        flag=false;
        stopWaiting();
    }
    
    synchronized public int receive() {
        int result=0;
        if(flag != false) { startWaiting("data"); }
        
        result=value;
        System.out.println(value);
        
        flag=true;
        stopWaiting();
        
        return result;
    }
}

class Server02For extends Thread {
    Network02If network;
    
    public Server02For(Network02If n) {        network=n;    }
    public void run() {
        for(int i=1; i<1e5; i++) {
            network.send(i);
//            System.out.println("Producer-"+Thread.currentThread().getName()+" "+i);
        }
    }
}

class Client02For extends Thread {
    Network02If network;
    
    public Client02For(Network02If n) {        network=n;    }
    public void run() {
        for(int i=1,value=-1; i<1e5; i++) {
        	value=network.receive();
//            System.out.println("Consumer-"+Thread.currentThread().getName()+" "+value);
        }
    }
}

public class SyncResourse02 {
    public static void main(String[] args) {
        Network02If network=new Network02If();        
        Server02For s=new Server02For(network); s.start();        
        Client02For c=new Client02For(network); c.start();        
    }
}
