package Beakjoon_E;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_hannum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	입력 받을 스캐너 객체 생성
	Scanner sc = new Scanner(System.in);
//		입력 받은 값을 input 변수로 지정
		int input = sc.nextInt();		
//		한수를 계산해서 넣을 리스트 생성
		List hannum = new ArrayList();
//		반복문을 통해 입력 받은 input의 크기만큼 반복문을 돌려줌
		for(int i=1; i<=input; i++)
		{
//			각 자리수를 구해줌
			int a = i/1000; 
			int b = i%1000/100;
			int c = i%100/10;
			int d = i%10;
//			100보다 작으면 모두 한수이기 때문에 그대로 리스트에 넣어줌
			if(i<100)
			{
				hannum.add(i);
//			100보다 같거나 크고 1000보다 작다면 첫째자리와 둘째자리를 뺀값과 둘째자리와 셋째자리를 뺏 값이 같다면 한수이기 때문에 리스트에 추가
			}else if(i>=100 && i<1000 && d-c == c-b)
			{
				hannum.add(i);
//			문제에서는 1000까지를 구해야 하기 때문에 1000보다 같거나 큰 경우도 마찬가지로 한수를 구해줌
			}else if(i>=1000 && d-c == c-b && c-b == b-a)
			{
				hannum.add(i);
			}
		}
//		hannum에 들어있는 값은 모두 한수이기 때문에 한수를 입력한 갯수 즉 리스트의 싸이즈를 출력
		System.out.println(hannum.size());
	}

}
