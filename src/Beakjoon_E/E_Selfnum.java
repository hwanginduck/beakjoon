package Beakjoon_E;

import java.util.ArrayList;
import java.util.List;

public class E_Selfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		상수를 넣기 위한 list 생
		List<Integer> ssnum = new ArrayList();
//		상수를 구하기 각 자리수의 정수를 구해서 계산한다.
		for(int i=0; i<10000; i++)
		{
			int a = i/10000;  		// 9999 = 0
			int b = i%10000/1000;	// 9999 = 9999%10000 = 9999/1000 = 9
			int c = i%1000/100;		// 9999 = 9999%1000 =999/100 = 9
			int d = i%100/10;		// 9999 = 9999%100 =99/10 = 9
			int e = i%10; 			// 9999 = 9999%10 = 9
			int x = a + b + c + d + e + i;
//			문제에서 말하는 10,000보다 작은 값을 위해서 조건식을 걸어줌
			if(x<=10000)
			{
				ssnum.add(x);
			}
		}
//		상수랑 비교를 할 1~10,000까지를 모두 넣은 비교 list 생성
		List<Integer> selfnum = new ArrayList();
		for(int i=0; i<10000; i++)
		{
			selfnum.add(i);
		}
//		1~10,000까지 모두 넣은 리스와 상수를 비교해서 상수를 제거
		selfnum.removeAll(ssnum);
//		문제에서 원하는 형식으로 출력하기 위한 배열생성
		int[] selfnumber = new int[selfnum.size()];
//		리스트를 배열에 차례대로 넣어준다.
		for(int i=0; i<selfnum.size(); i++)
		{
			selfnumber[i] = selfnum.get(i).intValue();
		}
//		출력
		for(int i=0; i<selfnumber.length; i++)
		{
			System.out.println(selfnumber[i]);
		}
	}
}
