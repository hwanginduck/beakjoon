package Beakjoon_F;

import java.util.Scanner;

public class F_Sangsu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String input1 = sc.next();
		String input2 = sc.next();
		
		String arr1[] = new String[input1.length()];
		arr1 = input1.split("");
		String value1 = "";
		for(int i=2; i >=0; i--) {
			value1 += arr1[i];
		}
		int num1 = Integer.parseInt(value1);
		
		String arr2[] = new String[input2.length()];
		arr2 = input2.split("");
		String value2 = "";
		for(int i=2; i >=0; i--) {
			value2 += arr2[i];
		}
		int num2 = Integer.parseInt(value2);

		if(num1 > num2) {
			System.out.println(num1);
		}else
			System.out.println(num2);
		
	}

}
