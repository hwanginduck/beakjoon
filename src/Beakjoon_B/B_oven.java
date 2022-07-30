package Beakjoon_B;

import java.util.Scanner;

public class B_oven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int S = sc.nextInt();
		int A = 0;
		if(M + S >= 60)
		{
			A = (M + S)/ 60;	  
			H = H + A;			   
			M = (M + S)- (60 * A); 
			if(H >= 24)			            
				{
				H = H -24;		   
				}
		}else if(M + S < 60)
		{
			M = M + S;
		}

		System.out.print(H+" ");
		System.out.print(M);
		
	}

}
