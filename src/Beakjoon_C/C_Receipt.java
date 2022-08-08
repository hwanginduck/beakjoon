package Beakjoon_C;

import java.util.Scanner;

public class C_Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		받아온 영수증을 검산하는 파일
//		입력을 받기위한 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
//		지불한 돈을 pay 변수에 저장!
		int pay = sc.nextInt();
//		몇번 입력을 받을지 즉, 몇가지 품목을 삿는지 입력을 받는다
		int cycle = sc.nextInt();
//		각 품목별 단가 * 수량으로 값을 구해줄 배열 생성
		int sum[] = new int[cycle];
//		단가와 몇개를 삿는지 입력을 받기 위해 for문을 돌려준다.
		for(int i=0; i<cycle; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
//			위에서 만들어 놓은 배열에 단가 * 수량!
			sum[i] = price * num;
		}
//		총 가격을 검산하는 변수를 생성
		int total = 0;
//		for문을 돌려 배열에 저장된 각각의 가격의 합을 더해준다
		for(int i=0; i<sum.length; i++) {
			total += sum[i];
		}
//		지불 금액과 총합을 비교하여 맞다면 yes, 틀리다면 no!
		if(pay == total) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
	}

}
