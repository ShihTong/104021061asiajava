import java.util.Scanner;
public class ExWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner scn=new Scanner(System.in);
		   System.out.println("請輸入A值");
		   float a = scn.nextFloat();
		   System.out.println("請輸入B值");
		   float b = scn.nextFloat();
		   if(a>b){
			   System.out.println(""+a+">"+b+"");
		   }else{
			   if(a<b){
				    System.out.println(""+a+"<"+b+"");
			   }else{
				   System.out.println(""+a+"="+b+"");
			   }
			  
		   }
	}

}
