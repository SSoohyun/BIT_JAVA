package ex1109;

import java.util.Random;
import java.util.Scanner;

// 주석 처리는 front = 0일 때
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
		System.out.println("덤프 메소드 호출함");
		for(int i = 0; i <= rear; i++) {
			System.out.printf("que[%d] = %d\n", i, que[i]);
		}
	}
}

public class MyQueueEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("큐의 크기를 입력하시오 >> ");
		int capa = scan.nextInt();
		MyQueue mq = new MyQueue(capa); // 선형 큐 생성
		
		do {
			int rd = rand.nextInt(100)+1;
			mq.enQueue(rd);
			System.out.printf("%d를 큐에 저장\n", rd);
		} while (!mq.isFull());
		
		
		System.out.printf("프론트 위치의 값 엿보기 중 : %d\n", mq.peek());
		
		mq.dump(); // 입력된 순서대로 출력
		
		// deQueue 호출
		for(int i = 0; i < mq.capacity(); i++) {
			System.out.printf("%d번째 디큐한 값: %d\n", i+1, mq.deQueue());
		}
	}

}
