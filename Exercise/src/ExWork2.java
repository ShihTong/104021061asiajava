import java.util.Scanner;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.println("�п�JA��");
		   float a = scn.nextFloat();
		   System.out.println("�п�JB��");
		   float b = scn.nextFloat();
		   System.out.println("�A�n�����B��O+,-,*��/");
		   String str = scn.next();
		   if(str.equals("+")){
			   System.out.println(""+a+"+"+b+"="+(a+b)+"");
		   }else{
			   if(str.equals("-")){
				   System.out.println(""+a+"-"+b+"="+(a-b)+"");
			   }else{
				   if(str.equals("*")){
					   System.out.println(""+a+"*"+b+"="+(a*b)+"");
				   }else{
					   if(str.equals("/")){
						   System.out.println(""+a+"/"+b+"="+(a/b)+"");
					   }
				   }
			   }
		   }
	}

}
