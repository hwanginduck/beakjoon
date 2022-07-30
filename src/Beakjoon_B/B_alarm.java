package Beakjoon_B;

import java.util.Scanner;

public class B_alarm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int A = 45;
		if(M - A < 0)
		{
			H = H  - 1;			   
			M = 60 + (M - A); 
			if(H < 0)			            
				{
				H = H + 24;		   
				}
		}else if(M - A < 60)
		{
			M = M - A;
		}

		System.out.print(H+" ");
		System.out.print(M);
		
	}

}
