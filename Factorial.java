/* 
  This is the java program for finding the factorial of the given number.
  Created By: Mani Agarwal
  Email : agarwalmani22@gmail.com
  Date  : 05-01-2019
*/

import java.util.Scanner;
class Factorial
{
   public static void main(String args[])
   {
	 int fact=1;  
	 Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number whose factorial you want to find");
     int n=sc.nextInt();
     for(int i=1;i<=n;i++)
     fact=fact*i;	 
	 System.out.println("Factorial of the given number is: "+fact);
   }
}   	 