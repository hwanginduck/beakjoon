package Beakjoon_B;

import java.util.Scanner;

public class B_leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%4 == 0 && a%100 !=0 || a%400 == 0)
		{
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
		
	}

}
