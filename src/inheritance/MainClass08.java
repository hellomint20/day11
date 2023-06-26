package inheritance;

class A{
	public void a() {
		System.out.println("aaa");
	}
}

class B extends A{
	public void b() {
		System.out.println("bbb");
	}
}

class C extends B{
	public void c() {
		System.out.println("ccc");
	}
}

public class MainClass08 {
	public static void main(String[] args) {
		C c = new C();
		c.a();
		c.b();
		c.c();
	}
}
