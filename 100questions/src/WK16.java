import java.util.Scanner;
public class WK16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入數字");
		int number = scn.nextInt();
		if(number%2==0){
			System.out.println("雙數");
		}else
			System.out.println("單數");
			}
}