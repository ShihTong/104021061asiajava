import java.util.Scanner;
public class ExWork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		if((a == 1 && b<=20 && b>0) || (a == 12 && b>=21 && b<=31)){
			System.out.println("摩羯座：喜歡沉醉於自己的世界");
		}else{
			if((a == 2 && b<=19 && b>0) || (a == 1 && b>=21 && b<=31)){
				System.out.println("水瓶座：難為自己，不想對方難過");
			}else{
				if((a == 3 && b<=20 && b>0) || (a == 2 && b>=20 && b<=29)){
					System.out.println("雙魚座：愛放低自己的脾氣");
				}else{
					if((a == 4 && b<=20 && b>0) || (a == 3 && b>=21 && b<=31)){
						System.out.println("牡羊座：講義氣夠朋友");
					}else{
						if((a == 5 && b<=21 && b>0) || (a == 4 && b>=21 && b<=30)){
							System.out.println("金牛座：真性情，愛恨分明 ");
						}else{
							if((a == 6 && b<=21 && b>0) || (a == 5 && b>=22 && b<=31)){
								System.out.println("雙子座：愛情的執著者");
							}else{
								if((a == 7 && b<=22 && b>0) || (a == 6 && b>=22 && b<=30)){
									System.out.println("巨蟹座：容易受傷、容易滿足");
								}else{
									if((a == 8 && b<=22 && b>0) || (a == 7 && b>=23 && b<=31)){
										System.out.println("獅子座：不喜歡做決定");
									}else{
										if((a == 9 && b<=22 && b>0) || (a == 8 && b>=23 && b<=31)){
											System.out.println("處女座：很害怕孤單，細心溫柔");
										}else{
											if((a == 10 && b<=23 && b>0) || (a == 9 && b>=23 && b<=30)){
												System.out.println("天秤座：有善辯的口才");
											}else{
												if((a == 11 && b<=21 && b>0) || (a == 10 && b>=24 && b<=31)){
													System.out.println("天蠍座：嘴雖毒，心很善");
												}else{
													if((a == 12 && b<=20 && b>0) || (a == 11 && b>=22 && b<=30)){
														System.out.println("射手座：朋友很多，桃花運很旺");
													}else{
														if(a == 12 && b>=21 && b<=31){
															System.out.println("摩羯座：喜歡沉醉於自己的世界");
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