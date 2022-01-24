package hw1105;

import javax.lang.model.element.VariableElement;

interface GeneralBook {
	int size(); // 저장된 데이터 길이 반환
	String names(); // 이름을 저장한 배열을 문자열로 연결 후 반환
	String records(); // 기록을 저장한 배열을 문자열로 연결 후 반환
	boolean nameExist(String name); // 이름이 있으면 true, 없으면 false
	void add(String name, String record); // 이름과 기록을 추가(이름 기준으로 오름차순 추가), 이름이 존재하면 추가x --> 메시지 출력
	void remove(String name, String record); // 이름과 기록을 삭제, 이름이 없으면 메시지 출력
	String get(String name); // 이름과 짝인 기록을 반환
//	String find(String record); // 기록과 짝인 이름을 반환
	String[] find(String record);
	void print(); // 이름과 기록을 출력(이름을 기준으로 오름차순 정렬)
}

class ArrayedGeneralBook implements GeneralBook {
	private String[] names;
	private String[] records;
	
	public ArrayedGeneralBook(String[] names, String[] records) {
		super();
		this.names = names;
		this.records = records;
	}

	@Override
	public int size() {
		return names.length; // 데이터 길이
	}

	@Override
	public String names() {
		String n_list = "";
		for(String nm : names) {
			n_list += nm + " ";
		}
		
		return n_list; // 이름 문자열
	}

	@Override
	public String records() {
		String r_list = "";
		for(String rc : records) {
			r_list += rc + " ";
		}
		
		return r_list; // 기록 문자열
	}

	@Override
	public boolean nameExist(String name) {
		for(String nm : names) {
			if(nm.equals(name)) {
				return true; // 이름이 존재
			}
		}
		return false;
	}

	@Override
	public void add(String name, String record) {
		// 이름과 기록에 대한 복사본 생성
		String[] c_names = names;
		String[] c_records = records;
		
		boolean flag = true; // 이름의 존재 여부
				
		// 이름 존재 여부 확인
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(name)) { 
				flag = false;
				System.out.println("이미 존재하는 이름입니다. 추가할 수 없습니다!");
				break;
			}
		}
		
		if(flag) { // 입력 값 추가 후 오름차순 정렬
			
			// 값 추가를 위해 이름과 기록 배열 재생성
			names = new String[names.length+1];
			records = new String[records.length+1];
			
			// 원래 배열로 값 복사
			for(int i=0; i<c_names.length; i++) {
				names[i] = c_names[i];
				records[i] = c_records[i];
			}
				
			// 입력 값 저장
			names[names.length-1] = name;
			records[records.length-1] = record;
			
			// 이름을 기준으로 오름차순 정렬
			int i, j;
			for(i=1; i<names.length; i++) {
				String tmp1 = names[i];
				String tmp2 = records[i];
				for(j=i-1; j>=0 && tmp1.compareTo(names[j]) < 0; j--) { // 음수면 앞으로 와야 함
					names[j+1] = names[j]; // 이전 원소를 뒤로 미룸
					records[j+1] = records[j];
				}
				names[j+1] = tmp1;
				records[j+1] = tmp2;
			}
		}
	}

	@Override
	public void remove(String name, String record) {
		// 이름과 기록에 대한 복사본 생성
		String[] c_names = names;
		String[] c_records = records;
		
		boolean flag = true; // 이름의 존재 여부
		
		// 이름 존재 여부 확인
		for(int i=0; i<c_names.length; i++) {
			if(c_names[i].equals(name)) {
				flag = false;
				// 이름이 존재하면 값을 앞으로 하나씩 땡김(그러나 마지막 요소값은 여전히 존재)
				for(int j=i+1; j<c_names.length; j++) {
					c_names[j-1] = c_names[j];
					c_records[j-1] = c_records[j];
				}
				break;
			}
		}
		
		if(flag) { // 이름 없음
			System.out.println("존재하지 않는 이름입니다. 삭제할 수 없습니다!");
		} else {
			// 값 삭제를 위해 이름과 기록 배열 재생성
			names = new String[names.length-1];
			records = new String[records.length-1];

			// 복사본에서 마지막 요소값을 제외하고 복사
			for (int i=0; i<names.length; i++) {
				names[i] = c_names[i];
				records[i] = c_records[i];
			}
		}
	}

	@Override
	public String get(String name) {
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(name)) {
				return records[i]; // 이름과 짝인 기록
			}
		}
		return null;
	}

//	@Override
//	public String find(String record) {
//		for(int i=0; i<records.length; i++) {
//			if(records[i].equals(record)) {
//				return names[i]; // 기록과 짝인 이름
//			}
//		}
//		return null;
//	}
	
	// find메소드를 배열로 만들어서 기록이 중복된 이름을 출력
	public String[] find(String record) {
		int count = 0; // 중복 이름 개수 세는 변수
		int st = 0; // 인덱스용 변수
		for(int i=0; i<records.length; i++) {
			if(records[i].equals(record)) {
				count++;
			}
		}
		
		String[] dup = new String[count];
		for(int i=0; i<records.length; i++) {
			if(records[i].equals(record)) {
				dup[st] = names[i];
				st++;
			}
		}
		return dup;
	}
	
	@Override
	public void print() {
		// 이름 기준으로 오름차순 정렬
		int i, j;
		for (i=1; i<names.length; i++) {
			String tmp1 = names[i];
			String tmp2 = records[i];
			for (j=i-1; j>=0 && tmp1.compareTo(names[j]) < 0; j--) { // 음수면 앞으로 와야 함
				names[j+1] = names[j]; // 이전 원소를 뒤로 미룸
				records[j+1] = records[j];
			}
			names[j+1] = tmp1;
			records[j+1] = tmp2;
		}
		
		// 출력
		for(i=0; i<names.length; i++) {
			System.out.printf("%s %s\n", names[i], records[i]);
		}
	}
}

public class GeneralBookEx {

	public static void main(String[] args) {
		String[] names = {"Sam", "Rhee", "Kim"};
		String[] records = {"4444", "2222", "3333"};
		ArrayedGeneralBook gb = new ArrayedGeneralBook(names, records);
		System.out.println(gb.names());
		
		gb.add("Allan", "4444");
		gb.print();
		
		System.out.println("현재 저장된 데이터의 크기: " + gb.size());
		gb.add("Alex", "4444");
		System.out.println("현재 저장된 데이터의 크기: " + gb.size());
		gb.print();
		
		System.out.println(gb.nameExist("Alex"));
		gb.remove("Alex", "5555");
//		gb.remove("Sam", "1111");
		gb.print();
		
		String[] foundName = gb.find("4444");
		for(int i=0; i<foundName.length; i++) {
			System.out.println(foundName[i]);
		}
		
//		System.out.println();
//		gb.remove("Soo", "1111");
//		gb.add("Allan", "1111");
//		gb.print();
//		String foundRecord = gb.find("3333");
//		System.out.println(foundRecord);
	}

}
