package Beakjoon_C;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class C_BufferReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine()
		StringTokenizer st = new StringTokenizer(s);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<a; i++)
		{
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		br.close();
		bw.write(b+c+"\n");
		}
	bw.flush();
	bw.close();
	}
	

}
