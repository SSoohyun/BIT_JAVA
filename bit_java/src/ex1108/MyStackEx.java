package ex1108;

import java.util.Random;
import java.util.Scanner;

class MyStack {
	private int tos; // top of stack
	private int[] stk;
	private int capa;
	
	public MyStack(int capa) {
		this.capa = capa;
		this.tos = -1;
		stk = new int[capa];
	}
	
	public void push(int element) {
		stk[++tos] = element;
	}
	
	public int pop() {
		return !isEmpty() ? stk[tos--] : 0;
	}
	
	public int peek() {
		return !isEmpty() ? stk[tos] : 0;
	}
	
	public void clear() {
		tos = -1;
	}
	
	public int capacity() {
		return capa;
	}
	
	public boolean isEmpty() {
		return size() == 0 ? true : false;
//		return tos == -1 ? true : false;
	}
	
	public boolean isFull() {
		return size() == capacity() ? true : false;
	}
	
	public int size() {
		return tos+1;
	}
	
	public void dump() {
		if(!isEmpty()) {
			for(int i=0; i < size(); i++) {
				System.out.printf("stk[%d]: %d\n", i, stk[i]);
			}
		} else {
			System.out.println("������ �����");
		}
		
	}
}

public class MyStackEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		System.out.print("������ ũ�⸦ �Է��ϼ��� >> ");
		int capa = scan.nextInt();
		
		MyStack mystk = new MyStack(capa); //���� ����
		do {
			mystk.push(rand.nextInt(100)+1);
		} while (!mystk.isFull());
		
		mystk.dump(); // �Էµ� ������� ���(�Ųٷ�)
		
//		mystk.clear();
		
//		mystk.dump();
		
		for(int i=0; i < capa; i++) {
			System.out.printf("%d��° ���� ��: %d\n", i+1, mystk.pop());
		}
	}

}
