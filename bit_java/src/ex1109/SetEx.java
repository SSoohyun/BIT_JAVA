package ex1109;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SetEx {

	public static void main(String[] args) {
		// ���� 1
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
		
		
		// ���� 2
		/*
		HashSet<String> set = new HashSet<String>();
		set.add("�ڳ�");
		set.add("���");
		set.add("�̶�");
		set.add("Ű��");
		set.add("��Ž��");
		set.add("���"); // �ߺ��Ǿ ���� x
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		*/
		
		// ���� 3
		ArrayList<String> list = new ArrayList<String>();
		list.add("�ڳ�");
		list.add("���");
		list.add("�̶�");
		list.add("�ڳ�");
		
		HashSet<String> set = new HashSet<String>(list); // �ߺ� ���x
		set.add("Ű��");
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
