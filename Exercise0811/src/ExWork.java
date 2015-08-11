import java.util.Scanner;
import java.util.Random;
public class ExWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int t = 0;
		int[] data = new int[10];
		int i = 0;
		for(i = 0;i<10;i++){
			data[i]=rnd.nextInt(100)+1;
			if(data[i]%2==0){
				t++;
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
				for(int g = 0;g<10;g++){
				System.out.println(data[g]);
		}
				
			}
			
		}