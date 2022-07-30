package Beakjoon_C;

import java.util.Scanner;

public class C_AplusB_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x, y;
		while(sc.hasNext())
		{
			x = sc.nextInt();
			y = sc.nextInt();
			if(x>0 && y<10)
			{
			System.out.println(x+y);
			}
			else
				break;
		}
		
		
	}

}
