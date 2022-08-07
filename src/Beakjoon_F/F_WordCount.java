package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			input = input.trim();
			String count[] = input.split(" ");
			
			System.out.println(count.length);				
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
