import java.util.Scanner;
public class ExWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int sum = 0;
		int n = 13;
		int r = 17-n;
		if(n%17 == 0){
			for(n=13;n<1400;n=n+17){
				sum=sum+n;
			}
		}else{
			for(n=n+r;n<1400;n=n+17){
				sum=sum+n;
			}
		}
		System.out.println("sum="+sum);	
	}	

}
