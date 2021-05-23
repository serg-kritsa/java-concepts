package syntax.generics;

class TypedStorage<T> {
	T[] data;
	public TypedStorage(int size) {
		data = (T[]) new Object[size];
	}
}

public class GenericClassDemo02 {
	public static void generateClassCastException() {
		Object[] objs = new Object[3];
		objs[0] = "Hi";
		objs[1] = "Bye";
		objs[2] = Integer.valueOf(10);
		String str;
		
//		for (int i = 0; i < objs.length; i++) {
//			str = (String)objs[i];
//			System.out.println(str);
//		}
		
		for (Object x : objs) {
			str = (String)x; // java.lang.ClassCastException
			System.out.println(str);
		}		
	}

	public static void main(String[] args) {
		generateClassCastException();
		TypedStorage<String> ts = new TypedStorage(3);
		ts.data[0] = "Hi";
		ts.data[1] = "Bye";
//		ts.data[2] = 10; // Type mismatch: cannot convert from int to String
		
	}
}
