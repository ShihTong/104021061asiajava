import java.util.Scanner;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int d = scn.nextInt();
		int w = scn.nextInt();
		if(d == 7 || d== 17 || d == 27){
			System.out.println("���Y��");
		}else{
			if(w ==2 || w ==4 || w == 6){
				System.out.println("�Y��");
			}else{
				System.out.println("���Y��");
			}
		}
	}

}
