import java.util.Scanner;
public class WK07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӭ^��r��");
		word = scn.next();
		char x = word.charAt(0);//�^����@�r��
		int i = (int)x;
		//System.out.println("�z��J���r��:"+i+"");//
		if(65<=i && i<=90){
			i = i+32;
			String word2 = new Character((char)i).toString();
			System.out.println("�ഫ�p�g = "+word2);
		}else{
			if(97<=i && i<=122){
				i = i-32;
				String word2 = new Character((char)i).toString();
				System.out.println("�ഫ�j�g = "+word2);
			}else{
				System.out.println("�п�J�@�ӭ^��r����!!�n��:)");
			}
		}
	}

}
