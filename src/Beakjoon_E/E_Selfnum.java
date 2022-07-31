package Beakjoon_E;

import java.util.Arrays;

public class E_Selfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sfnum[] = new int[10000];
		
		for(int i=0; i<10000; i++)
		{
			int a = i/10000;  		// 9999 = 0
			int b = i%10000/1000;	// 9999 = 9999%10000 = 9999/1000 = 9
			int c = i%1000/100;		// 9999 = 9999%1000 =999/100 = 9
			int d = i%100/10;		// 9999 = 9999%100 =99/10 = 9
			int e = i%10; 			// 9999 = 9999%10 = 9
			
			int x = a + b + c + d + e + i;
			
		}
		Arrays.sort(sfnum);
		
		int selfnumber[] = new int [10000];
		
		for(int a=0; a<10000; a++)
		{
			System.out.println(sfnum[a]);
		}
	}
}
