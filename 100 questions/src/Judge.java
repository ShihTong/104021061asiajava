import java.util.Scanner;
public class Judge {

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
			System.out.println("���j�g");
		}else{
			if(97<=i && i<=122){
				System.out.println("���p�g");
			}else{
				System.out.println("�п�J�@�ӭ^��r����!!�n��:)");
			}
		}
	}

}
