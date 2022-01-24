package ex1102;

public class StringEx {

	public static void main(String[] args) {
		/*
		String a = "Hello";
		String b = "Java";
		String c = "Hello";
		String d = new String("Hello");
		String e = new String("Java");
		String f = new String("Java");

		System.out.println(a==c); // true
		System.out.println(a==d); // false
		System.out.println(a.equals(d)); // true
		System.out.println(d.equals(a)); // true
		
		System.out.println("a".equals("b")); // false
		System.out.println("a".equals("a")); // true
		System.out.println("a".compareTo("b")); // -1 --> a가 b보다 한 자리 앞
		System.out.println("b".compareTo("a")); // 1 --> b가 a보다 한 자리 뒤
		System.out.println("a".compareTo("a")); // 0
		*/
		
//		String a = "java";
//		String b = "jasa";
//		int res = a.compareTo(b);
//		if(res == 0) {
//			System.out.println("the same");
//		} else if(res < 0) {
//			System.out.println(a + "<" + b);
//		} else {
//			System.out.println(a + ">" + b);
//		}
//		
//		String s1 = new String("aaa");
//		String s2 = new String("bbb");
//		s1 = s1.concat(s2);
//		System.out.println(s1);
		
//		String a = " abcd def";
//		String b = "\txyz\t";
//		String c = a.trim();
//		String d = b.trim();
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println("trim 후------------");
//		System.out.println(c);
//		System.out.println(d);
		
//		System.out.println("Hello".charAt(0)); // H
//		System.out.println("Hello".charAt(4)); // o
//		System.out.println("Hello".indexOf('H')); // 0 (인덱스 위치 반환)
//		System.out.println("Hello".indexOf('l', 3)); // 3번 인덱스부터 탐색
		
		
		// "class"에 포함된 's'의 개수 세기
//		int count = 0;
//		String a = "class";
//		for(int i=0; i < a.length(); i++) {
//			if(a.charAt(i) == 's') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		
//		
//		System.out.println("Hello".toLowerCase());
//		System.out.println("Hello".toUpperCase());
		
		
		String a = new String(" abcd");
		String b = new String(",efg");
		
		// 문자열 합치기
		a = a.concat(b);
		System.out.println(a);
		
		// 앞, 뒤 공백 제거
		a = a.trim();
		System.out.println(a);
		
		// 문자열 대치
		a = a.replace("ab", "12");
		System.out.println(a);
		
		// 문자열 분리
		String s[] = a.split(",");
		for(int i=0; i<s.length; i++) {
			System.out.println("분리된 " + i + "번 문자열: " + s[i]);
		}
		
		// 서브 스트링
		a = a.substring(3);
		System.out.println(a);
		
		// 문자열의 문자
		char c = a.charAt(2);
		System.out.println(c);
		
	}

}
