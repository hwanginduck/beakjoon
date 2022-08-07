package Beakjoon_F;

import java.util.Scanner;

public class F_WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력을 받기 위한 Scaner 객체 생성
		Scanner sc = new Scanner(System.in);
//			입력을 받는 변수 input 
			String input = sc.nextLine();
//			처음과 끝이 공백으로 될수 있기 때문에 trim으로 없애준다.
			input = input.trim();
//			count배열에 input을 띄어쓰기 기준으로 나누어 넣어준다.
			String count[] = input.split(" ");
//			문제의 제일 헷깔리는 점 공백만 입력을 할경우가 있으니 공백을 없애줬음에도 불구하고 처음칸이 0이라면
			if(count[0].equals("")) {
//				길이가 1이 되기 때문에 -1 을 해줘서 단어는 없다 0으로 나타나도록 해준다.
				System.out.println(count.length -1);
			}else {
//			위의 경우를 제외하고는, count 배열의 길이가 곧 단어의 갯수이다.
				System.out.println(count.length);				
			}
	}
}
