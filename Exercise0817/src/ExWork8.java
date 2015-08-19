import java.util.Scanner;
public class ExWork8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.print(fun(n));
	}
	public static int fun(int n){
		int re = 0;
		for(int i = 0;i<=n;i++){
			re += i*(i+1);
		}return re;
	}

}