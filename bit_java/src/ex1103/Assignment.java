package ex1103;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0; // 메뉴 번호
		
		BREAK: // 프로그램 종료 시 무한루프를 탈출
		while(true) {
			System.out.println("1.도서 정보 입력 | 2.도서 목록 보기 | 3.검색하기(제목) | "
								+ "4.수량정보(여성작가수량/보유도서수량) | 5.프로그램 종료");
			menu = scan.nextInt();
			
			// 메뉴 선택에 따라
			switch(menu) {
			case 1: // 도서 정보 입력
				System.out.println("책 제목, 저자, 이메일, 성별, 가격, 수량 순으로 입력하시오 -->>");
				// 배열에 저장
				break;
			case 2: // 도서 목록 보기 --> 저장된 내용 불러와서 출력
				break;
			case 3: // 검색하기
				System.out.print("제목을 입력하세요 -->>");
				// 배열에서 책 제목과 일치하는 요소 정보 출력
				break;
			case 4: // 수량정보(여성작가수량/보유도서수량)
				break;
			case 5: // 프로그램 종료
				break BREAK; // 루프 탈출
			}
		}
		
	}

}
