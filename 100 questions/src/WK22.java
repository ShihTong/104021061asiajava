import java.util.Scanner;
public class WK22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String v1 = scn.next();
		int i = Integer.parseInt(v1);
		int j = 0;
		System.out.println(v2(i,j)+"¦ì¼Æ");
	}
	public static int v2(int m,int n){
		if(m != 0){
			n++;
			return v2(m/10,n);
		}else{
			return n;
		}
	}

}
