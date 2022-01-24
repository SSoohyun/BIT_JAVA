package ex1109;

import java.util.HashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		/*
//		Map<String, String> map = new HashMap<String, String>(); // key, value가 한 쌍
		Map<String, String> map = new TreeMap<String, String>(); // key, value가 한 쌍, put한 순서대로 저장
		map.put("apple", "사과");
		map.put("orange", "오렌지");
		map.put("strawberry", "딸기");
		
//		System.out.println(map.get("apple"));
//		System.out.println(map.get("orange"));
//		System.out.println(map.get("strawberry"));
		
		Set<String> set = map.keySet(); // key가 String 타입, set에 key가 저장됨
		for(String str : set) {
			System.out.println(str + " : " + map.get(str)); // 맵에서 키를 이용해서 값을 검색
		}
		
		for (String str : map.values()) {
			System.out.println(str);
		}
		*/
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();
//		map.put(1, "바나나");
//		map.put(2, "사과");
//		map.put(3, "오렌지");
//		
//		map.put(1, "포도"); // 키 중복
//		for (Map.Entry m : map.entrySet()) {
//			System.out.println(m.getKey() +  " " + m.getValue());
//		}
		/*
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "바나나");
		map.put(2, "사과");
		map.put(3, "오렌지");
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() +  " " + m.getValue());
		}
		map.remove(1); // 키가 1인 데이터 삭제
		
		System.out.println("삭제 후 --------");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		*/
		
		// 예제
		Map<String, Integer> m = new HashMap<String, Integer>();
		String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};
		for (String a : sample) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}
		
		System.out.println(m.size() + "단어가 있습니다.");
		System.out.println(m.containsKey("to"));
		System.out.println(m.isEmpty());
		System.out.println(m);
	}

}
