package syntax.collections;

import java.util.*;

public class ArrayListDemo {	
	public static void print(ArrayList<?> al, boolean fromBegin) {
        if (fromBegin) {
        	for(ListIterator<?> it=al.listIterator();it.hasNext();) {
        		System.out.println(it.nextIndex() +": "+ it.next());
        	}			
		} else {
			for(ListIterator<?> it=al.listIterator();it.hasPrevious();) {
				System.out.println(it.previousIndex() +": "+ it.previous());
			}
		}
	}
	public static void printAll(ArrayList<?> al) {
		ListIterator<?> it=al.listIterator();
		while(it.hasNext()) { System.out.println(it.next()); }   
	}	
    static void show(int n) { if(n>60) { System.out.println(n); } }    
    
    public static void main(String[] args) {
        
        ArrayList<Integer> al1=new ArrayList<>();        
        ArrayList<Integer> al2=new ArrayList<>(List.of(50,60,70,80,90));

        al1.add(10);
        al1.add(0,5);
//        al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100); // replace
        
//        System.out.println(al1.contains(25));
//        System.out.println(al1.get(5));
//        System.out.println(al1.indexOf(70));
//        System.out.println(al1.lastIndexOf(70));
        
//        System.out.println(al1);
//        for(int i=0; i<al1.size(); i++) { System.out.println(al1.get(i)); }
//        for(Integer x:al1) { System.out.println(x); }

//////        al1.forEach((x)->{ System.out.println(x); });
//        al1.forEach(n->System.out.println(n)); // shorthand
//        al1.forEach(n->show(n));           
//        al1.forEach(System.out::println); // :: is scope resolution
    }
}
