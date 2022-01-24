package ex1104;

public class WrapperEx {

	public static void main(String[] args) {
		// Wrapper
		/*
		Integer i = new Integer(10);
		Integer num = 10;
		System.out.println(num.toString());
		System.out.println(Integer.parseInt("100"));
		*/
		
		// ¿¹Á¦
		Integer i = new Integer(10);
		char c = '4';
		Double d = new Double(3.1234566);
		System.out.println(Character.toLowerCase('A'));
		if(Character.isDigit(c)) {
			System.out.println(Character.getNumericValue(c));
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.parseInt("10", 16));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.bitCount(28));
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
	}

}
