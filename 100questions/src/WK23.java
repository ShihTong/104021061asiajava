import java.util.*;

public class WK23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int a = rnd.nextInt(100) + 1;
		int b = rnd.nextInt(100) + 1;
		int c = rnd.nextInt(100) + 1;
		int m;
		if (a < b) {
			m = a;
			a = b;
			b = m;
		}
		if (a < c) {
			m = a;
			a = c;
			c = m;
		}
		if (b < c) {
			m = b;
			b = c;
			c = m;
		}
		System.out.println("最大值為:" + a);
		System.out.println("最小值為:" + c);
	}

}
