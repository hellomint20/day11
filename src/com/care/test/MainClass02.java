package com.care.test;

//import com.java.util.Test01;
//import com.java.util.Test02;
import com.java.util.*;		//모든 class를 다 가져오겠다는 의미

public class MainClass02 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		t.test();
		//test2 와 A01 은 default 이기 때문에 같은 패키지에서만 사용 가능
		
		Test02 t02 = new Test02();
		t02.test();
	}
}
