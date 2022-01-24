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
		System.out.println("덤프 메소드 호출함");
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
		System.out.print("큐의 크기를 입력하시오 >> ");
		int capa = scan.nextInt();
		MyCircularQueue mcq = new MyCircularQueue(capa); // 원형 큐 생성

		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d를 큐에 저장\n", rd);
		} while (!mcq.isFull());

		System.out.printf("프론트 위치의 값 엿보기 중 : %d\n", mcq.peek());

		mcq.dump(); // 입력된 순서대로 출력

		System.out.println("저장된 데이터를 모두 디큐함");
		// deQueue 호출
		int j = 1;
		for (int i = (mcq.front + 1) % mcq.capacity(); i < mcq.capacity(); i++) {
			System.out.printf("%d를 큐에서 삭제함\n", mcq.peek());
			System.out.printf("%d번째 디큐한 값: %d\n", j, mcq.deQueue());
			j++;
		}

		if (mcq.isEmpty()) {
			System.out.println("큐가 비어 있음");
		}

		System.out.println("큐가 가득찰 때가지 데이터를 인큐함");
		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d를 큐에 저장\n", rd);
		} while (!mcq.isFull());

		System.out.printf("현재 프론트의 인덱스 : %d\n", mcq.front % mcq.capacity());

		mcq.dump(); // 입력된 순서대로 출력

		j = 1;
		for (int i = (mcq.front + 1) % mcq.capacity(); i < 2; i++) {
			System.out.printf("%d를 큐에서 삭제함\n", mcq.peek());
			System.out.printf("%d번째 디큐한 값: %d\n", j, mcq.deQueue());
			j++;
		}

		System.out.printf("현재 프론트의 인덱스 : %d\n", mcq.front % mcq.capacity());

		System.out.println("큐가 가득찰 때가지 데이터를 인큐함");
		do {
			int rd = rand.nextInt(100) + 1;
			mcq.enQueue(rd);
			System.out.printf("%d를 큐에 저장\n", rd);
		} while (!mcq.isFull());

		System.out.printf("현재 프론트의 인덱스 : %d\n", mcq.front % mcq.capacity());

		mcq.dump(); // 입력된 순서대로 출력
	}

}
