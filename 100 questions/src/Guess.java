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
			System.out.println("�п�J1~5���@�ӼƦr");
			String j = scn.next();
			int m = Integer.parseInt(j);
			if(m == data[0]){
				System.out.println("����F!!");
			}else{
				System.out.println("��!!");
				System.out.println("���׬�:"+data[0]);
			}return ;
		}
		
	}

}
