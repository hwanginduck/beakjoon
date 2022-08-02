package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String num1 = br.readLine();
		
			int int_num1 = Integer.parseInt(num1);
		
			String num2 = br.readLine();
			
			int sumnum[] = new int[int_num1];
			
			for(int i=0; i<int_num1; i++)
			{
				sumnum[i] = Integer.parseInt(num2.substring(i,i+1));	
			}
			int sum = 0;
			
			for(int i=0; i<int_num1; i++)
			{
				sum += sumnum[i];
			}
			System.out.println(sum);
		}
		catch(IOException e){
		}
	}
}
