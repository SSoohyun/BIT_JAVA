package ex1103;

class DefaultConstructor {

	int x; // ����: 0���� �ʱ�ȭ
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public DefaultConstructor() {} // �����Ϸ��� �ڵ����� ����(� �����ڵ� �������� ���� ����)
	
	public DefaultConstructor(int x) {
		this.x = x;
	}
	
	
	
	public static void main(String[] args) {
		
		DefaultConstructor p = new DefaultConstructor(); // ��ü ����
		
		// �ʵ���� ������ ��� 0���� �ʱ�ȭ
		System.out.println("�� �ϱ� �� " + p.getX());
		System.out.println("�� �ϱ� �� " + p.x);
		
		p.setX(3);
		System.out.println("�� �� ���� " + p.getX());

	}

}
