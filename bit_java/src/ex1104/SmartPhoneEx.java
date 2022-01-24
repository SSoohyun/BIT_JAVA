package ex1104;

interface MyButton {
	void click();
}

public class SmartPhoneEx {

	public static void main(String[] args) {
		// 통화용 익명 구현 객체 생성
		MyButton btnCall = new MyButton() {
			
			@Override
			public void click() {
				System.out.println("통화버튼이 눌렸음");
				
			}
		};
		btnCall.click();
		
		// 통화 종료용 익명 구현 객체 생성
		MyButton btnStop = new MyButton() {
			
			@Override
			public void click() {
				System.out.println("통화종료버튼이 눌렸음");
				
			}
		};
		btnStop.click();

	}

}
