package Beakjoon_D;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class D_Namurji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		
		// 숫자 10개 입력 받음.
		for(int i=0; i<10; i++)
		{
			a[i] = sc.nextInt();
		}
		
		//각 배열에 있는 값을 42로 나누어 나머지를 다시 배열에 넣어줌.
		for(int i=0; i<10; i++)
		{
			a[i] = a[i]%42;
		}

		//계산된 a 배열에 대해서 정수 값으로 변환하는 a1배열로 재할당
		String a1[] = new String[a.length];
		for(int i=0; i<10; i++)
		{
			a1[i] = String.valueOf(a[i]);
		}
		
		//배열에 들어 있는 값 순서대로 정렬
		TreeSet hs = new TreeSet();
		for(int i=0; i<a1.length; i++)
		{
			hs.add(a1[i]);
		}
		//반복자
		Iterator it = hs.iterator();
		
		int Namurji = 0;
		
		while(it.hasNext())
		{
			it.next();
			Namurji = Namurji + 1;
		}
		
		System.out.println(Namurji);
		
	}	
}


