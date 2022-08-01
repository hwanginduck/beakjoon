package Beakjoon_E;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class E_Selfnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		상수를 구해서 넣을 list 생성
		Collection ssnum = new ArrayList();
//		for문을 돌려 10,000보다 작은 상수를 모두 구해서 리스트에 넣기
		for(int i=0; i<10000; i++)
		{
			int a = i/10000;  		// 9999 = 0
			int b = i%10000/1000;	// 9999 = 9999%10000 = 9999/1000 = 9
			int c = i%1000/100;		// 9999 = 9999%1000 =999/100 = 9
			int d = i%100/10;		// 9999 = 9999%100 =99/10 = 9
			int e = i%10; 			// 9999 = 9999%10 = 9
			
			int x = a + b + c + d + e + i;
			
			if(x<=10000)
			{
				ssnum.add(x);
			}
			
		}
//		리스트에 상수 정렬
//		Collections.sort(ssnum);
//		상수 입력 확인
//		System.out.println(ssnum);
		
//		상수랑 비교할 리스트 생성
		Collection num1 = new ArrayList();
		for(int i=0; i<10000; i++)
		{
			num1.add(i);
		}
		
		List<String> targertList1 = new ArrayList<String>(ssnum);
		List<String> targertList2 = new ArrayList<String>(num1);
		
//		targertList1.removeAll( num1 );
		targertList2.removeAll( ssnum );
		
//		System.out.println("ssnum" + targertList1.toString());
		System.out.println("num1" + targertList2.toString());

		String selfnum []  = targertList2.toArray(new String[targertList2.size()]);
		
		for(int i=0; i<selfnum.length; i++)
		{
			System.out.println(selfnum[i]);
		}
		
		
		
		
		
//		ArrayList selfnumber = new ArrayList();
//		
//		selfnumber.add(targertList2.toString());
//	
//		System.out.println(selfnumber);
//		
////		String selfnum[] = new String[selfnumber.size()];
////		
////		for(int i = 0; i<selfnumber.size(); i++)
////		{
////			selnum[i] = 
////		}
		
		
	}
}
