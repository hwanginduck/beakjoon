package Beakjoon_C;

import java.util.Scanner;

public class C_Xmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		for(int b=0; b<n; b++)
		{
			int a = sc.nextInt();
			if(a < x)
			{
				System.out.print(a+" ");
			}
		}
	}
}
