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
			word = word.toUpperCase();
			int alpha[] = new int[word.length()];

//			String > 한글자씩 나눠주고 > 대문자로 바꿔주 > 한글자씩을 char형으로 변환 > int 형으로 변환
			char[] words = word.toCharArray();
			for(int i=0; i<words.length; i++){
				alpha[i] = words[i]-65;	
			}	
//			알파벳에 맞게 카운팅을 해줌
			int count[] = new int[26];
//			
			for(int i=0; i<alpha.length; i++) {
				count[alpha[i]]++;
			}
			
			int MaxCount = 0; //많이 나온 횟수
			int ManyAlpha = 0; //어떤 알파벳이 많이 나왓는지 확인
			
			for(int i=0; i<count.length; i++) {
				if(MaxCount < count[i]) {
					MaxCount = count[i];
					ManyAlpha = i;
				}		
			}
			ManyAlpha = ManyAlpha+65;
			char printAlpha = (char)ManyAlpha;
			String printprint = String.valueOf(printAlpha);
			
			System.out.println("최다 출현 알파벳은 " +printprint +"최다 횟수는 " +MaxCount);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
