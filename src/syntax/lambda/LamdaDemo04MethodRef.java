package syntax.lambda;

@FunctionalInterface
interface MyInterfaceForReference {    public void display(String str); }

@FunctionalInterface
interface MyInterfaceForReferenceWithArgs {    public int display(String str1, String str2); }

public class LamdaDemo04MethodRef {

	public LamdaDemo04MethodRef() {}
	
	public LamdaDemo04MethodRef(String s) {
		System.out.println(s.toUpperCase());
	}
	
	public void reverse(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.err.println(sb);
	}
	
	public static void reverseStatic(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		System.err.println(sb);
	}
	
    public static void main(String[] args) {  
		MyInterfaceForReference lambda1 = System.out::println;
		lambda1.display("Hello World"); // Hello World

		lambda1 = LamdaDemo04MethodRef::reverseStatic; // the same reference
		lambda1.display("ABC"); // CBA

		lambda1 = LamdaDemo04MethodRef::new; // reference to the constructor
		lambda1.display("Javascript"); // JAVASCRIPT

		LamdaDemo04MethodRef createdObj = new LamdaDemo04MethodRef();
		lambda1 = createdObj::reverse; // the same reference
		lambda1.display("Java"); // avaJ

		MyInterfaceForReferenceWithArgs lambda2 = String::compareTo; // the same reference
		System.out.println(lambda2.display("ABC","ABD")); // -1
		System.out.println(lambda2.display("ABC","ABC")); // 0
		System.out.println(lambda2.display("ABC","ABB")); // 1
	}
}
