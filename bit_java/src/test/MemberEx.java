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
		int menu = 0; // 메뉴 번호
		boolean readFlag = true;
		
		// 컬렉션 선언
		ArrayList<Member> memberList = new ArrayList<Member>();
		

		BREAK: // 프로그램 종료 시 무한루프를 탈출
		while (true) {
			System.out.println("===============================================================================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.연락처 파일로 저장 6.종료");
			System.out.println("===============================================================================================");
			
			System.out.print("메뉴를 선택하세요 >> ");
			menu = scan.nextInt();

			// 메뉴 선택에 따라
			switch (menu) {
			case 1: // 전화번호 추가
				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				// 저장
				memberList.add(new Member(scan.next(), scan.next(), scan.next()));
				break;
			case 2: // 전화번호 조회
				System.out.print("조회할 회원의 이름을 입력하세요 >> ");
				String name = scan.next();
				boolean flag = true;
				
				// 출력
				for (Member m : memberList) {
					if (m.getName().equals(name)) {
						flag = false;
						System.out.println(m);
					}
				}
				
				// 일치하는 이름이 없으면 출력
				if (flag) {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			case 3: // 전화번호 삭제
				System.out.print("삭제 회원의 이름을 입력하세요>> ");
				String name2 = scan.next();
				boolean flag2 = true;
				
				for(int i=0; i < memberList.size(); i++) {
					if (memberList.get(i).getName().equals(name2)) {
						flag2 = false;
						memberList.remove(i);
						System.out.println("해당 멤버를 삭제하였습니다.");
						break;
					}
				}
				
				// 일치하는 이름이 없으면 출력
				if (flag2) {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			case 4: // 전화번호 목록
				
				// 1. 파일 여부 체크 -> 파일 있으면 파일 내용 출력 -> 파일 없으면 memberList 확인해서 출력
				// 재실행 시 파일이 있다면 파일 내용 출력
				// 재실행 시 파일이 없으면 
				
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
//					System.out.println("파일 삭제됨");
//				} else {
//					System.out.println("안됨");
//				}
				
				System.out.printf("목록에 저장된 회원 수는 %d명입니다.\n", memberList.size());
				// 모두 출력
				for(Member m : memberList) {
					System.out.println(m);
				}
				
				break;
			case 5: // 연락처 파일로 저장
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
			case 6: // 프로그램 종료
				System.out.println("프로그램이 종료되었습니다.");
				break BREAK; // 루프 탈출
			}
		}
	}

}
