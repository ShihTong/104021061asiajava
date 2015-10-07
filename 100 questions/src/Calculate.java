import java.util.Scanner;
public class Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入兩個數字");
		float m = scn.nextFloat();
		float m2 = scn.nextFloat();
		System.out.println("合為:"+(m+m2));
		System.out.println("差為:"+(m-m2));
		System.out.println("乘績為:"+(m*m2));
	}

}
