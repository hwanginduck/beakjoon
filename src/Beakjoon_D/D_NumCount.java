package Beakjoon_D;

import java.util.Scanner;

public class D_NumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num[] = new int[3];
		int g = 1;
		int a = 0;
		int b = 0;
		int c = 10;
		
//		입력받은 3개의 숫자 곱해주기		
		for(int i=0; i<3; i++)
		{
			num[i] = sc.nextInt();
			g = num[i] * g;
		}
//		System.out.println(g);
		
//		숫자 3개를 곱한 g의 자릿수 구해주기		
		do
		{
			b = g / (int)Math.pow(10, c);
			c--;
		}while(b == 0);
//		System.out.println(c);
		
//		나누기 배열에 각 자리수대로 숫자 한개씩 넣어주기
		int nanugi[] = new int[(c+2)];
		do
		{
			nanugi[a] = g%10;
			g = g/10;
			a++;
		}while(a<(c+2));

//		total 배열에 순서대로 숫자 집어 넣어 주기!
		int total[] = new int[10];
		for(int i=0; i<10; i++)
		{
			total[i] = i;
		}
//--------------------------------------------------------------------------------
		
		int grandtotal[] = new int[10];
		for(int i = 0; i < 10; i ++)
		{
			for(int v=0; v<(c+2); v++)
			{
				if(total[i] == nanugi[v])
				{
					grandtotal[i] = grandtotal[i]+1;
				}
			}
		}

		for(int i = 0; i<10; i++)
		{
			System.out.println(grandtotal[i]);
		}
		
	}

}