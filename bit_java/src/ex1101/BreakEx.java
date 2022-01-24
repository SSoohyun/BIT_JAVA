package ex1101;

public class BreakEx {

	public static void main(String[] args) {
		/*
		int i = 0;
		while(true) { // 반복문 시작
			if(i == 100) {
				break; // 반복문 탈출
				// continue; // next turn으로
			}
			System.out.println(i++);
		} // 반복문 끝
		*/
		
		
		Loops:
			for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==5) {
						// break Loops; // 중첩 반복문 한 번에 탈출
						// break; // 가장 가까운 반복문 탈출
						continue Loops; // 가장 가까운 반복문 탈출
						// continue; // 다음 턴으로
					}
					System.out.println(i + "*" + j + "=" + i*j);
				}
		}
		
	}

}
