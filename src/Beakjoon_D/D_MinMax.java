package Beakjoon_D;

import java.util.Scanner;

public class D_MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int cycle = sc.nextInt();
		int[] minmax = new int[cycle];
		for(int i=0; i<minmax.length; i++)
		{
			minmax[i] = sc.nextInt();
		}
		
		int min = minmax[0];
		int max = minmax[0];
		for(int i=0; i<minmax.length; i++)
		{
			if(min > minmax[i])
			{
				min = minmax[i];
			}
			if(max < minmax[i])
			{
				max = minmax[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
