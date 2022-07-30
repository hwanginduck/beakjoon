package Beakjoon_C;

import java.util.Scanner;

public class C_ForSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 0;
		for(int i = 0; i < a+1; i ++)
		{
			b += i;
		}
		System.out.println(b);
	}
}
