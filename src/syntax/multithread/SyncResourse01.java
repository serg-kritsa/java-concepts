package syntax.multithread;

class Network01While {
    int value;
    boolean flag=true;

    synchronized public void send(int v) {
        while(flag != true) { try { wait(); } catch(InterruptedException e){} }
        value=v;
        flag=false;
        notify();
    }
    
    synchronized public int receive() {
        int x=0;
        while(flag != false) { try { wait(); } catch(InterruptedException e){} }
        
        x=value;
        flag=true;
        notify();
        
        return x;
    }
}

class Server01While extends Thread {
    Network01While network;
    
    public Server01While(Network01While n) {        network=n;    }
    public void run() {
        int count=1;
        while(true) {
            network.send(count);
            System.out.println("Producer-"+Thread.currentThread().getName()+" "+count);
            count++;
        }
    }
}

class Client01While extends Thread {
    Network01While network;
    
    public Client01While(Network01While n) {        network=n;    }
    public void run() {
        int value;
        while(true) {
            value=network.receive();
            System.out.println("Consumer-"+Thread.currentThread().getName()+" "+value);
        }
    }
}

public class SyncResourse01{
    public static void main(String[] args) {
        Network01While network=new Network01While();        
        Server01While s=new Server01While(network); s.start();        
        Client01While c=new Client01While(network); c.start();        
    }
}
