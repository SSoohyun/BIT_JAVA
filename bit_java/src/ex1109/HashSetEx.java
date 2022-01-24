package ex1109;

import java.util.HashSet;
import java.util.Set;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			return person.getName().equals(name) && person.getAge() == age;
		} else {
			return false;
		}	
	}
	
	public int hashCode() {
		return name.hashCode() + age;
	}
}

public class HashSetEx {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		set.add(new Person("conan", 10));
		set.add(new Person("conan", 10));
		System.out.printf("Set에 저장된 데이터 수: %d\n", set.size());
	}

}
