import java.util.Scanner;
import java.util.Random;
public class ExWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int i = 0,t=0,j = 0;
		int[] data = new int[10];
		boolean flag = false;
		while(i<10){
			data[i] = rnd.nextInt(100)+1;
			flag = false;
			for(j = 0;j<i;j++){
				if(data[i] == data[j]){
					flag = true;
				}
			}
			if(flag == false){
				i++;
			}
		}
		for(i = 0;i<10;i++){
			for(j = i+1;j<10;j++){
				if(data[i]>data[j]){
					int v1 = data[i];
					data[i] = data[j];
					data[j] = v1;
				}
			}
			if(data[i]%2==0){
				t++;
			}
		}
		int a = 1;
		while(a<4){
			System.out.println("請猜!!");
			int c = scn.nextInt();
			if(c == t){
				System.out.println("你答對了!!");
					a = 4;
				}else{
					a++;
					if(a==4){
						System.out.println("GG!!\n");
					}
					
			}
			}
		for(i = 0;i<10;i++){
			System.out.println(data[i]);
		}
	}
}