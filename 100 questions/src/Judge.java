import java.util.Scanner;
public class Judge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個英文字元");
		word = scn.next();
		char x = word.charAt(0);//擷取單一字元
		int i = (int)x;
		//System.out.println("您輸入的字元:"+i+"");//
		if(65<=i && i<=90){
			System.out.println("為大寫");
		}else{
			if(97<=i && i<=122){
				System.out.println("為小寫");
			}else{
				System.out.println("請輸入一個英文字元喔!!好嗎:)");
			}
		}
	}

}
