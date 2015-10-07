import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入身高(cm)");
		float h = scn.nextFloat();
		double h2 = h*0.39;
		System.out.println("請輸入體重(kg)");
		float g = scn.nextFloat();
		double g2 = g*2.2;
		System.out.println("公分轉換為英吋:"+h2);
		System.out.println("公斤轉換為磅:"+g2);
	}

}
