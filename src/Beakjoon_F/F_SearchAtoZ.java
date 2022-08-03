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
		
			for(int i1=0; i1<26; i1++)
			{
				for(int i2=0; i2<search.length; i2++)
				{
					if(search[i2] == i1+97)
					{
						AtoZ[i1] = i2;
						break;
					}
					{
						AtoZ[i1] = -1;
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

