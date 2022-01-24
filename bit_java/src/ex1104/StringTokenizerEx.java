package ex1104;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		
		// StringÀÇ split
//		String[] strArray = "This is my pencil".split(" ");
//		for(int i=0; i<strArray.length; i++) {
//			System.out.println(strArray[i]);
//		}
				
		
//		StringTokenizer st = new StringTokenizer("name=conan&addr=miran's&age=10", "&=");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		// ¿¹Á¦
		StringTokenizer st = new StringTokenizer("È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã", "/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String[] strArray = "È«±æµ¿/ÀåÈ­/È«·Ã/ÄáÁã/ÆÏÁã".split("/");
		for(String s : strArray) {
			System.out.println(s);
		}

	}

}
