package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int num1,num2;
		int count=0;
		System.out.println("Enter start & end range");
		Scanner in = new Scanner(System.in);
		num1=in.nextInt();
		num2=in.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int n=i;
			int a=2;
			int temp=0;
			while (a<=(n/2))
			{
				if((n%a)==0)
				{
					temp++;
					break;
				}
				a++;
			}
			if(temp==0 && i!=1)
			{
				count++;
			}
		}
		System.out.println("total Prime number is ::"+count);
	}


}
