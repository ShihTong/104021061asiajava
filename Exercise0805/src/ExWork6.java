import java.util.Scanner;
public class ExWork6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("�бN3��Ѥp��j�ƦC");
		float a = scn.nextFloat();
		float b = scn.nextFloat();
		float c = scn.nextFloat();
		if(a+b<=c){
			System.out.print("���X�k");
		}else{
			if(a*a+b*b == c*c){
				System.out.print("�����T����");
			}else{
				if(a*a+b*b < c*c){
					System.out.print("�w���T����");
				}else{
					if(a*a+b*b >c*c){
						System.out.print("�U���T����");
					}
				}
			}
		}
	}

}
