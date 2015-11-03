import java.util.Random;

public class WK29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int v1, v2, v3, v4;
		int i = rnd.nextInt(1000) + 1;
		v1 = i / 1000;
		i = i % 1000;
		v2 = i / 100;
		i = i % 100;
		v3 = i / 10;
		i = i % 10;
		v4 = i / 1;
		if (v1 >= 1 && v1 <= 9) {
			System.out.println(v1 + "仟" + v2 + "佰" + v3 + "拾" + v4 + "元");
		} else if (v2 >= 1 && v2 <= 9) {
			System.out.println(v2 + "佰" + v3 + "拾" + v4 + "元");
		} else if (v3 >= 1 && v3 <= 9) {
			System.out.println(v3 + "拾" + v4 + "元");
		} else {
			System.out.println(v4 + "元");
		}

	}

}
