package Beakjoon_A;

import java.util.Scanner;

public class A_Gobssam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c = b%10;
		int d = (b%100)-c;
		int e = (b%1000)-d-c;
		
		System.out.println(c*a);
		System.out.println(d*a/10);
		System.out.println(e*a/100);
		System.out.println(a*b);
	}
}
