package Beakjoon_D;

import java.util.Scanner;

public class D_OXquiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner 객체 생성 및 import
		Scanner sc = new Scanner(System.in);

//		몇가지 케이스를 입력 받을 것인지 입력받음
		int value_case = sc.nextInt();
//		최종점수를 저장할 배열 생성
		int grand_score[] = new int[value_case];
		
//		입력 받은 수만큼 for문을 돌려 케이스마다 배열에 입력 받음.
		for(int i=0; i<value_case; i++)
		{
			String ox = sc.next();			
//		    입력받은 케이스마다 한글자씩 배열에 넣음
			String oxquiz[] = ox.split("");
//			각 자리수 점수를 계산할 배열을 만듬
			int score[] = new int[oxquiz.length];

//			for문을 돌려서 자리수마다 점수를 구함
			for(int i1=0; i1<oxquiz.length; i1++)
			{
//				배열의 자리수가 O이랑 같고,
				if(oxquiz[i1].equals("O"))
				{
//					0번째 배열이라면 값을 1로
					if(i1==0)
					{
						score[i1] = 1;
					}
//					0번째가 아닌 즉 1번칸부터는 앞칸 +1을 그 자리에 넣는다.(누적점수 계산)
					else if(i1 != 0)
					{
						score[i1] = score[i1-1] +1;
					}
				}
//				X일경우는 점수의 초기화를 위해서 배열의 자리값을 0으로 넣는다.
				else if(oxquiz[i1].equals("X"))
				{
					score[i1] = 0;
				}
			}
			
//			각 배열에 점수를 넣었으니, for문을 돌려서 점수를 합해준다.
			for(int i1=0; i1<oxquiz.length; i1++)
			{
				grand_score[i] += score[i1];
			}
		}
//		점수를 출력
		for(int i=0; i<value_case; i++)
		{
			System.out.println(grand_score[i]);
		}
	}
}
