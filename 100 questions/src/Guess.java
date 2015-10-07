import java.util.Scanner;
import java.util.Random;
public class Guess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[1];
		data[0] = rnd.nextInt(5)+1;
		for(int i = 0;i<5;i++){
			System.out.println("請輸入1~5中一個數字");
			String j = scn.next();
			int m = Integer.parseInt(j);
			if(m == data[0]){
				System.out.println("答對了!!");
			}else{
				System.out.println("錯!!");
				System.out.println("答案為:"+data[0]);
			}return ;
		}
		
	}

}
