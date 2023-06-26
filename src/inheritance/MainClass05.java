package inheritance;

class Test05{
	public Test05(String s) {
	System.out.println(s+" 부모 생성자");
	}
	public Test05() {
		System.out.println("default 부모 생성자 실행");
	}
}

class TestClass05 extends Test05{
	public TestClass05() {
		//super("1111");
		System.out.println("자식 생성자");
	}
	public TestClass05(String s) {
		super(s);	//무조건 첫 번째 줄에 있어야 오류 안남
		System.out.println(s + " : 자식 생성자");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t01 = new TestClass05();
		TestClass05 t02 = new TestClass05("값 전달");
	}
}
