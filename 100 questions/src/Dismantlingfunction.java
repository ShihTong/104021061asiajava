import java.util.Scanner;
public class Dismantlingfunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一串數字");
		String m = scn.next();
		System.out.println("decomp("+m+"):"+decomp(m));
	}
	public static String decomp(String m){
		String[] m2 = m.split("");
		String m3 = "";
		for(int i = 0;i<m.length()+1;i++){
			m3 = m3+m2[i];
			m3=m3+" ";
		}
		m = m3;
		return m;
	}

}
