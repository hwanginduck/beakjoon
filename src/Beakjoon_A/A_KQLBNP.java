package Beakjoon_A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_KQLBNP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		scanner 객체를 사용하면 더 간단하지만, 익숙하지 않은 buffer를 더 활용해보자!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		buffer를 입력 받기 위핸 try ~ catch
		try {
//			입력 받은 값을 input 변수에 저장
			String input = br.readLine();
//			입력 받은 값을 띄어쓰기 단위로 arr 배열에 넣어준다.
			String arr[] = input.split(" ");
//			입력받은 값을 인트형으로 변환하기 위한 int 형 배열을 생성
			int i_arr[] = new int[arr.length];
//			int형 배열에 입력 받은 값은 int형으로 형변환하여 넣어준다.
			for(int i=0; i<i_arr.length; i++) {
				i_arr[i] = Integer.parseInt(arr[i]);
			}
//			이제 값을 비교할 내가 비교하고자 할 배열을 만들어 주고
			int value[] = {1, 1, 2, 2, 2, 8};
//			for문을 돌려 내가 원하는 값으로 배열을 수정하면서 출력을 해준다!
			for(int i=0; i<value.length; i++){
				i_arr[i] = value[i] - i_arr[i];
				System.out.print(i_arr[i] +" ");
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
