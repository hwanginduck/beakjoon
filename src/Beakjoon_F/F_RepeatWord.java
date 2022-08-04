package Beakjoon_F;


import java.util.Scanner;

public class F_RepeatWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int input1 = sc.nextInt();
			String printing[] = new String[input1];
			for(int i1=0; i1<input1; i1++)
			{
				int s_cycle = sc.nextInt();
				String word = sc.nextLine();
				word = word.trim();
				String[] array_word = word.split("");
				for(int i2=0; i2<array_word.length; i2++)
				{
					for(int i3=0; i3<s_cycle; i3++)
					{
						if(printing[i1] == null)
						{
							printing[i1] = array_word[i2];  							
						}else
						printing[i1] += array_word[i2];  
					}
				}
			}
			for(int i=0; i<input1; i++)
			{
				System.out.print(printing[i]+"\n");
			}
	}
}