package com.bridgelabz;

import java.util.Scanner;

//Java program to determine whether the number is
//Armstrong number or not

public class PerfectNumber 
{
	public static void main(String[] args)
	{

		int n=123 ;
		int temp = n;
		int p = 0;
	
		while (n > 0) 
		{

			int rem = n % 10;
			p = (p) + (rem * rem * rem);
			n = n / 10;
		}

		
		if (temp == p) 
		{
			System.out.println("Yes. It is Armstrong No.");
		}
		else 
		{
			System.out.println("No. It is not an Armstrong No.");
		}
	}
}
