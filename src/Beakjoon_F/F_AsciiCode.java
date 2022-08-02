package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_AsciiCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력을 받기 위해서 bufferedReader 객체 생성 및 impert
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		buffer로 입력 받을 때는 try ~ catch 형식을 반드시 사용해야 한다!
		try {
			char N = br.readLine().charAt(0);
			int num = N;
			System.out.println(num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
