import java.util.*;

public class WK05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int data[][] = new int[10][10];
		int m = 0;
		int n = 0;
		for (m = 0; m < 10; m++) {
			for (n = 0; n < 10; n++) {
				data[m][n] = rnd.nextInt((10) + 1);
				System.out.print(data[m][n] + "\t");
				if (n == 9) {
					System.out.println();
				}
			}
		}
		System.out.println();
		for (m = 0; m < 10; m++) {
			for (n = 0; n < 10; n++) {
				System.out.print(data[n][m] + "\t");
				if (n == 9) {
					System.out.println();
				}
			}
		}
	}

}
