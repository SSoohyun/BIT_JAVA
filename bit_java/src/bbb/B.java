package bbb;

import aaa.A;

public class B extends A {	
	// -: private, +: public, #: protected, ~:default(package friendly)
	// public > protected > default > private
	
	void set() {
//		def = 1; // �ٸ� ��Ű���� �־ ���� �Ұ�
		pro = 2;
//		pri = 3; // �����̺��̶� �� �� ����
		pub = 4;
	}
	
} // B�� ��
