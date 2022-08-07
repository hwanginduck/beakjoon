package Beakjoon_F;

import java.util.Scanner;

public class F_WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
			String input = sc.nextLine();
			input = input.trim();
			
			String count[] = input.split(" ");
			
			if(count[0].equals("")) {
				System.out.println(count.length -1);
			}else {
				System.out.println(count.length);				
			}
	}
}
