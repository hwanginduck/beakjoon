package Beakjoon_C;

import java.util.Scanner;

public class C_Star_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for(int z = 0; z<x; z++)
		{
			for(int y=0; y<=z; y++)
			{
				System.out.print("*");
			}	
			System.out.println();
		}		
	
	}

}
