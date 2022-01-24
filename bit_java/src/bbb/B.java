package bbb;

import aaa.A;

public class B extends A {	
	// -: private, +: public, #: protected, ~:default(package friendly)
	// public > protected > default > private
	
	void set() {
//		def = 1; // 다른 패키지에 있어서 접근 불가
		pro = 2;
//		pri = 3; // 프라이빗이라 볼 수 없음
		pub = 4;
	}
	
} // B의 끝
