import java.util.Scanner;
import java.util.Random;
public class WK04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int i = 0,t = 0;
		int data[] = new int[6];
		boolean flag = false;
		while(i<6){
			data[i] = rnd.nextInt(49)+1;
			flag = false;
			for(int j = 0;j<i;j++){
				if(data[i] == data[j]){
					flag = true;
				}
			}
			if(data[i]%2 == 0){
				t++;
			}
			if(flag == false){
				i++;
			}
		}
		for(i = 0;i<6;i++){
			System.out.println(data[i]);
		}
	}

}
