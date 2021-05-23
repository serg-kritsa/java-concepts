package syntax.generics;

public class GenericMethodDemo01 {

	public static <T extends Number> void showExtendedNumbers(T ...list) {
		for (T t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
	public static <T> void showVargs(T ...list) {
		for (T t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
	public static <T> void show(T[] list) {
		for (T t : list) {
			System.out.println(t);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		show(new String[]{"A","B"});
		show(new Integer[]{1,2,3});
		
		showVargs("C","D","E");
		showVargs(4,5);
		
		showExtendedNumbers(1.1f,2.2f);
		showExtendedNumbers(1.1,2.2);
	}
}
