package Beakjoon_E;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_hannum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();		
		int count = 0;
		List hannum = new ArrayList();
		
		for(int i=1; i<=input; i++)
		{
			int a = i/1000; 
			int b = i%1000/100;
			int c = i%100/10;
			int d = i%10;
			
			if(i<100)
			{
				hannum.add(i);
			}else if(i>=100 && i<1000 && d-c == c-b)
			{
				hannum.add(i);
			}else if(i>=1000 && d-c == c-b && c-b == b-a)
			{
				hannum.add(i);
			}
		}
		System.out.println(hannum.size());
	}

}
