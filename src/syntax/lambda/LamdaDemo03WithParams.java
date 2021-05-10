package syntax.lambda;

@FunctionalInterface
interface MyInterfaceForLambdaWithParam {    public void display(String str); }

@FunctionalInterface
interface MyInterfaceForLambdaWithParams {    public int add(int x, int y); }

public class LamdaDemo03WithParams {
    public static void main(String[] args) {  
		MyInterfaceForLambdaWithParam a1 = (s)->{ System.out.println(s); };
  		a1.display("Hello World"); // Hello World 

		MyInterfaceForLambdaWithParams a2 = (x, y)->{ return x + y; };
  		System.out.println(a2.add(10, 20)); // 30
  		
		MyInterfaceForLambdaWithParams a3 = (x, y) -> x + y;
		int sum = a3.add(10, 20);
  		System.out.println(sum); // 30
	}
}
