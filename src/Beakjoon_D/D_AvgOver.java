package Beakjoon_D;

import java.util.Scanner;

public class D_AvgOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
//		1. 몇가지 케이스를 입력 받아서 처리 할 것인지 입력받음
		int ct1 = sc.nextInt();

//		
		int av2[] = new int[ct1];
		
//		
		double avg_over_count[] = new double[ct1];
		
		for (int i1=0; i1<ct1; i1++)
		{
//			2.케이스마다 몇개의 점수를 입력받아서 처리 할 것인지 입력받음
			int ct2 = sc.nextInt();
//			점수를 입력 받아서 넣을 배열을 생성
			int av[] = new int[ct2];
			for(int i2=0; i2<ct2; i2++)
			{
//				3.배열에 넣을 각 점수들 입력받음
				int a = sc.nextInt();
//				av배열에 각 입력 받은 점수를 넣음
				av[i2] = a;
			}
			
//			입력 받은 데이터들을 이용하여 원하는 자료를 뽑는 과정
			for(int i2=0; i2<ct2; i2++)
			{
//				av2의 배열에 av배열에 들어있는 각각의 배열값을 더함
				av2[i1] = av2[i1] + av[i2]; 
			}
//			av2배열에 들어있는 각 케이스들의 점수들의 합을 점수들의 갯수로 나누어 평균 산출
			av2[i1] = av2[i1]/ct2;

			for(int i2=0; i2<ct2; i2++)
			{
//				위에서 산출한 평균값보다 av배열에 들어있는 점수가 더 크다면 avg_over_count배열에 1씩 더하여 카운팅
				if(av2[i1] < av[i2])
				{
					avg_over_count[i1] += 1;
				}
			}
//				카운팅한 갯수를 각 케이스의 점수 갯수로 나누고 100을 곱하여 백분율 산출
				avg_over_count[i1] = avg_over_count[i1]/ct2*100;
	
		}
		for(int i=0; i<ct1; i++)
		{
//			avg_over_count배열에 들어있는 값을 문제에서 원하는 형식으로 출력
			System.out.println(String.format("%.3f", avg_over_count[i])+"%");
		}
	}
}
