import java.util.Scanner;
public class ExWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        System.out.println("�аݦ��X��ǥ�?");
        int s = scn.nextInt();
        int k = 0;
        String m1 = (""),m2 = ("");
        float min = 999,max = 0;
        float data[][] = new float[s][4];
        String name[] = new String[s];
        for(int i = 0;i<s;i++){
        	System.out.println("�п�J��"+(i+1)+"��P�Ǫ��W�r");
        name[i] = scn.next();
        System.out.println("�п�J3�즨�Z");
        data[i][0] = scn.nextFloat();
        data[i][1] = scn.nextFloat();
        data[i][2] = scn.nextFloat();
        data[i][3] = (data[i][0]+data[i][1]+data[i][2])/3;
        }
        for(int i = 0;i<s;i++){
   			for(int j = 0;j<i;j++){
   				if(data[i][3]>data[j][3]){
   					float v1 = data[i][3];
   					data[i][3] = data[j][3];
   					data[j][3] = v1;
   					String name1 = name[i];
   					name[i] = name[j];
   					name[j] = name1;
   				}
   			}
   			}
        for(int i = 0;i<s;i++){
        	System.out.print(name[i]+data[i][3]);
        }
        for(int i = 0;i<s;i++){
        	if(data[i][3]<60){
        		k++;
        	}
        }
        System.out.println("���ή�H��"+k);
        for(int i = 0;i<s;i++){
        	if(data[i][3]<min){
        		min = data[i][3];
        		m1 = name[i];
        	}
        	if(data[i][3]>max){
        		max = data[i][3];
        		m2 = name[i];
        	}
        }
        System.out.println("�̰���"+m2+max+",�̧C��"+m1+min);
	}
	
}