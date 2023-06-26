package inheritance;

import java.util.ArrayList;

/*
상속
- new 연산 없이 특정 클래스의 기능을 사용할 수 있다.
- extend를 통해 상속을 받는다
- 부목 클래스의 특정 기능을 새로운 기능으로 변경하여 사용할 수 있다(overriding)
 */
class TestClass01 extends ArrayList<String>{
	public void test() {
		System.out.println("test 실행");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t = new TestClass01();
		t.test();
		t.add("안녕");
		System.out.println(t.get(0));
	}
}
