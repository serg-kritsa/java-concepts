package syntax.collections;

import java.util.List;
import java.util.TreeSet;

//import java.util.*;

class Point implements Comparable<Object> {
	int x;
	int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "[x=" + x + ", y=" + y + "]";
	}

	@Override
	public int compareTo(Object o) {
		Point p = (Point) o;
		if (this.x < p.x) {
			return -1;
		} else if (this.x > p.x) {
			return 1;
		} else {
			if (this.y < p.y) {
				return -1;
			} else if (this.y > p.y) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}

public class ComparableDemo {
	public static void initPointTreeSet() {
		TreeSet<Point> ts = new TreeSet<Point>(); // implemented Comparable
    	ts.add(new Point(5,5));
    	ts.add(new Point(3,3));
    	ts.add(new Point(1,1));
    	ts.add(new Point(1,2));    	
    	System.out.println(ts); // [[x=1, y=1], [x=1, y=2], [x=3, y=3], [x=5, y=5]]
	}
	public static void initIntegerTreeSet() {		
    	TreeSet<Integer> ts = new TreeSet<>(List.of(101)); // implemented Comparable
    	ts.add(2);
    	ts.add(200);
    	System.out.println(ts); // [2, 101, 200]
	}
    public static void main(String[] args) {
    	initPointTreeSet();
    	initIntegerTreeSet();
    }   
}
