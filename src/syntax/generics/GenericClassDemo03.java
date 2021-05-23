package syntax.generics;

class TypedStore<T> {
	T[] arr = (T[]) new Object[10];
	int length = 0;
	
	public void append(T el) {
		arr[length++] = el;
	}
	public void displayFor() {
		for (int i = 0; i < length; i++) {
			System.out.println(arr[i]);
		}		
		System.out.println();
	}
	public void displayForeach() {
		for (T t : arr) {
			if (t != null) { System.out.println(t); }
		}
		System.out.println();
	}
}

public class GenericClassDemo03 {
	public static void main(String[] args) {
		TypedStore<Integer> nums = new TypedStore<>();
		nums.append(10);
		nums.append(20);
		nums.displayForeach();
		nums.displayFor();
		

		TypedStore<String> strs = new TypedStore<>();
		strs.append("Hello");
		strs.append("World");
		strs.displayForeach();
		strs.displayFor();
		
	}
}
