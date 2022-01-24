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

		System.out.println("3명의 데이터를 저장한 다음 리스트 출력 결과");
		for (Member mem : mArray) {
			System.out.println(mem);
		}
		
		
		Member[] tempArray = new Member[mArray.length + 1]; // 삽입을 위해 원 배열보다 하나 더 큰 배열 생성
		for (int i = 0; i < mArray.length; i++) {
			tempArray[i] = mArray[i]; // 임시 배열에 복사
		}
		
		int targetIndex = 0;
		if (targetIndex < mArray.length) {
			for (int i = mArray.length; i >= 0; i--) {
				if (i == targetIndex - 1) { // mArray의 길이로 i가 시작되기 때문에 -1
					continue;
				} else if (i > targetIndex) {
					tempArray[i] = mArray[i - 1]; // 삽입 위치 뒤에 있는 요소들을 뒤로 이동
				} else {
					tempArray[i] = mArray[i]; // 삽입 위치 앞에 있는 요소들은 그대로 복사
				}
			}
			tempArray[targetIndex] = new Member("kid", "010-4444-4444", "unknown");
		}
		mArray = tempArray;
		
		System.out.println("--------------------------------------------");
		System.out.printf("인덱스 %d의 위치에 키드를 삽입을 한 다음 리스트 출력 결과\n", targetIndex);
		for (Member mem : mArray) {
			System.out.println(mem);
		}
		
		
		tempArray = new Member[mArray.length - 1]; // 삭제를 위해 원래 배열보다 하나 더 작은 배열 생성
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
		System.out.printf("인덱스 %d의 위치에 로즈를 삭제를 한 다음 리스트 출력 결과\n", targetIndex);
		for (Member mem : mArray) {
			System.out.println(mem);
		}
	}

}
