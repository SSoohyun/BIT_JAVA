package ex1108;

class Node {
	int data;
	Node next;
	
	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class MyLinkedList {
	private Node head;
	
	// ������ ���� ����
	public void add(int data) {
		Node newNode =  new Node(data);
		if(head == null) { // head�� null�̸�, head�� ���ο� ���� ����
			head = newNode;
			return;
		}
		Node current = head; // ���� ����Ű�� �ִ� ��带 head�� ����
		while (current.next != null) {
			current = current.next; // ���� ���� �̵�
		}
		current.next = newNode;
	}

	// Ư�� ������ ����
	public boolean remove(int data) {
		Node current = head;
		if(head == null) { // ������ ��尡 ����
			return false;
		}
		if(current.data == data) {
			head = head.next;
			return true;
		}
		
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	public Node search(int data) {
		Node current = head;
		if (head == null) {
			return null;
		}
		
		if(current.data == data) {
			return current;
		}
		
		while (current.next != null) {
			if(current.data == data) {
				return current;
			}
			current = current.next;
		}
		
		return null;
	}
	
	public void insert(Node node , int data) {
		Node current = node;
		Node newNode = new Node(data);
		
		newNode.next = current.next;
		current.next = newNode;
		
	}
	
	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str ="[";
		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		str += temp.data;
		return str + "]";
	}
}
	

public class MyLinkedListEx {

	public static void main(String[] args) {
		MyLinkedList ll = new MyLinkedList();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(6);
		ll.add(7);
		ll.add(8);
		System.out.println("������ ���� ��");
		System.out.println(ll);
		
		// remove�� ������ ���
		ll.remove(2);
		System.out.println("������ ���� ��");
		System.out.println(ll);
		
		// �����Ͱ� 3�� ��� ã�� �� �ڿ� 100 �����ϰ� ���
		System.out.println("������ ���� ��");
		ll.insert(ll.search(3), 100);
		System.out.println(ll);
	}
}
