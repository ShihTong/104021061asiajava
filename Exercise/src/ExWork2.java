import java.util.Scanner;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.println("請輸入A值");
		   float a = scn.nextFloat();
		   System.out.println("請輸入B值");
		   float b = scn.nextFloat();
		   System.out.println("你要做的運算是+,-,*或/");
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
