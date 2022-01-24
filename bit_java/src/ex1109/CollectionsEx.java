package ex1109;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsEx {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0, "터미네이터");
		myList.add(2, "아바타");
		
		for (String str : myList) {
			System.out.printf("%s ", str);
		}
		System.out.println();
		
		// 정렬 후 출력
		Collections.sort(myList);
		for (String str : myList) {
			System.out.printf("%s ", str);
		}
		System.out.println();
		
		// 역정렬 후 출력
		Collections.reverse(myList);
		for (String str : myList) {
			System.out.printf("%s ", str);
		}
	}
}
