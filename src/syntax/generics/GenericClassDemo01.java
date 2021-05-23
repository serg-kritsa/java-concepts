package syntax.generics;

class TypedContainer<T> {
	private T element;

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}	
}

public class GenericClassDemo01 {
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
//		@SuppressWarnings("rawtypes")
		TypedContainer container = new TypedContainer(); // rawtypes warning
		container.setElement("Hello"); // unchecked warning
		container.setElement(10); // unchecked warning
		
		TypedContainer<String> strContainer = new TypedContainer<>();
		strContainer.setElement("Java");
		System.out.println(strContainer.getElement()); // Java

		TypedContainer<Integer> intContainer = new TypedContainer<>();
		intContainer.setElement(10);
		System.out.println(intContainer.getElement()); // 10
	}
}
