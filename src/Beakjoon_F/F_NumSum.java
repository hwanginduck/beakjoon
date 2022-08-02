package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_NumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BufferedReader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Buffer는 try~catch 를 사용해야 한다.
		try {
//			먼저 몇개의 숫자를 입력 받을지 정한다.
			String num1 = br.readLine();
//			숫자를 String형으로 받았기 때문에, int형으로 형변환 시킨다.
			int int_num1 = Integer.parseInt(num1);
//			이제 연산을 할 숫자를 입력받는다.
			String num2 = br.readLine();
//			입력 받은 숫자를 넣을 배열을 생성한다.
			int sumnum[] = new int[int_num1];
//			for문을 돌려 문자로 받은 두번째 숫자를 하나씩 나누면서, int형으로 형변환을 시켜주고, 배열에 넣어준다.
			for(int i=0; i<int_num1; i++)
			{
				sumnum[i] = Integer.parseInt(num2.substring(i,i+1));	
			}
//			합을 구해줄 변수를 지정해주고,
			int sum = 0;
//			배열에 들어있는 숫자들을 모두 더해준다.
			for(int i=0; i<int_num1; i++)
			{
				sum += sumnum[i];
			}
//			마지막 출력을 해주면 끝.
			System.out.println(sum);
		}
		catch(IOException e){
		}
	}
}
