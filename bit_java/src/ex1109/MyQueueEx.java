package ex1109;

import java.util.Random;
import java.util.Scanner;

// �ּ� ó���� front = 0�� ��
class MyQueue {
	private int front;
	private int rear;
	private int[] que;
	private int capa;
	
	public MyQueue(int capa) {
//		this.front = 0;
		this.front = -1;
		this.rear = -1;
		this.capa = capa;
		que = new int[capa];
	}
	
	public void enQueue(int element) {
		que[++rear] = element; 
	}
	
	public int deQueue() {
//		return que[front++];
		return que[++front];
	}
	
	public int peek() {
//		return que[front];
		return que[front+1];
	}
	
	public void clear() {
//		front = 0;
		front = -1;
		rear = -1;
	}
	
	public int capacity() {
		return capa;
	}
	
	public boolean isEmpty() {
//		return front - 1 == rear ? true : false;
		return front == rear ? true : false;
	}
	
	public boolean isFull() {
		return rear == capacity() - 1 ? true : false;
	}
	
	public void dump() {
		System.out.println("���� �޼ҵ� ȣ����");
		for(int i = 0; i <= rear; i++) {
			System.out.printf("que[%d] = %d\n", i, que[i]);
		}
	}
}

public class MyQueueEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("ť�� ũ�⸦ �Է��Ͻÿ� >> ");
		int capa = scan.nextInt();
		MyQueue mq = new MyQueue(capa); // ���� ť ����
		
		do {
			int rd = rand.nextInt(100)+1;
			mq.enQueue(rd);
			System.out.printf("%d�� ť�� ����\n", rd);
		} while (!mq.isFull());
		
		
		System.out.printf("����Ʈ ��ġ�� �� ������ �� : %d\n", mq.peek());
		
		mq.dump(); // �Էµ� ������� ���
		
		// deQueue ȣ��
		for(int i = 0; i < mq.capacity(); i++) {
			System.out.printf("%d��° ��ť�� ��: %d\n", i+1, mq.deQueue());
		}
	}

}
