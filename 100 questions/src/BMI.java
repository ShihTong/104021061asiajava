import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入'男'or'女'");
		String s = scn.next();
		/*System.out.println("請輸入身高");
		float h = scn.nextFloat();
		double b = (h-170)*0.6+62;
		double g = (h-158)*0.5+52;*/
		if(s.equals("男")){
			System.out.println("請輸入身高");
			float h = scn.nextFloat();
			double b = (h-170)*0.6+62;
			System.out.println(b);
		}else{
			if(s.equals("女")){
				System.out.println("請輸入身高");
				float h = scn.nextFloat();
				double g = (h-158)*0.5+52;
				System.out.println(g);
			}else{
				System.out.println("請照著說明做喔!!");
			}
		}
	}

}
