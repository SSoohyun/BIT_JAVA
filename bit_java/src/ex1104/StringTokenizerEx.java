package ex1104;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// String�� split
//		String[] strArray = "This is my pencil".split(" ");
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
				
		
//		StringTokenizer st = new StringTokenizer("name=conan&addr=miran's&age=10", "&=");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		// ����
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String[] strArray = "ȫ�浿/��ȭ/ȫ��/����/����".split("/");
		for(String s : strArray) {
			System.out.println(s);
		}

	}

}
