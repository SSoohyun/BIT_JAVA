package ex1109;

import java.util.Random;
import java.util.Scanner;

class MyCircularQueue {
	public int front;
	public int rear;
	public int[] que;
	public int capa;

	public MyCircularQueue(int capa) {
		this.front = 0;
		this.rear = 0;
		this.capa = capa;
		que = new int[capa];
	}

	public void enQueue(int element) {
		que[(++rear) % capacity()] = element;
	}

	public int deQueue() {
		return que[(++front) % capacity()];
	}

	public int peek() {
		return que[(front + 1) % capacity()];
	}

	public void clear() {
		front = 0;
		rear = 0;
	}

	public int capacity() {
		return capa;
	}

	public boolean isEmpty() {
		return front % capacity() == rear % capacity() ? true : false;
	}

	public boolean isFull() {
		return (rear + 1) % capacity() == front % capacity() ? true : false;
	}

	public void dump() {
		System.out.println("���� �޼ҵ� ȣ����");
		if((front + 1) % capacity() <= rear % capacity()) {
			for (int i = (front + 1) % capacity(); i <= rear % capacity(); i++) {
				System.out.printf("que[%d] = %d\n", i, que[i]);
			}
		} else {
			for (int i = (front + 1) % capacity(); i <= rear % capacity() + capacity(); i++) {
				if (i >= capacity()) {
					System.out.printf("que[%d] = %d\n", i%capacity(), que[i%capacity()]);
				} else {
					System.out.printf("que[%d] = %d\n", i, que[i]);
				}		
			}
		}
	}
}

public class MyCircularQueueEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("ť�� ũ�⸦ �Է��Ͻÿ� >> ");
		int capa = scan.nextInt();
		MyCircularQueue mcq = new MyCircularQueue(capa); // ���� ť ����

		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d�� ť�� ����\n", rd);
		} while (!mcq.isFull());

		System.out.printf("����Ʈ ��ġ�� �� ������ �� : %d\n", mcq.peek());

		mcq.dump(); // �Էµ� ������� ���

		System.out.println("����� �����͸� ��� ��ť��");
		// deQueue ȣ��
		int j = 1;
		for (int i = (mcq.front + 1) % mcq.capacity(); i < mcq.capacity(); i++) {
			System.out.printf("%d�� ť���� ������\n", mcq.peek());
			System.out.printf("%d��° ��ť�� ��: %d\n", j, mcq.deQueue());
			j++;
		}

		if (mcq.isEmpty()) {
			System.out.println("ť�� ��� ����");
		}

		System.out.println("ť�� ������ ������ �����͸� ��ť��");
		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d�� ť�� ����\n", rd);
		} while (!mcq.isFull());

		System.out.printf("���� ����Ʈ�� �ε��� : %d\n", mcq.front % mcq.capacity());

		mcq.dump(); // �Էµ� ������� ���

		j = 1;
		for (int i = (mcq.front + 1) % mcq.capacity(); i < 2; i++) {
			System.out.printf("%d�� ť���� ������\n", mcq.peek());
			System.out.printf("%d��° ��ť�� ��: %d\n", j, mcq.deQueue());
			j++;
		}

		System.out.printf("���� ����Ʈ�� �ε��� : %d\n", mcq.front % mcq.capacity());

		System.out.println("ť�� ������ ������ �����͸� ��ť��");
		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d�� ť�� ����\n", rd);
		} while (!mcq.isFull());

		System.out.printf("���� ����Ʈ�� �ε��� : %d\n", mcq.front % mcq.capacity());

		mcq.dump(); // �Էµ� ������� ���
	}

}
