package syntax.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapDemo { 
	public static void initTreeMap() {
		TreeMap<Integer,String> tm=new TreeMap<>(Map.of(0,"A",3,"C"));
        tm.put(5,"E");
        tm.put(7,"G");
        tm.put(3,"C3"); // override
        Entry<Integer,String> e = tm.firstEntry();
        System.out.println(e.getKey()+": "+e.getValue()); // 0: A     
        System.out.println(tm.ceilingEntry(5).getValue()); // E
        System.out.println(tm.get(5)); // E
        System.out.println(tm); // {0=A, 3=C3, 5=E, 7=G} //ordered
	}
	public static void initHashMap() {
		HashMap<Integer,String> hm=new HashMap<>(Map.of(0,"A",3,"D"));
        hm.put(2, "C");
        hm.put(1, "B");
        hm.put(3, "D3"); // ordered
        
        for (Entry<Integer, String> entry :  hm.entrySet()) {
			System.out.print(entry.getKey() +": "+ entry.getValue() +"    ");
		} // 0: A  ;  1: B  ;  2: C  ;  3: D3  ;  
        System.out.print("\n");
        
        for(String el:hm.values()) { 
        	System.out.print(el +"    "); 
    	}        
        System.out.print("\n");
        System.out.println(hm);
	}
    public static void main(String[] args) {    
        initTreeMap();
        initHashMap();
    }  
}
