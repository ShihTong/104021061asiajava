import java.util.Random;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int v1 ,v2 ,v3 ,v4 ;
		int i = rnd.nextInt(1000)+1;
		System.out.println(i);
		v1 = i/1000;
		i = i%1000;
		v2 = i/100;
		i = i%100;
		v3 = i/10;
		i = i%10;
		v4 = i/1;
		i = i%1;
		System.out.println(v1+"¥a"+v2+"¨Õ"+v3+"¬B"+v4+"¤¸");
	}
}