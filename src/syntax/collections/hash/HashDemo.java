package syntax.collections.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class HashDemo {
	public static void initHashSet() {
    	HashSet<Integer> hs = new HashSet<Integer>();    	
    	hs.add(10);
    	hs.add(20);
    	hs.add(30);
    	hs.add(40);
    	hs.add(50);
    	System.out.println(hs); // [50, 20, 40, 10, 30]
	}
	public static void initHashMap() {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(5,"E");
        hm.put(1,"A");
        hm.put(4, "D");
        hm.put(2, "B");
        hm.put(3,"C");
        hm.put(6,"A");
        System.out.println(hm); // {1=A, 2=B, 3=C, 4=D, 5=E, 6=A}
	}
	public static void initLinkedHashMap() {
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();        
        lhm.put(5,"E");
        lhm.put(1,"A");
        lhm.put(4,"D");
        lhm.put(2,"B");
        lhm.put(3,"C");
        lhm.put(6,"A");
        String s=lhm.get(5);
        lhm.put(4,"K");
        lhm.get(1);
        System.out.println(lhm); // the same order
	}
    public static void main(String[] args) {
    	initHashSet();
    	initHashMap();
    	initLinkedHashMap();
    }    
}
