import java.util.Scanner;
public class ExWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入性別與身高");
		String s = scn.next();
		double h = scn.nextDouble();
		double a = (h-170)*0.6+62;
		double a2 = (h-158)*0.5+52;
		if(s.equals("男")){
			System.out.println(a);
		}else{
			if(s.equals("女"));
			System.out.println(a2);
		}
	}

}
