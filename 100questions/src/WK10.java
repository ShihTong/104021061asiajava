import java.util.Scanner;
public class WK10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入字母或數字");
		String m = scn.nextLine();
		String m2 = "";
		for(int i = m.length();i>0;i--){
			char w = m.charAt(i-1);
			m2 = m2+w;
		}
		if(m.equals(m2)){
			System.out.println("是迴文");
		}else{
			System.out.println("不是迴文");
		}
	}

}
