package com.bridgelabzday5;

import java.util.Scanner;
public class VowelOrConstant 
{
   public static void main(String args[])
   {
      System.out.println("Enter a character ::");
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
      {
         System.out.println("Given character is an vowel");
      }else{
         System.out.println("Given character is a consonant");
      }
   }
}