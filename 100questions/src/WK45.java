import java.util.Scanner;

public class WK45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for (int i = 0; i <= n; i++) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i*2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
