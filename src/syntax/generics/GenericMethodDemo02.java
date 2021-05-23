package syntax.generics;

class K {}
class L extends K {}
class M extends L {}

public class GenericMethodDemo02 {

	public static void fnForGenericsOfK_AndSuperOfK(TypedStore<? super K> ts) {}
	public static void fnForGenericsOfL_AndSuperOfL(TypedStore<? super L> ts) {}	
	public static void fnForGenericsOfM_AndSuperOfM(TypedStore<? super M> ts) {}	
	
	public static void fnForGenericsOfExtendedNumbers(TypedStore<? extends Number> ts) {
		ts.displayFor();
	}
	
	public static void fnForGenericsOfAnyType(TypedStore<?> ts) {
		ts.displayFor();
	}
	
	public static void main(String[] args) {
		TypedStore<Integer> nums = new TypedStore<>();
		nums.append(10);
		nums.append(20);

		TypedStore<String> strs = new TypedStore<>();
		strs.append("Hello");
		strs.append("World");
		
		fnForGenericsOfAnyType(nums);
		fnForGenericsOfAnyType(strs);

		fnForGenericsOfExtendedNumbers(nums);
//		fnForGenericsOfExtendedNumbers(strs); // not allowed
		

		TypedStore<K> k = new TypedStore<>();
		TypedStore<L> l = new TypedStore<>();
		TypedStore<M> m = new TypedStore<>();
		fnForGenericsOfK_AndSuperOfK(k);
//		fnForGenericsOfK_AndSuperOfK(l); // not allowed
//		fnForGenericsOfK_AndSuperOfK(m); // not allowed

		fnForGenericsOfL_AndSuperOfL(k);
		fnForGenericsOfL_AndSuperOfL(l);
//		fnForGenericsOfL_AndSuperOfL(m); // not allowed

		fnForGenericsOfM_AndSuperOfM(k);
		fnForGenericsOfM_AndSuperOfM(l);
		fnForGenericsOfM_AndSuperOfM(m);
		
	}
}
