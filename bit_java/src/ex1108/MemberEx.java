package ex1108;

class Member {
	private String name;
	private String phoneNo;
	private String addr;
	
	public Member(String name, String phoneNo, String addr) {
		this.name = name;
		this.phoneNo = phoneNo;
		this.addr = addr;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s %s", getName(), getPhoneNo(), getAddr());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
}


public class MemberEx {

	public static void main(String[] args) {
		Member[] mArray = { 
				  new Member("conan", "010-1111-1111", "Mirans'")
				, new Member("rose", "010-2222-2222", "Browns'")
				, new Member("miran", "010-3333-3333", "Mirans'") };

		System.out.println("3���� �����͸� ������ ���� ����Ʈ ��� ���");
		for (Member mem : mArray) {
			System.out.println(mem);
		}
		
		
		Member[] tempArray = new Member[mArray.length + 1]; // ������ ���� �� �迭���� �ϳ� �� ū �迭 ����
		for (int i = 0; i < mArray.length; i++) {
			tempArray[i] = mArray[i]; // �ӽ� �迭�� ����
		}
		
		int targetIndex = 0;
		if (targetIndex < mArray.length) {
			for (int i = mArray.length; i >= 0; i--) {
				if (i == targetIndex - 1) { // mArray�� ���̷� i�� ���۵Ǳ� ������ -1
					continue;
				} else if (i > targetIndex) {
					tempArray[i] = mArray[i - 1]; // ���� ��ġ �ڿ� �ִ� ��ҵ��� �ڷ� �̵�
				} else {
					tempArray[i] = mArray[i]; // ���� ��ġ �տ� �ִ� ��ҵ��� �״�� ����
				}
			}
			tempArray[targetIndex] = new Member("kid", "010-4444-4444", "unknown");
		}
		mArray = tempArray;
		
		System.out.println("--------------------------------------------");
		System.out.printf("�ε��� %d�� ��ġ�� Ű�带 ������ �� ���� ����Ʈ ��� ���\n", targetIndex);
		for (Member mem : mArray) {
			System.out.println(mem);
		}
		
		
		tempArray = new Member[mArray.length - 1]; // ������ ���� ���� �迭���� �ϳ� �� ���� �迭 ����
		targetIndex = 2;
		if (targetIndex < mArray.length) {
			for(int i=0; i < mArray.length; i++) {
				if (i == targetIndex) {
					continue;
				} else if (i > targetIndex) {
					tempArray[i-1] = mArray[i];
				} else {
					tempArray[i] = mArray[i];
				}
			}
		}
		mArray = tempArray;
		
		System.out.println("--------------------------------------------");
		System.out.printf("�ε��� %d�� ��ġ�� ��� ������ �� ���� ����Ʈ ��� ���\n", targetIndex);
		for (Member mem : mArray) {
			System.out.println(mem);
		}
	}

}
