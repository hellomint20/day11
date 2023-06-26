package singletone;

class TestClass02{
	int num;
	static int cnt;		
	public TestClass02() {
		cnt++;
		System.out.println(cnt+"객체 생성");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02();
		TestClass02 t02 = t01;	//얕은 복사
		TestClass02 t03 = t02;
		
		t01.num =100; t02.num = 200; t03.num = 300;
		
		System.out.println(t01 + " : "+t01.num);
		System.out.println(t02 + " : "+t02.num);
		System.out.println(t03 + " : "+t03.num);
	}
}
