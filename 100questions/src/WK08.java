import java.util.Scanner;
public class WK08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入攝氏溫度");
		float c = scn.nextFloat();
		float f = c*9/5+32;
		System.out.println("轉換為華氏溫度="+f);
	}

}
