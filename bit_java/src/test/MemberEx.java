package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

class Member {
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name, String phoneNo, String addr) {
		super();
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
		boolean readFlag = true;
		
		// �÷��� ����
		ArrayList<Member> memberList = new ArrayList<Member>();
		

		BREAK: // ���α׷� ���� �� ���ѷ����� Ż��
		while (true) {
			System.out.println("===============================================================================================");
			System.out.println("1.��ȭ��ȣ �߰� 2.��ȭ��ȣ ��ȸ 3.��ȭ��ȣ ���� 4.��ȭ��ȣ ��� 5.����ó ���Ϸ� ���� 6.����");
			System.out.println("===============================================================================================");
			
			System.out.print("�޴��� �����ϼ��� >> ");
			menu = scan.nextInt();

			// �޴� ���ÿ� ����
			switch (menu) {
			case 1: // ��ȭ��ȣ �߰�
				System.out.println("�̸�, ��ȭ��ȣ, �ּ� ������ �Է��ϼ���");
				// ����
				memberList.add(new Member(scan.next(), scan.next(), scan.next()));
				break;
			case 2: // ��ȭ��ȣ ��ȸ
				System.out.print("��ȸ�� ȸ���� �̸��� �Է��ϼ��� >> ");
				String name = scan.next();
				boolean flag = true;
				
				// ���
				for (Member m : memberList) {
					if (m.getName().equals(name)) {
						flag = false;
						System.out.println(m);
					}
				}
				
				// ��ġ�ϴ� �̸��� ������ ���
				if (flag) {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				
				break;
			case 3: // ��ȭ��ȣ ����
				System.out.print("���� ȸ���� �̸��� �Է��ϼ���>> ");
				String name2 = scan.next();
				boolean flag2 = true;
				
				for(int i=0; i < memberList.size(); i++) {
					if (memberList.get(i).getName().equals(name2)) {
						flag2 = false;
						memberList.remove(i);
						System.out.println("�ش� ����� �����Ͽ����ϴ�.");
						break;
					}
				}
				
				// ��ġ�ϴ� �̸��� ������ ���
				if (flag2) {
					System.out.println("�������� �ʴ� ȸ���Դϴ�.");
				}
				
				break;
			case 4: // ��ȭ��ȣ ���
				
				// 1. ���� ���� üũ -> ���� ������ ���� ���� ��� -> ���� ������ memberList Ȯ���ؼ� ���
				// ����� �� ������ �ִٸ� ���� ���� ���
				// ����� �� ������ ������ 
				
				FileReader fr = null;
				BufferedReader br = null;
				File file = new File("c:/temp/contact.txt");
				if (file.exists() && readFlag) {
					try {
						fr = new FileReader(file);
						br = new BufferedReader(fr);
						String line = null;
						while ((line = br.readLine()) != null) {
							String[] arr = line.split(" ");
							memberList.add(new Member(arr[0], arr[1], arr[2]));
						}
						readFlag = false;
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}  catch (IOException e) {
						e.printStackTrace();
					}
				}
//				if(file.delete()) {
//					System.out.println("���� ������");
//				} else {
//					System.out.println("�ȵ�");
//				}
				
				System.out.printf("��Ͽ� ����� ȸ�� ���� %d���Դϴ�.\n", memberList.size());
				// ��� ���
				for(Member m : memberList) {
					System.out.println(m);
				}
				
				break;
			case 5: // ����ó ���Ϸ� ����
				PrintWriter pw = null;
				
				try {
					pw = new PrintWriter(new FileWriter("c:/temp/contact.txt"));
					for (Member m : memberList) {
						String line = m.toString();
						pw.println(line);
						pw.flush();
					}
					
 				} catch (IOException e) {
					e.printStackTrace();
				}
					
				break;
			case 6: // ���α׷� ����
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break BREAK; // ���� Ż��
			}
		}
	}

}
