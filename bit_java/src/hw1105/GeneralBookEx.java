package hw1105;

import javax.lang.model.element.VariableElement;

interface GeneralBook {
	int size(); // ����� ������ ���� ��ȯ
	String names(); // �̸��� ������ �迭�� ���ڿ��� ���� �� ��ȯ
	String records(); // ����� ������ �迭�� ���ڿ��� ���� �� ��ȯ
	boolean nameExist(String name); // �̸��� ������ true, ������ false
	void add(String name, String record); // �̸��� ����� �߰�(�̸� �������� �������� �߰�), �̸��� �����ϸ� �߰�x --> �޽��� ���
	void remove(String name, String record); // �̸��� ����� ����, �̸��� ������ �޽��� ���
	String get(String name); // �̸��� ¦�� ����� ��ȯ
//	String find(String record); // ��ϰ� ¦�� �̸��� ��ȯ
	String[] find(String record);
	void print(); // �̸��� ����� ���(�̸��� �������� �������� ����)
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
		return names.length; // ������ ����
	}

	@Override
	public String names() {
		String n_list = "";
		for(String nm : names) {
			n_list += nm + " ";
		}
		
		return n_list; // �̸� ���ڿ�
	}

	@Override
	public String records() {
		String r_list = "";
		for(String rc : records) {
			r_list += rc + " ";
		}
		
		return r_list; // ��� ���ڿ�
	}

	@Override
	public boolean nameExist(String name) {
		for(String nm : names) {
			if(nm.equals(name)) {
				return true; // �̸��� ����
			}
		}
		return false;
	}

	@Override
	public void add(String name, String record) {
		// �̸��� ��Ͽ� ���� ���纻 ����
		String[] c_names = names;
		String[] c_records = records;
		
		boolean flag = true; // �̸��� ���� ����
				
		// �̸� ���� ���� Ȯ��
		for(int i=0; i<names.length; i++) {
			if(names[i].equals(name)) { 
				flag = false;
				System.out.println("�̹� �����ϴ� �̸��Դϴ�. �߰��� �� �����ϴ�!");
				break;
			}
		}
		
		if(flag) { // �Է� �� �߰� �� �������� ����
			
			// �� �߰��� ���� �̸��� ��� �迭 �����
			names = new String[names.length+1];
			records = new String[records.length+1];
			
			// ���� �迭�� �� ����
			for(int i=0; i<c_names.length; i++) {
				names[i] = c_names[i];
				records[i] = c_records[i];
			}
				
			// �Է� �� ����
			names[names.length-1] = name;
			records[records.length-1] = record;
			
			// �̸��� �������� �������� ����
			int i, j;
			for(i=1; i<names.length; i++) {
				String tmp1 = names[i];
				String tmp2 = records[i];
				for(j=i-1; j>=0 && tmp1.compareTo(names[j]) < 0; j--) { // ������ ������ �;� ��
					names[j+1] = names[j]; // ���� ���Ҹ� �ڷ� �̷�
					records[j+1] = records[j];
				}
				names[j+1] = tmp1;
				records[j+1] = tmp2;
			}
		}
	}

	@Override
	public void remove(String name, String record) {
		// �̸��� ��Ͽ� ���� ���纻 ����
		String[] c_names = names;
		String[] c_records = records;
		
		boolean flag = true; // �̸��� ���� ����
		
		// �̸� ���� ���� Ȯ��
		for(int i=0; i<c_names.length; i++) {
			if(c_names[i].equals(name)) {
				flag = false;
				// �̸��� �����ϸ� ���� ������ �ϳ��� ����(�׷��� ������ ��Ұ��� ������ ����)
				for(int j=i+1; j<c_names.length; j++) {
					c_names[j-1] = c_names[j];
					c_records[j-1] = c_records[j];
				}
				break;
			}
		}
		
		if(flag) { // �̸� ����
			System.out.println("�������� �ʴ� �̸��Դϴ�. ������ �� �����ϴ�!");
		} else {
			// �� ������ ���� �̸��� ��� �迭 �����
			names = new String[names.length-1];
			records = new String[records.length-1];

			// ���纻���� ������ ��Ұ��� �����ϰ� ����
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
				return records[i]; // �̸��� ¦�� ���
			}
		}
		return null;
	}

//	@Override
//	public String find(String record) {
//		for(int i=0; i<records.length; i++) {
//			if(records[i].equals(record)) {
//				return names[i]; // ��ϰ� ¦�� �̸�
//			}
//		}
//		return null;
//	}
	
	// find�޼ҵ带 �迭�� ���� ����� �ߺ��� �̸��� ���
	public String[] find(String record) {
		int count = 0; // �ߺ� �̸� ���� ���� ����
		int st = 0; // �ε����� ����
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
		// �̸� �������� �������� ����
		int i, j;
		for (i=1; i<names.length; i++) {
			String tmp1 = names[i];
			String tmp2 = records[i];
			for (j=i-1; j>=0 && tmp1.compareTo(names[j]) < 0; j--) { // ������ ������ �;� ��
				names[j+1] = names[j]; // ���� ���Ҹ� �ڷ� �̷�
				records[j+1] = records[j];
			}
			names[j+1] = tmp1;
			records[j+1] = tmp2;
		}
		
		// ���
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
		
		System.out.println("���� ����� �������� ũ��: " + gb.size());
		gb.add("Alex", "4444");
		System.out.println("���� ����� �������� ũ��: " + gb.size());
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
