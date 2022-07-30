package Beakjoon_D;

import java.util.Scanner;

public class D_NewAve 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	// 과목 수 입력
	int cls = sc.nextInt();
	int a[] = new int[cls];
	
	// 각과목별 점수 배열에 입력
	for(int i=0; i<cls; i++)
	{
		a[i] = sc.nextInt();
	}
	
	// 제일 높은 점수의 과목 책정
	int max = a[0];
	for(int i=0; i<cls; i++)
	{
		if(max <= a[i])
		{
			max = a[i];
		}
	}
	
	// 더블형으로 변환해주기
	double a1[] = new double[a.length];
	//조작된 점수 구하기
	for(int i=0; i<cls; i++)
	{
		a1[i] = (double)a[i]/(double)max*100;
	}
	
	//새로운 점수 합 구하기
	double sum = 0;
	for(int i=0; i<cls; i++)
	{
		sum += a1[i];
	}
	
	//새로운 점수 평균
	double avr = sum/(double)cls;
	System.out.println(avr);
	
	}

}