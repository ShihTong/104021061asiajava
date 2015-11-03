import java.util.Random;

public class WK28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int v1, v2, v3, v4, v5, v6;
		int i = rnd.nextInt(1000) + 1;
		i = 1000-i;
		v1 = i / 500;
		i = i % 500;
		v2 = i / 100;
		i = i % 100;
		v3 = i / 50;
		i = i % 50;
		v4 = i / 10;
		i = i % 10;
		v5 = i/5;
		i = i % 5;
		v6 = i/1;
		if(v1>=0){
			System.out.println(v1+"個500元");
		}if(v2>=0){
			System.out.println(v2+"個100元");
		}if(v3>=0){
			System.out.println(v3+"個50元");
		}if(v4>=0){
			System.out.println(v4+"個10元");
		}if(v5>=0){
			System.out.println(v5+"個5元");
		}if(v6>=0){
			System.out.println(v6+"個1元");
		}
	}

}
