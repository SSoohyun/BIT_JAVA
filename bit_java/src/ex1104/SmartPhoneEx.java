package ex1104;

interface MyButton {
	void click();
}

public class SmartPhoneEx {

	public static void main(String[] args) {
		// ��ȭ�� �͸� ���� ��ü ����
		MyButton btnCall = new MyButton() {
			
			@Override
			public void click() {
				System.out.println("��ȭ��ư�� ������");
				
			}
		};
		btnCall.click();
		
		// ��ȭ ����� �͸� ���� ��ü ����
		MyButton btnStop = new MyButton() {
			
			@Override
			public void click() {
				System.out.println("��ȭ�����ư�� ������");
				
			}
		};
		btnStop.click();

	}

}
