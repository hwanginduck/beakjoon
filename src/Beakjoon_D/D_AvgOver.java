package Beakjoon_D;

import java.util.Scanner;

public class D_AvgOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		입력받을 케이스경우의 수
		int ct1 = sc.nextInt();

//		각 케이스마다 평균
		int av2[] = new int[ct1];
		
//		평균 이상 갯수만큼 카운팅하고, 평균으로 나누어 구할 배열
		double avg_over_count[] = new double[ct1];
		
		for (int i1=0; i1<ct1; i1++)
		{
			int ct2 = sc.nextInt();
//			각 케이스마다 점수를 입력 받을 배열
			int av[] = new int[ct2];
			for(int i2=0; i2<ct2; i2++)
			{
				int a = sc.nextInt();
				av[i2] = a;
			}
			for(int i2=0; i2<ct2; i2++)
			{
				av2[i1] = av2[i1] + av[i2]; 
			}
//			av2배열에 평균 값 입력
			av2[i1] = av2[i1]/ct2;
			
			for(int i2=0; i2<ct2; i2++)
			{
				if(av2[i1] < av[i2])
				{
					avg_over_count[i1] += 1;
				}
			}
			
				avg_over_count[i1] = avg_over_count[i1]/ct2*100;
	
		}
		for(int i=0; i<ct1; i++)
		{
			System.out.println(String.format("%.3f", avg_over_count[i])+"%");
		}
	}
}
