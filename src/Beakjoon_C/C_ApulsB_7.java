package Beakjoon_C;

import java.util.Scanner;

public class C_ApulsB_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++)
		{
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			System.out.println("Case #" +(i+1) +":" + " " +(x + y));
		}
		
		
	}

}
