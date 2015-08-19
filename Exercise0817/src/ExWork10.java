import java.util.Scanner;
public class ExWork10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int re = 0;
		System.out.println(fun(n,re));
	}
	public static int fun(int n,int m){
		for(int i = 1;i<=n;i++){
			m += Math.pow(2,i);
		}return m;
	}

}
