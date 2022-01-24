package ex1109;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		// 예제 1
		/*
		HashSet<String> set = new HashSet<String>();
		
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		
		// 예제 2
		/*
		HashSet<String> set = new HashSet<String>();
		set.add("코난");
		set.add("장미");
		set.add("미란");
		set.add("키드");
		set.add("유탐정");
		set.add("장미"); // 중복되어서 저장 x
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		// 예제 3
		ArrayList<String> list = new ArrayList<String>();
		list.add("코난");
		list.add("장미");
		list.add("미란");
		list.add("코난");
		
		HashSet<String> set = new HashSet<String>(list); // 중복 허용x
		set.add("키드");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
