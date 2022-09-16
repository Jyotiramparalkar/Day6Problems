package com.bridgelabzday5;

import java.util.Scanner;

public class PrimeFactor {

	  public static void main(String[] args) {

	    // positive number
	    int num;

	    System.out.print("Enter the Number :: ");
	    Scanner in = new Scanner(System.in);
	    num=in.nextInt();
	    
	    for (int i = 1; i <= num; ++i) 
	    {
	      if (num% i == 0) {
	        System.out.print(i + " ");
	      }
	    }
	  }
	}