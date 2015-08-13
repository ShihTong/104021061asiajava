import java.util.Scanner;
public class ExWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A矩陣n*n");
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println("請輸入B矩陣n*n");
		b = scn.nextInt();
		int c = scn.nextInt();
		int p = 0,q = 0;
		float[][] v1 = new float[a][b];
		float[][] v2 = new float[b][c];
		float[][] v3 = new float[a][c];
		for(int j=0;j<a;j++){
			for(int i=0;i<b;i++){
				v1[j][i] = scn.nextFloat();
			}
		}
		for(int i = 0;i<b;i++){
			for(int k = 0;k<c;k++){
				v2[i][k] = scn.nextFloat();
			}
		}
		for(int j = 0;j<a;j++){
			for(int k = 0;k<c;k++){
				for(int i = 0;i<b;i++){
					v3[p][q]+= v1[j][i]*v2[i][k];
				}q++;
			}p++;q = 0;
		}
		for(p = 0;p<a;p++){
			for(q = 0;q<c;q++){
				System.out.print(v3[p][q]+"\t");
			}
			System.out.println();
		}
	}

}