package com.bridgelabzday5;

import java.util.Scanner;

public class SwappingNumbers {  
    public static void main(String[] args) {  
       int x, y, t;   
       Scanner in = new Scanner(System.in);  
       System.out.println("Enter the value of X and Y");  
       x = in.nextInt();  
       y = in.nextInt();  
       System.out.println("before swapping numbers: "+x +" "+ y);
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping:"+x +" " + y);  
       System.out.println( );  
    }    
} 