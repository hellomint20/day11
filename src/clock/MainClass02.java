package clock;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass02 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		SimpleDateFormat simple = 
				new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String date = simple.format(time);
		System.out.println(date);
		
		System.out.println("===============================");
		Date d = new Date();
		System.out.println(d);
		date = simple.format(d);
		System.out.println(date);
	}
}
