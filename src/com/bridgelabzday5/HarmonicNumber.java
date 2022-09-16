package com.bridgelabzday5;

import java.util.Scanner;

public class HarmonicNumber 
{
	public static void main(String args[])
	{

		int num ;
		double result = 0.0;
		System.out.println("enter the number  :: ");
		Scanner in = new Scanner (System.in);
		num=in.nextInt();
		while (num > 0) {

			result = result + (double)1 / num;
			num--;
			System.out.print(result + ",");
		}
	}
}
