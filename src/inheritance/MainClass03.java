package inheritance;

class Test03{
	public Test03() {
		System.out.println("부모 생성자 실행");
	}
}

class TestClass03 extends Test03{
	public TestClass03() {
		System.out.println("자식 생성자 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t = new TestClass03();
	}
}
