package singletone;

/*
싱글톤
 - 하나의 객체를 공유하는 것.
 */
class TestClass01{
	int num;
	static int cnt;		//한 번만 만들어지고 계속 존재함
	public TestClass01() {
		cnt++;
		System.out.println(cnt+"객체 생성");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t01 = new TestClass01();
		TestClass01 t02 = new TestClass01();
		TestClass01 t03 = new TestClass01();
		
		t01.num =100; t02.num = 200; t03.num = 300;
		
		System.out.println(t01 + " : "+t01.num);
		System.out.println(t02 + " : "+t02.num);
		System.out.println(t03 + " : "+t03.num);
	}
}