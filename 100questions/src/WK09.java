import java.util.Scanner;
public class WK09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�kor�k");
		String s = scn.next();
		/*System.out.println("�п�J����");
		float h = scn.nextFloat();
		double b = (h-170)*0.6+62;
		double g = (h-158)*0.5+52;*/
		if(s.equals("�k")){
			System.out.println("�п�J����");
			float h = scn.nextFloat();
			double b = (h-170)*0.6+62;
			System.out.println(b);
		}else{
			if(s.equals("�k")){
				System.out.println("�п�J����");
				float h = scn.nextFloat();
				double g = (h-158)*0.5+52;
				System.out.println(g);
			}else{
				System.out.println("�зӵۻ�������!!");
			}
		}
	}

}
