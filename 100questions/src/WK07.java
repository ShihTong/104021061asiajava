import java.util.Scanner;
public class WK07 {

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
			i = i+32;
			String word2 = new Character((char)i).toString();
			System.out.println("轉換小寫 = "+word2);
		}else{
			if(97<=i && i<=122){
				i = i-32;
				String word2 = new Character((char)i).toString();
				System.out.println("轉換大寫 = "+word2);
			}else{
				System.out.println("請輸入一個英文字元喔!!好嗎:)");
			}
		}
	}

}
