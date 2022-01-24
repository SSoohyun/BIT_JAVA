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
	
	// 마지막 노드로 삽입
	public void add(int data) {
		Node newNode =  new Node(data);
		if(head == null) { // head가 null이면, head를 새로운 노드로 지정
			head = newNode;
			return;
		}
		Node current = head; // 현재 가리키고 있는 노드를 head로 지정
		while (current.next != null) {
			current = current.next; // 다음 노드로 이동
		}
		current.next = newNode;
	}

	// 특정 데이터 삭제
	public boolean remove(int data) {
		Node current = head;
		if(head == null) { // 삭제할 노드가 없음
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
		System.out.println("데이터 저장 후");
		System.out.println(ll);
		
		// remove한 다음에 출력
		ll.remove(2);
		System.out.println("데이터 삭제 후");
		System.out.println(ll);
		
		// 데이터가 3인 노드 찾고 그 뒤에 100 삽입하고 출력
		System.out.println("데이터 삽입 후");
		ll.insert(ll.search(3), 100);
		System.out.println(ll);
	}
}
