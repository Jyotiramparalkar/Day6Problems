package com.bridgelabzday5;

import java.util.Scanner;  

public class QuentientndReminder 
{  

	public static void main (String[] args) 
	{  
		System.out.println("Enter the value of num1 and num2");  
		Scanner sc = new Scanner(System.in);  
		int num1 = sc.nextInt();  
		int num2 = sc.nextInt();  
		int quot = 0, remainder = 0;  

		quot = num1 / num2;  

		remainder = num1 % num2;  

		System.out.println("Quotient"+num1+"/"+num2+" is:"   

+ quot);  
		System.out.println("Remainder"+num1+"is divided by "   

+num2+"is:"+remainder);  
	}  
}  