package Beakjoon_D;

import java.util.Scanner;

public class D_MaxCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int max[] = new int[9];
		int maxi = max[0];
		int count = 0;
		
		for(int i=0; i<9; i++)
		{
			max[i] = sc.nextInt();
			if(maxi < max[i])
			{
				maxi = max[i];
				if(maxi == max[i])
				{
					count = i+1;
				}
			}
		}
		System.out.println(maxi);
		System.out.println(count);
		
	}

}
