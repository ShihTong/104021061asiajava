import java.util.Scanner;
public class Numberstogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J0~9���Ʀr");
		String m = scn.next();
		int sum = (int) fun(m);
		System.out.println("�`�X��"+sum);
	}
	public static long fun(String v1){
		int sum = 0;
		int len = v1.length();
		char data[] = v1.toCharArray();
		for(int i = 0;i<len;i++){
			int c = data[i]-'0';
			sum+=c;
		}
		return sum;
	}
}
