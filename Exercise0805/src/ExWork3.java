import java.util.Scanner;
public class ExWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請將3邊由小到大排列");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		if(a+b>c){
			System.out.print("合法");
		}else{
			System.out.print("不合法");
		}
	}

}
