package syntax.collections;

import java.util.*;

public class LinkedListDemo02 {	
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
//        LinkedList<E>
        LinkedList<Integer> ll1=new LinkedList<>();        
        LinkedList<Integer> ll2=new LinkedList<>(List.of(50,60,70,80,90));
        ll1.addFirst(1);
        ll1.addLast(999);
        
        ll1.add(10);
        ll1.add(0,5);
//        al1.addAll(al2);
        ll1.addAll(1,ll2);
        ll1.add(5,70);
        ll1.set(6,100); // replace
        
        System.out.println(ll1.contains(25));
        System.out.println(ll1.get(5));
        System.out.println(ll1.indexOf(70));
        System.out.println(ll1.lastIndexOf(70));
        
        System.out.println(ll1);
        for(int i=0; i<ll1.size(); i++) { System.out.println(ll1.get(i)); }
        for(Integer x:ll1) { System.out.println(x); }

////        al1.forEach((x)->{ System.out.println(x); });
        ll1.forEach(n->System.out.println(n)); // shorthand
        ll1.forEach(n->show(n));           
        ll1.forEach(System.out::println); // :: is scope resolution
    }
}
