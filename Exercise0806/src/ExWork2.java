import java.util.Scanner;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.println("�п�J�����Ҫ��^��:");
		String str = scn.next();
		if(str.length() == 1){
		char c = str.charAt(0);
		switch(c){
		case 'A':
			System.out.println("�x�_��");
			break;
		case 'B':
			System.out.println("�x����");
			break;
		case 'C':
			System.out.println("�򶩥�");
			break;
		case 'D':
			System.out.println("�x�n��");
			break;
		case 'E':
			System.out.println("������");
			break;
		case 'F':
			System.out.println("�x�_��");
			break;
		case 'G':
			System.out.println("�y����");
			break;
		case 'H':
			System.out.println("��鿤");
			break;
		case 'I':
			System.out.println("�Ÿq��");
			break;
		case 'J':
			System.out.println("�s�˿�");
			break;
		case 'K':
			System.out.println("�]�߿�");
			break;
		case 'L':
			System.out.println("�x����");
			break;
		case 'M':
			System.out.println("�n�뿤");
			break;
		case 'N':
			System.out.println("���ƿ�");
			break;
		case 'O':
			System.out.println("�s�˥�");
			break;
		case 'P':
			System.out.println("���L��");
			break;
		case 'Q':
			System.out.println("�Ÿq��");
			break;
		case 'R':
			System.out.println("�x�n��");
			break;
		case 'S':
			System.out.println("������");
			break;
		case 'T':
			System.out.println("�̪F��");
			break;
		case 'U':
			System.out.println("�Ὤ��");
			break;
		case 'V':
			System.out.println("�x�F��");
			break;
		case 'W':
			System.out.println("����");
			break;
		case 'X':
			System.out.println("���");
			break;
		case 'Y':
			System.out.println("�����s");
			break;
		case 'Z':
			System.out.println("����");
			break;
		default:
			System.out.println("�п�J�@�Ӥj�g�^��,����~~");
			break;
			
			
			
		}
	}else{
		System.out.println("�п�J�@�Ӥj�g�^��,����~~");
	}
	}
}