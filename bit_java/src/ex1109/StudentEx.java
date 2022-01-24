package ex1109;

import java.util.HashMap;
import java.util.Map.Entry;

class Student {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	@Override
	public String toString() {
		return String.format("%s : %d", name, score);
	}
}

public class StudentEx {

	public static void main(String[] args) {
		HashMap<Integer, Student> map = new HashMap<Integer, Student>();
		map.put(1, new Student("kid", 55));
		map.put(2, new Student("conan", 30));
		map.put(3, new Student("rose", 100));
		map.put(4, new Student("ran", 90));
		
		System.out.printf("HashMap의 요소 개수 : %d\n", map.size());
		for(Entry<Integer, Student> entry : map.entrySet()) {
			Student s = entry.getValue();
			System.out.println(s);
		}
	}
}
