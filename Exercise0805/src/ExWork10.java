import java.util.Scanner;
public class ExWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�п�J�ʧO�P����");
		String s = scn.next();
		double h = scn.nextDouble();
		double a = (h-170)*0.6+62;
		double a2 = (h-158)*0.5+52;
		if(s.equals("�k")){
			System.out.println(a);
		}else{
			if(s.equals("�k"));
			System.out.println(a2);
		}
	}

}
