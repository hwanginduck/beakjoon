package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_CallNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			char[] num = new char[input.length()];
			num = input.toCharArray();
			
			int call[] = new int[num.length];
			
			for(int i=0; i<num.length; i++) {
				call[i] = Integer.valueOf(num[i]);
				if(call[i]>82) {
					call[i] = call[i]-1;
				}
				
				if(call[i]>88) {
					call[i] = call[i]-1;
				}
				call[i] = (call[i]-65)/3+3;
			}

			int calling = 0;
			for(int i=0; i<call.length; i++) {
				calling += call[i];
			}
			
			System.out.println(calling);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
