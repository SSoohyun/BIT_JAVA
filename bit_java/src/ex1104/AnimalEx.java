package ex1104;

// �߻� Ŭ����
// �߻� �޼ҵ尡 �ϳ��� ������ �߻� Ŭ������ �����ؾ� �� --> abstract �ʼ�!!
abstract class Animal {
	// ���⼭ ��üȭ�ϴ� ���� ����
	// �ڽĿ����� ��üȭ�ϸ� ��
	/*
	 * public void makeSound() { System.out.println("�Ҹ��� ����."); }
	 */
	
	// �߻� �޼ҵ�: Ű����� abstract, ��ü(����)�� ���� �޼ҵ�
	abstract public void makeSound();
	
	// �߻� Ŭ���� �ȿ� �Ϲ� �޼ҵ� ���� ����
	public void eat() {
		System.out.println("�ȳ�");
	}
}

abstract class Shape {
	// �߻� �޼ҵ尡 ������, abstract�� �Ἥ �߻� Ŭ������ ���� ����
}

abstract class Mouse extends Animal {
	// �θ��� �߻� �޼ҵ带 �������� �ʴ´ٸ� �ڽĵ� �߻� Ŭ������ �����ؾ� ��
}

class Dog extends Animal {
	public void makeSound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal {
	public void makeSound() {
		System.out.println("�Ŀ�");
	}
}

public class AnimalEx {

	public static void main(String[] args) {
		
//		new Animal(); // �߻� Ŭ������ ��ü ���� �Ұ���
		
		Animal dog = new Dog(); // �߻� Ŭ������ ���۷����� ���� ����
		dog.makeSound();
		
		Animal cat = new Cat();
		cat.makeSound();
	}

}
