package Beakjoon_F;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class F_SearchAtoZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int search[] = new int[s.length()];
			for(int i=0; i<s.length(); i++)
			{
				char a = s.charAt(i);
				int ask = a;
				search[i] = ask;
			}
			int AtoZ[] = new int[26];
			for(int i1=0; i1<s.length(); i1++)
			{
				for(int i2=0; i2<26; i2++)
				{
					if(search[i1] == i2+97)
					{
						AtoZ[i2] = i2;
						break;
					}else
					{
						AtoZ[i2] = -1;
					}
				}
			}
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

//1 0 -1 -1 2 -1 -1 -1 -1 4 3 -1 -1 7 5 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1
