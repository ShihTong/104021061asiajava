import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�r��");
		String word = scn.nextLine();
		StringBuffer word2 = new StringBuffer();
		word2.append(word);
		word2.reverse();
		System.out.println(word2);
	}

}
