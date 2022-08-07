package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_WordStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
//			문자를 buffer로 입력 받음
			String word = br.readLine();
//			모두 대문자로 변환
			word = word.toUpperCase();
//			String형 문장을 char 형으로 한글자씩 변환하여 넣어주는 배열을 생성하고,
			char[] words = word.toCharArray();
//			int형으로 바꿔서 넣어줄 배열을 생성
			int alpha[] = new int[word.length()];
//			int형 배열에 char배열을 넣어준다. 대문자 A가 65이기 때문에 -65를 해준다
			for(int i=0; i<words.length; i++){
				alpha[i] = words[i]-65;	
			}	
//			0~26까지 즉 알파벳 갯수에 맞게 배열을 생성해주고
			int count[] = new int[26];
//			알파벳 배열에 즉 A가 0으로 변환 되었으니 alpha배열이 0이라면 count[0]에 +1 을 누적시켜서
//			각 알파벳에 해당하는 숫자의 배열칸에 중첩을 시켜준다.
			for(int i=0; i<alpha.length; i++) {
				count[alpha[i]]++;
			}
//			각 제일 많은 횟수, 다음으로 많은 횟수, 제일 많이 나온 숫자를 구해줄 변수를 지정
			int MaxCount = 0; // 제일 많이 나온 횟수 
			int SecondCount = 0; // 그다음으로 많이 나온 횟수
			int ManyAlpha = 0; //제일 많이 나온 숫자
//			집중!
//			MaxCount는 처음에는 0이지만, count배열에는 아까 전에 돌려서 카운팅을 해준 숫자들이 들어있다.
//			즉 A가 두번나왔다면, Count[0]에는 2가 저장되어 있고, C가 5번 나왔다면 count[2] = 5가 저장되어 있다.
			for(int i=0; i<count.length; i++) {
//				MaxCount(0) < count[0~26] 돌린다. 큰수가 나올때마다 MaxCount의 변수를 갱신 해준다.
				if(MaxCount < count[i]) {
					MaxCount = count[i];
//					ManyAlpha를 구할때, 0번칸에 a의 횟수가,26번칸에는 z의횟수가 들어가 있다.
//					즉 갱신될떄, i값을 알파벳의 값이다.
					ManyAlpha = i;
//				혹시 MaxCount가 원래는 위에서는 더클때만 갱신되는데 만약 같다면 SecondCount에 그 수를 저장하여,
//				혹시나 같은 수가 두번나오면, 그수를 기억해서 출력시 ? 를 출력해주자
				}else if(MaxCount == count[i]) {
					SecondCount = count[i];
				}
			}
//			출력시 int형으로 계산한 알파벳을 원래대로 String형으로 출력을 하기 위해서 int>char>String 형변환
			ManyAlpha = ManyAlpha+65;
			char printAlpha = (char)ManyAlpha;
			String printprint = String.valueOf(printAlpha);
//			Max가 Second랑 같지 않다면, 즉 제일 크다면 큰알파벳을 출력
			if(MaxCount != SecondCount) {
				System.out.println(printprint);
//				혹시 Max랑 Secound랑 같다면 ? 를 출력
			} else if(MaxCount == SecondCount) {
				System.out.println("?");
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
