import java.util.Scanner;
public class Work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner scn=new Scanner(System.in);
           System.out.print("Hello,請問你是?");
           String name = scn.next();
           System.out.println("Hi,"+name+"你好!");
           System.out.print(""+name+"很高興認識你,請問您是哪一所高中畢業的?");
           String school = scn.next();
           System.out.println(""+name+",原來你是"+school+"畢業的．");
           System.out.print("你現在讀哪一個系呢?");
           String kc = scn.next();
           System.out.println("哇~~"+kc+"可是熱門科系耶,你實在太厲害了! :)");
           System.out.print("你畢業後要從事什麼工作?");
           String work = scn.next();
           System.out.print(""+work+"是個不錯工作,真是羨慕你!:)");
	}

}
