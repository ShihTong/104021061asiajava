import java.util.Scanner;
public class ExWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = 1;
		double k = 20000;
		while(k<1100000){
			k +=k*0.15;
			m++;
		}
		System.out.println("過了"+m+"小時即達滿水位");
	}

}