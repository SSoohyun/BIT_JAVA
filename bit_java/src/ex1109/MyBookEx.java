package ex1109;

import java.util.HashMap;
import java.util.Map;

class Book {
	int id;
	String title;
	String author;
	int quantity;
	
	public Book(int id, String title, String author, int quantity) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.quantity = quantity;
	}	
}


public class MyBookEx {

	public static void main(String[] args) {
		HashMap<Integer, Book> map = new HashMap<Integer, Book>();
		map.put(1, new Book(100, "�����", "�߶��㺣��", 5));
		map.put(2, new Book(200, "�ູ�ѿ���", "����ī���ϵ�", 10));
		map.put(3, new Book(300, "�ȷ�Ȩ��", "�ڳ�����", 8));

		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book book = entry.getValue();
			System.out.println(key + "�� ���� �׸�");
			System.out.printf("%d %s %s %d\n", book.id, book.title, book.author, book.quantity);
			System.out.println("---------------------------------");
		}
	}

}
