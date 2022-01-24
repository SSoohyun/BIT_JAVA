package ex1109;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return String.format("Point(%d, %d)", x, y);
	}
	
}

public class PointEx {

	public static void main(String[] args) {
		ArrayList<Point> pl = new ArrayList<Point>(); // ArrayList 안에 저장되는 것은 Point 객체들
		
		pl.add(new Point(2, 3));
		pl.add(new Point(3, 4));
		pl.add(new Point(1, -6));
				
		for(Point p : pl) {
			System.out.println(p);
		}
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("hello");
		ll.add("java");
		ll.add("jvm");
		
		for(String str : ll) {
			System.out.println(str);
		}
		
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) { // 방문할 곳이 있을 때만
			System.out.println(it.next());
		}
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
	}

}
