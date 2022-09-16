package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber1   
{  
	public static void main(String[] args)   
	{  
		System.out.println("Enter the Number ::");
		Scanner in = new Scanner (System.in);
		in.nextInt();
		int n=0;
		int reverse = 0;  

		for( ;n != 0; n=n/10)   
		{  
			int remainder = n % 10;  
			reverse = reverse * 10 + remainder;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}  
}  