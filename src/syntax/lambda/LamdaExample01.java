package syntax.lambda;

@FunctionalInterface
interface MyLambda {    public void display(); }

class UseLambda {
    public void callLambda(MyLambda ml) {        ml.display();    }
}

class Demo {
	int classVariable=10;
    
    public void accessFromLambdaToClassVar() {    	
        MyLambda ml= () -> {
            System.out.println("class var is "+classVariable);
            System.out.println("modified class var is "+(++classVariable));
        };
        ml.display();
	}
    
    public void accessFromLambdaToFinalVarInMethod() {
    	// allowed
        final int outsideCount=0;
  		MyLambda ml= () -> {
          System.out.println("final var is "+outsideCount);  // final // never modified
  		};
  		ml.display();
	}
    
    public void accessFromLambdaToNotModfiedVarInMethod() {
    	// allowed
        int outsideCount=0;
  		MyLambda ml= () -> {
          System.out.println("not modified var is "+outsideCount);  // considered as final // never modified
  		};
  		ml.display();
	}
    
    public void noAccessFromLambdaToModfiedVarInMethod() {
        int outsideCount=0;
  		MyLambda ml= () -> {
//          System.out.println("Bye"+outsideCount); // not allowed
  		};
  		ml.display();
  		outsideCount++; // modified
	}
    
    public void accessToLambdaVar() {
    	MyLambda ml= () -> {
            int insideCount=0;
            insideCount++;
            System.out.println("lambda vars is "+insideCount);
        };
        ml.display();    	
    }

    public void passLambdaAsParam(){
    	// lambda passed as function argument
    	UseLambda ul=new UseLambda();
    	MyLambda ml = ()->{System.err.println("passed as param");};
    	ul.callLambda(ml);
    }
}
public class LamdaExample01 {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.passLambdaAsParam(); // Hello
        System.out.println();
        d.accessToLambdaVar();
        d.accessFromLambdaToFinalVarInMethod();
        d.accessFromLambdaToNotModfiedVarInMethod();
        System.out.println();
        d.accessFromLambdaToClassVar();
    }
    
}
