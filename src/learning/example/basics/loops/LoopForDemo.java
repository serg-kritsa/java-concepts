package learning.example.basics.loops;

public class LoopForDemo{

    public static void main(String[] args) {
        //for(int i=0;i<=10;i++)
        //for(int i=0;i>0;i--)
        
        //int i=0;
        //for(System.out.println("Hi");i<=10;i++)
        //for(;;)
        
        for(int i=0,j=1; i<=10; i++,j=j*2){
            System.out.printf("%d %d \n",i,j);
        }
    }
    
}
