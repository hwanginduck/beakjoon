package Beakjoon_C;

import java.util.Scanner;

public class C_gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b[] = new int[9];
		int c = 0;
		for(c = 0; c < b.length; c++)
		{
			b[c] = a * (c+1);
			System.out.println(a +" * " +(c+1) +" = " +b[c]);
		}
	}
}
