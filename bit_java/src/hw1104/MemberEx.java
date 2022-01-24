package hw1104;

import java.util.Scanner;

class Member {
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name, String phoneNo, String addr) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.addr = addr;
	}

	@Override
	public String toString() {
		return String.format("%s %s %s", getName(), getPhoneNo(), getAddr());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}


public class MemberEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // �޴� ��ȣ
		
		Member[] m = new Member[10]; // ��ü �迭 ����
		int memNum=0; // ��� ��
		
		BREAK: // ���α׷� ���� �� ���ѷ����� Ż��
		while(true) {
			System.out.println("========================================================================");
			System.out.println("1.��ȭ��ȣ �߰� 2.��ȭ��ȣ ��ȸ 3.��ȭ��ȣ ���� 4.��ȭ��ȣ ��� 5.���α׷� ����");
			System.out.println("========================================================================");
			System.out.print("�޴��� �����ϼ���>> ");
			menu = scan.nextInt();
			
			// �޴� ���ÿ� ����
			switch(menu) {
			case 1: // ��ȭ��ȣ �߰�
				System.out.println("�̸�, ��ȭ��ȣ, �ּ� ������ �Է��ϼ���");
				// �迭�� ����
				m[memNum] = new Member(scan.next(), scan.next(), scan.next());
				memNum++;
				break;
			case 2: // ��ȭ��ȣ ��ȸ --> �˻�
				System.out.print("��ȸ�� ȸ���� �̸��� �Է��ϼ���>> ");
				String name1 = scan.next();
				int flag1 = 0;
				for(int i=0; i<memNum; i++) {
					if(name1.equals(m[i].getName())) {
						flag1 = 1;
						System.out.println(m[i]);
					}
				}
				if(flag1 == 0) {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				break;
			case 3: // ��ȭ��ȣ ����
				System.out.print("���� ȸ���� �̸��� �Է��ϼ���>> ");
				String name2 = scan.next();
				int flag2 = 0;
				// �迭���� �̸��� ��ġ�ϴ� ��� ����
				for(int i=0; i<memNum; i++) {
					if(name2.equals(m[i].getName())) {
						// ����
						flag2 = 1;
						m[i] = null;
						System.out.println("�ش� ����� �����Ͽ����ϴ�.");
						for(int j=i+1; j>=0; j--) {
							m[i] = m[j];
						}
						memNum--;
						break;
					}
				}
				
				if(flag2 == 0) {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				
				break;
			case 4: // ��ȭ��ȣ ��� --> ����� ���� �ҷ��ͼ� ���
				System.out.printf("��Ͽ� ����� ȸ�� ���� %d���Դϴ�.\n", memNum);
				for(int i=0; i<memNum; i++) {
					System.out.println(m[i]);
				}
				break;
			case 5: // ���α׷� ����
				break BREAK; // ���� Ż��
			}
		}

	}

}
