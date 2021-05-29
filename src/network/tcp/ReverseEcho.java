package network.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

class Client {
    public static void main(String[] args) throws Exception {
        Socket ws=new Socket("127.0.0.1",8080); // 192.168.43.127 // localhost
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(ws.getInputStream()));
        PrintStream ps=new PrintStream(ws.getOutputStream());
        
        String msg;
        
        do {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server "+msg);
            
        }
        while(!msg.equals("dne"));
        ws.close();
    }    
}

public class ReverseEcho extends Thread {
    Socket ws;    
    public ReverseEcho(Socket s) {        ws=s;    }
    public void run() {
        try {
	        BufferedReader br=new BufferedReader(new InputStreamReader(ws.getInputStream()));
	        PrintStream ps=new PrintStream(ws.getOutputStream());
	        
	        String msg;
//	        StringBuilder sb;
	        do {
	            msg=br.readLine();
//	            sb=new StringBuilder(msg);
//	            sb.reverse();
//	            msg=sb.toString();
	            ps.println(msg);
	        }
	        while(!msg.equals("dne"));
	        ws.close();
        }
        catch(IOException e){ e.printStackTrace(); }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);
        int count=1;
        Socket ws;
        ReverseEcho re;
        do {
	        ws=server.accept();
	        System.out.println("Client Connected: "+count++);
	        re=new ReverseEcho(ws);
	        re.start();
        }
        while(true);
    }    
}
