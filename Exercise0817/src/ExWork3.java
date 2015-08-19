import java.util.Scanner;
public class ExWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("請輸入一個數值");
		long m = scn.nextLong();
		System.out.println(fun(m));
	}
	public static long fun(long v1){
		if(v1<10 && v1>0){
			return 1;
		}else
			return 1+fun(v1/10);
	}
}