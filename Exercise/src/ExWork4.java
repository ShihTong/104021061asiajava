import java.util.Scanner;
public class ExWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if((a == 1 && b<=20 && b>0) || (a == 12 && b>=21 && b<=31)){
			System.out.println("���~�y�G���w�I�K��ۤv���@��");
		}else{
			if((a == 2 && b<=19 && b>0) || (a == 1 && b>=21 && b<=31)){
				System.out.println("���~�y�G�����ۤv�A���Q������L");
			}else{
				if((a == 3 && b<=20 && b>0) || (a == 2 && b>=20 && b<=29)){
					System.out.println("�����y�G�R��C�ۤv���ʮ�");
				}else{
					if((a == 4 && b<=20 && b>0) || (a == 3 && b>=21 && b<=31)){
						System.out.println("�d�Ϯy�G���q����B��");
					}else{
						if((a == 5 && b<=21 && b>0) || (a == 4 && b>=21 && b<=30)){
							System.out.println("�����y�G�u�ʱ��A�R����� ");
						}else{
							if((a == 6 && b<=21 && b>0) || (a == 5 && b>=22 && b<=31)){
								System.out.println("���l�y�G�R�������۪�");
							}else{
								if((a == 7 && b<=22 && b>0) || (a == 6 && b>=22 && b<=30)){
									System.out.println("���ɮy�G�e�����ˡB�e������");
								}else{
									if((a == 8 && b<=22 && b>0) || (a == 7 && b>=23 && b<=31)){
										System.out.println("��l�y�G�����w���M�w");
									}else{
										if((a == 9 && b<=22 && b>0) || (a == 8 && b>=23 && b<=31)){
											System.out.println("�B�k�y�G�ܮ`�ȩt��A�Ӥ߷ŬX");
										}else{
											if((a == 10 && b<=23 && b>0) || (a == 9 && b>=23 && b<=30)){
												System.out.println("�ѯ��y�G�����G���f�~");
											}else{
												if((a == 11 && b<=21 && b>0) || (a == 10 && b>=24 && b<=31)){
													System.out.println("���Ȯy�G�L���r�A�߫ܵ�");
												}else{
													if((a == 12 && b<=20 && b>0) || (a == 11 && b>=22 && b<=30)){
														System.out.println("�g��y�G�B�ͫܦh�A���B�ܩ�");
													}else{
														if(a == 12 && b>=21 && b<=31){
															System.out.println("���~�y�G���w�I�K��ۤv���@��");
													}
												}
												
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	}

}