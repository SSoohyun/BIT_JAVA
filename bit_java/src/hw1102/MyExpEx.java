package hw1102;

class MyExp {
	public int base; // 关
	public int exp; // 瘤荐
	
	// 芭奠力蚌 拌魂
	public int getValue() { 
		int sum = 1;
		for(int i=0; i<exp; i++) {
			 sum *= base;
		}
		return sum;
	}
}

public class MyExpEx {

	public static void main(String[] args) {
		MyExp me1 = new MyExp(); // 按眉 积己
		me1.base = 2;
		me1.exp = 3;
		
		MyExp me2 = new MyExp(); // 按眉 积己
		me2.base = 3;
		me2.exp = 4;
		
		// 免仿
		System.out.printf("%d狼 %d铰 = %d\n", me1.base, me1.exp, me1.getValue());
		System.out.printf("%d狼 %d铰 = %d\n", me2.base, me2.exp, me2.getValue());
		
	}

}
