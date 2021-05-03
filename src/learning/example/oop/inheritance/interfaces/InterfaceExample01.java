package learning.example.oop.inheritance.interfaces;

class Phone {
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}

interface ICamera {
    void click();
    void record();
}

interface IMusicPlayer {
    void play();
    void stop();
}

class SmartPhone extends Phone implements ICamera,IMusicPlayer {
    public void videoCall() { System.out.println("Smart Phone video calling"); }
   
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void stop() { System.out.println("Smart Phone stopped playing music"); }
}

public class InterfaceExample01 {
    public static void main(String[] args) {
        IMusicPlayer mp=new SmartPhone(); // available only IMusicPlayer methods
        mp.play(); // Smart Phone playing music
        mp.stop(); // Smart Phone stopped playing music
    	

//    	Phone ph=new SmartPhone();
//    	ph.sms(); 
//      	ph.play(); // from IMusicPlayer  // NOT ALLOWED
//      	ph.record(); // from ICamera  // NOT ALLOWED
//      	ph.videoCall(); // object feature // NOT ALLOWED
      	

//    	SmartPhone sp=new SmartPhone();
//      	sp.sms(); // inherited 
//      	sp.videoCall(); // object feature
//      	sp.play(); // from IMusicPlayer
//      	sp.record(); // from ICamera
    }    
}
