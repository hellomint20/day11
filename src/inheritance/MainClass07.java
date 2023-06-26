package inheritance;

class Test07{
	private int num;		//private 이라도 상속받은 자식 사용 못함
	protected int num2;		//같은 패키지, 상속받은 자식은 사용 가능함
	public void test() {
		System.out.println("부모 test");
	}
}

class TestClass07 extends Test07{
	public void display() {
		num2 = 100;
		System.out.println("display 실행");
		this.test();		//내 지역에 test 먼저 찾은 후, 없으면 부모로 가서 찾음
		//this를 붙임으로써 같은 class 메소드가 실행되는 걸 알 수 있음 (가독성 높임)
		super.test(); 		//부모 class를 사용한다는 걸 알 수 있음 (가독성 높임)
		System.out.println(num2);
	}
	public void test() {
		System.out.println("자식-test");
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		TestClass07 t = new TestClass07();
		t.display();
	}
}
