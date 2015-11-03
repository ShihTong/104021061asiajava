import java.util.Scanner;
public class WK47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int k = 1;
		for(int i = 1;i<=9;i++){
			for(int j = 1;j<=9;j++){
				k=i*j;
				System.out.print(k+"\t");
			}
			System.out.println();
		}
	}

}
