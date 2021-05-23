package syntax.generics;

class TwoTypeStore<T1,T2> {}

class MyStringStore extends TypedStore<String> {}

class MyExtendedGenericStore<T> extends TypedStore<T> {}

class MyExtendedNumberStore<T extends Number> extends TypedStore<T> {} // Integer Byte etc


class A {}
class B extends A {}
class C extends A {}
class MyExtendedA<T extends A> {}

interface X {}
class Y implements X {}
class Z implements X {}
class MyImplementedX<T extends X> {} // extends for interface


public class GenericClassDemo04 {
	public static void main(String[] args) {
		
		TwoTypeStore<Integer,String> tts = new TwoTypeStore<>();
		
		MyStringStore mss = new MyStringStore();
		mss.append("A");
//		mss.append(1); // not allowed // The method append(String) in the type TypedStore<String> is not applicable for the arguments (int)
		
		MyExtendedNumberStore<Float> mensf = new MyExtendedNumberStore<>();
		mensf.append(1.1f);
		
		MyExtendedNumberStore<Double> mensd = new MyExtendedNumberStore<>();
		mensd.append(1.1);

		new MyExtendedA<A>();
		new MyExtendedA<B>();
		new MyExtendedA<A>();
//		new MyExtendedA<String>(); // not allowed

		new MyImplementedX<X>();
		new MyImplementedX<Y>();
		new MyImplementedX<Z>();
//		new MyImplementedX<String>(); // not allowed
	}
}
