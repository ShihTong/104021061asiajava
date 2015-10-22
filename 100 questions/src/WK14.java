import java.util.Scanner;
public class WK14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int sum = 0;
		for(int i = 1;i<=n;i++){
			for(int j = 1;j<=m;j++){
				sum = i*j;
				System.out.print(sum+"\t");
			}
			System.out.println();
		}
	}

}
