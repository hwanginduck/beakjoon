package Beakjoon_C;

import java.util.Scanner;

public class C_PlusCycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = a;
		int cle = 0;
		do
		{
			b = ((b/10) + (b%10))%10 + ((b%10)*10);
			cle++;
		}while( a != b);
			System.out.println(cle);
	}
}



