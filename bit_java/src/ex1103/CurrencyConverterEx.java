package ex1103;

class CurrencyConverter {
	private static double rate; // �ѱ� ��ȭ�� ���� ȯ��
	
	// �ѱ� ��ȭ�� �޷��� ��ȯ
	public static double toDollar(double won) {
		return won/rate;
	}
	
	// �޷��� �ѱ� ��ȭ�� ��ȯ
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	
	// ȯ�� ����, KWR/$1
	public static void setRate(double r) {
		rate = r;
	}
	
}

public class CurrencyConverterEx {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1180.30); // ȯ�� = 1180.30
		
		System.out.printf("�鸸���� %.2f�޷� �Դϴ�.\n", CurrencyConverter.toDollar(1000000));
		System.out.printf("��޷��� %.2f�޷� �Դϴ�.\n", CurrencyConverter.toKWR(100));
	}

}
