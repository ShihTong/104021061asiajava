import java.util.Scanner;
public class ExWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請將3邊由小到大排列");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		if(a+b<=c){
			System.out.print("不合法");
		}else{
			if(a*a+b*b == c*c){
				System.out.print("直角三角形");
			}else{
				if(a*a+b*b < c*c){
					System.out.print("鈍角三角形");
				}else{
					if(a*a+b*b >c*c){
						System.out.print("銳角三角形");
					}
				}
			}
		}
	}

}
