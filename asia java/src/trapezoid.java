import java.util.Scanner;
public class trapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.print("請輸入上底");
		   float b = scn.nextFloat();
		   System.out.print("請輸入下底");
		   float b2 = scn.nextFloat();
		   System.out.print("請輸入高");
		   float h = scn.nextFloat();
		   float a = (b+b2)*h/2;
		   System.out.print("面積為"+a+"");
	}

}
