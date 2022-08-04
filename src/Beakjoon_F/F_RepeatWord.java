package Beakjoon_F;


import java.util.Scanner;

public class F_RepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력받기 위한 scaner 객체 생성
		Scanner sc = new Scanner(System.in);
//			몇번 할것인지 입력 받음
			int input = sc.nextInt();
//			출력할때 사용할 배열 생성
			String printing[] = new String[input];
//			위에서 몇번 할 것인지에 대해서 반복문 실행
			for(int i1=0; i1<input; i1++)
			{
//				문자를 몇번 반복해서 출력 할 것인지 입력 받음
				int cycle = sc.nextInt();
//				어떤 문자를 반복 할 것인지 입력 받음
				String word = sc.nextLine();
//				입력 받은 문자에서 빈공간 삭제
				word = word.trim();
//				배열에 한글자씩 넣어줌
				String[] array_word = word.split("");
//				문제에서 원하는 방식으로 출력을 하기 위해서 printing배열에 문자를 원하는 갯수만큼 반복해서 더해줌
				for(int i2=0; i2<array_word.length; i2++)
				{
					for(int i3=0; i3<cycle; i3++)
					{
//						기본적으로 배열자체가 첫번째가 null이기 때문에 처음에는 문자를 그대로 입력함
						if(printing[i1] == null)
						{
							printing[i1] = array_word[i2];  			
//						null이 아니라면 누적으로 원하는 반복 횟수만큼 더해줌	
						}else
						printing[i1] += array_word[i2];  
					}
				}
			}
//			반복문만큼 입력이 됬으니 출력을 해준다.
			for(int i=0; i<input; i++)
			{
//				그냥 print 로 출력을 하면 가로로 나오기 때문에 한번 배열이 반복되면 다음줄로 넘어갈수 있게 "\n"을 붙여준다.
				System.out.print(printing[i]+"\n");
			}
	}
}