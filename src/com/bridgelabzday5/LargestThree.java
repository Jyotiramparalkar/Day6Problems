package com.bridgelabzday5;

import java.util.Scanner;  
public class LargestThree  
{  
	public static void main(String[] args)   
	{  
		int a, b, c, largest, temp;    
		Scanner in = new Scanner(System.in);  
		//reading input from the user  
		System.out.println("Enter the first number:");  
		a = in.nextInt();  
		System.out.println("Enter the second number:");  
		b = in.nextInt();  
		System.out.println("Enter the third number:");  
		c = in.nextInt();    
		temp=a>b?a:b;  
		largest=c>temp?c:temp;   
		System.out.println("The largest number is: "+largest);  
	}  
}  