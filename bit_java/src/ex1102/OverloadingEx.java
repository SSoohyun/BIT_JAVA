package ex1102;

public class OverloadingEx {

//	public static void main(String[] args) {
//		System.out.println(add(1, 2));
//		System.out.println(add(1, 2, 3));
//		System.out.println(add(1.0, 2.0));		
//		System.out.println(add("aaa", "bbb"));		
//	}
//	
//	// ������ Ÿ�� "�Ǵ�" ���� ������ �ٸ� ��� �ߺ� ����(�����ε�) ����
//	// ��ȯŸ���� ���x
//	public static int add(int x, int y, int z) {
//		return x+y+z;
//	}
//
//	public static int add(int x, int y) {
//		return x+y;
//	}
//	
//	// Ÿ�԰� ������ �Ȱ��Ƽ� �ȵ�
//	/*
//	 * public static double add(int a, int b) { return a+b; }
//	 */
//	
//	public static double add(double x, double y) {
//		return x+y;
//	}
//	
//	public static String add(String x, String y) {
//		return x+y;
//	}
	
	
	// ����
	public static void main(String[] args) {
		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.0, d2 = 3.0;
		System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("max(%d, %d, %d) = %d\n", i1, i2, i3, max(i1, i2, i3));	
	}
	
	public static int max(int n1, int n2) {
		int result = n1 > n2 ? n1: n2;
		return result;
	}
	
	public static double max(double n1, double n2) {
		double result = n1 > n2 ? n1: n2;
		return result;
	}
	
	public static int max(int n1, int n2, int n3) {
		return max(max(n1, n2), n3);
	}
	
}
