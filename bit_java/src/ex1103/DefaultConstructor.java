package ex1103;

class DefaultConstructor {

	int x; // 정수: 0으로 초기화
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public DefaultConstructor() {} // 컴파일러가 자동으로 생성(어떤 생성자도 존재하지 않을 때만)
	
	public DefaultConstructor(int x) {
		this.x = x;
	}
	
	
	
	public static void main(String[] args) {
		
		DefaultConstructor p = new DefaultConstructor(); // 객체 생성
		
		// 필드들이 정수인 경우 0으로 초기화
		System.out.println("셋 하기 전 " + p.getX());
		System.out.println("셋 하기 전 " + p.x);
		
		p.setX(3);
		System.out.println("셋 한 다음 " + p.getX());

	}

}
