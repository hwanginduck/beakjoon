package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_SearchAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		bufferedreader 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		bufferedreader를 사용하기 위한 try ~ catch
		try {
//		계산할 문자 입력받기
			String s = br.readLine();
//			입력받은 문자를 각각 넣을 배열 생성
			int search[] = new int[s.length()];
//			반복문을 돌림
			for(int i=0; i<s.length(); i++)
			{
//				한글자당 하나를 int형으로 형변환 하여 아스키드 코드로 변경해준다
				char a = s.charAt(i);
				int ask = a;
				search[i] = ask;
			}
//			A~Z에 해당하는 숫자를 넣어줄 26크기의 배열을 생성한다.
			int AtoZ[] = new int[26];
//			두배열을 돌려서 각각 아스키드 코드랑 +97(즉A)랑 같으면 각각의 숫자를 넣어준다.
			for(int i1=0; i1<26; i1++)
			{
				for(int i2=0; i2<search.length; i2++)
				{
					if(search[i2] == i1+97)
					{
						AtoZ[i1] = i2;
						break;
					}else
					{
						AtoZ[i1] = -1;
					}
				}
			}
//			문제에서 원하는 방식대로 출력
			for(int i=0; i<AtoZ.length; i++)
			{
				System.out.print(AtoZ[i] +" ");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

