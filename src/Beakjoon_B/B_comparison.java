package Beakjoon_B;

import java.util.Scanner;

public class B_comparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b)
		{
			System.out.println(">");
		}
		if(a<b)
		{
			System.out.println("<");
		}
		else if(a==b)
		{
			System.out.println("==");
		}
		
	}

}
