package inheritance;

class Calc02{
	public void display() {
		System.out.println("나는 계산기야~~");
	}
}

class Computer02 extends Calc02{
	Calc02 c;
	public Computer02() {
		c = new Calc02();
	}
	public void print() {
		System.out.println("나는 컴퓨터야!!!");
		c.display();
	}
	public void print02() {
		System.out.println("print02");
		display();
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		//Calc02 c = new Calc02();
		//c.display();
		Computer02  com = new Computer02();
		com.print();
		com.print02();
	}
}
