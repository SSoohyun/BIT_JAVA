package ex1103;

class CurrencyConverter {
	private static double rate; // 한국 원화에 대한 환율
	
	// 한국 원화를 달러로 변환
	public static double toDollar(double won) {
		return won/rate;
	}
	
	// 달러를 한국 원화로 변환
	public static double toKWR(double dollar) {
		return dollar*rate;
	}
	
	// 환율 설정, KWR/$1
	public static void setRate(double r) {
		rate = r;
	}
	
}

public class CurrencyConverterEx {

	public static void main(String[] args) {
		CurrencyConverter.setRate(1180.30); // 환율 = 1180.30
		
		System.out.printf("백만원은 %.2f달러 입니다.\n", CurrencyConverter.toDollar(1000000));
		System.out.printf("백달러는 %.2f달러 입니다.\n", CurrencyConverter.toKWR(100));
	}

}
