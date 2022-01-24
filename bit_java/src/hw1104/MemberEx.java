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
		int menu = 0; // 메뉴 번호
		
		Member[] m = new Member[10]; // 객체 배열 생성
		int memNum=0; // 멤버 수
		
		BREAK: // 프로그램 종료 시 무한루프를 탈출
		while(true) {
			System.out.println("========================================================================");
			System.out.println("1.전화번호 추가 2.전화번호 조회 3.전화번호 삭제 4.전화번호 목록 5.프로그램 종료");
			System.out.println("========================================================================");
			System.out.print("메뉴를 선택하세요>> ");
			menu = scan.nextInt();
			
			// 메뉴 선택에 따라
			switch(menu) {
			case 1: // 전화번호 추가
				System.out.println("이름, 전화번호, 주소 순으로 입력하세요");
				// 배열에 저장
				m[memNum] = new Member(scan.next(), scan.next(), scan.next());
				memNum++;
				break;
			case 2: // 전화번호 조회 --> 검색
				System.out.print("조회할 회원의 이름을 입력하세요>> ");
				String name1 = scan.next();
				int flag1 = 0;
				for(int i=0; i<memNum; i++) {
					if(name1.equals(m[i].getName())) {
						flag1 = 1;
						System.out.println(m[i]);
					}
				}
				if(flag1 == 0) {
					System.out.println("존재하지 않는 회원입니다.");
				}
				break;
			case 3: // 전화번호 삭제
				System.out.print("삭제 회원의 이름을 입력하세요>> ");
				String name2 = scan.next();
				int flag2 = 0;
				// 배열에서 이름과 일치하는 멤버 삭제
				for(int i=0; i<memNum; i++) {
					if(name2.equals(m[i].getName())) {
						// 삭제
						flag2 = 1;
						m[i] = null;
						System.out.println("해당 멤버를 삭제하였습니다.");
						for(int j=i+1; j>=0; j--) {
							m[i] = m[j];
						}
						memNum--;
						break;
					}
				}
				
				if(flag2 == 0) {
					System.out.println("존재하지 않는 회원입니다.");
				}
				
				break;
			case 4: // 전화번호 목록 --> 저장된 내용 불러와서 출력
				System.out.printf("목록에 저장된 회원 수는 %d명입니다.\n", memNum);
				for(int i=0; i<memNum; i++) {
					System.out.println(m[i]);
				}
				break;
			case 5: // 프로그램 종료
				break BREAK; // 루프 탈출
			}
		}

	}

}
