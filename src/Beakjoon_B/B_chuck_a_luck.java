package Beakjoon_B;

import java.util.Scanner;

public class B_chuck_a_luck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Scanner sc = new Scanner(System.in);
	 
	 int x = sc.nextInt();
	 int y = sc.nextInt();
	 int z = sc.nextInt();
	 int s = 0;
	if(x == y && y == z)
	{
		s = 10000 + (x * 1000);
	}else
	if(x == y)
	{
		s = 1000 + (x *100);
	}else
	if(y == z)
	{
		s = 1000 + (y *100);
	}else
	if(x == z)
	{
		s = 1000 + (z *100);
	}
	if(x != y && y != z && x != z)
	{
		if(x > y && x > z)
		{
			s = x * 100;
		}else
		if(y > x && y > z)
		{
			s = y * 100;
		}else
		{
			s = z * 100;
		}
	}
	System.out.println(s);
	}
}
