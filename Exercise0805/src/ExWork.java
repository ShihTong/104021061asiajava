import java.util.Scanner;
public class ExWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String s = scn.next();
		String d = scn.next();
		int p = scn.nextInt();
		if(s.equals("���Q�P")){
			System.out.println("���R");
		}else{
			if((d.equals("���") || d.equals("�@��") && p<=45 && p>0)){
				System.out.println("�R");
			}else{
				System.out.println("���R");
			}
			
	}

}
}