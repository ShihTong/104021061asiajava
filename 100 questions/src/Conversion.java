import java.util.Scanner;
public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����(cm)");
		float h = scn.nextFloat();
		double h2 = h*0.39;
		System.out.println("�п�J�魫(kg)");
		float g = scn.nextFloat();
		double g2 = g*2.2;
		System.out.println("�����ഫ���^�T:"+h2);
		System.out.println("�����ഫ���S:"+g2);
	}

}
