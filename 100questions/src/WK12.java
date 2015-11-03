import java.util.*;
public class WK12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入國文成績");
		int c = scn.nextInt();
		System.out.println("請輸入英文成績");
		int e = scn.nextInt();
		System.out.println("請輸入數學成績");
		int m = scn.nextInt();
		System.out.println("總成績為:"+(c+e+m));
		System.out.println("平均成績為:"+(float)(c+e+m)/3);
	}

}
