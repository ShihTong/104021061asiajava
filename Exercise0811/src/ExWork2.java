import java.util.Scanner;
import java.util.Random;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int i = 0,t=0;
		int[] data = new int[10];
		boolean flag = false;
		while(i<10){
			data[i] = rnd.nextInt(100)+1;
			flag = false;
			for(int j = 0;j<i;j++){
				if(data[i] == data[j]){
					flag = true;
				}
			}
			if(data[i]%2==0){
				t++;
			}
			if(flag == false){
				i++;
			}
		}
		int j = 1;
		while(j<4){
			System.out.println("請猜!!");
			int c = scn.nextInt();
			if(c == t){
				System.out.println("你答對了!!");
					j = 4;
				}else{
					j++;
					if(j==4){
						System.out.println("GG!!\n");
					}
					
			}
			}
		for(i = 0;i<10;i++){
			System.out.println(data[i]);
		}
	}
}