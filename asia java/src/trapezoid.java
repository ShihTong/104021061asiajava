import java.util.Scanner;
public class trapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.print("�п�J�W��");
		   float b = scn.nextFloat();
		   System.out.print("�п�J�U��");
		   float b2 = scn.nextFloat();
		   System.out.print("�п�J��");
		   float h = scn.nextFloat();
		   float a = (b+b2)*h/2;
		   System.out.print("���n��"+a+"");
	}

}
