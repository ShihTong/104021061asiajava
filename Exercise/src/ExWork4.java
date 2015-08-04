import java.util.Scanner;
public class ExWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if((a == 1 && b<=20 && b>0) || (a == 12 && b>=21 && b<=31)){
			System.out.println("¼¯½~®y");
		}else{
			if((a == 2 && b<=19 && b>0) || (a == 1 && b>=21 && b<=31)){
				System.out.println("¤ô²~®y");
			}else{
				if((a == 3 && b<=20 && b>0) || (a == 2 && b>=20 && b<=29)){
					System.out.println("Âù³½®y");
				}else{
					if((a == 4 && b<=20 && b>0) || (a == 3 && b>=21 && b<=31)){
						System.out.println("¥Õ¦Ï®y");
					}else{
						if((a == 5 && b<=21 && b>0) || (a == 4 && b>=21 && b<=30)){
							System.out.println("ª÷¤û®y");
						}else{
							if((a == 6 && b<=21 && b>0) || (a == 5 && b>=22 && b<=31)){
								System.out.println("Âù¤l®y");
							}else{
								if((a == 7 && b<=22 && b>0) || (a == 6 && b>=22 && b<=30)){
									System.out.println("¥¨ÃÉ®y");
								}else{
								}
							}
						}
					}
				}
			}
		}
	}

}
