package singletone;

class TestClass03{	
	
	static TestClass03 t;		//static이면 객체 생성 전에 이미 만들어짐
								//new 로 계속 객체를 생성하면 싱글톤이 아니기 때문에
	private TestClass03() {		//생성자를 private로 만들기
		System.out.println("생성자 실행");
	}
	
	public static TestClass03 getInstance() {		//외부에서 직접 접근X, 내부로 접근
		System.out.println(t + " : test 실행");
		if(t == null)
			t = new TestClass03();
		return t;
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t01 = TestClass03.getInstance();	//static 을 변경 후 접근 가능
		TestClass03 t02 = TestClass03.getInstance();
		TestClass03 t03 = TestClass03.getInstance();
		System.out.println(t01);
		System.out.println(t02);
		System.out.println(t03);
	}
}
