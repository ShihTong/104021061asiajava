import java.util.Scanner;
public class ExWork9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		float n = scn.nextInt();
		float re = 0;
		System.out.print(fun(n,re));
	}
	public static float fun(float n,float m){
		for(int i = 1;i<=n;i++){
			m += 1.0/((2*i-1)*(2*i));
		}return m;
	}

}