package ex1109;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		/*
//		Map<String, String> map = new HashMap<String, String>(); // key, value�� �� ��
		Map<String, String> map = new TreeMap<String, String>(); // key, value�� �� ��, put�� ������� ����
		map.put("apple", "���");
		map.put("orange", "������");
		map.put("strawberry", "����");
		
//		System.out.println(map.get("apple"));
//		System.out.println(map.get("orange"));
//		System.out.println(map.get("strawberry"));
		
		Set<String> set = map.keySet(); // key�� String Ÿ��, set�� key�� �����
		for(String str : set) {
			System.out.println(str + " : " + map.get(str)); // �ʿ��� Ű�� �̿��ؼ� ���� �˻�
		}
		
		for (String str : map.values()) {
			System.out.println(str);
		}
		*/
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "�ٳ���");
//		map.put(2, "���");
//		map.put(3, "������");
//		
//		map.put(1, "����"); // Ű �ߺ�
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() +  " " + m.getValue());
//		}
		/*
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "�ٳ���");
		map.put(2, "���");
		map.put(3, "������");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		map.remove(1); // Ű�� 1�� ������ ����
		
		System.out.println("���� �� --------");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		*/
		
		// ����
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		
		System.out.println(m.size() + "�ܾ �ֽ��ϴ�.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}
