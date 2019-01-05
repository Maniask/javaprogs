// Importing Scanner Class from the util pacakage. 
import java.util.Scanner; 

/* 
  This is the program for finding if the given number is even or odd.
  Created By: Mani Agarwal
  Email : agarwalmani22@gmail.com
  Date  : 05-01-2019
*/

// Begining of Class Add
 class Add
 {
   public static void main(String[] arg)
   {
      int a,b,c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number");
      a=sc.nextInt();
      System.out.println("Enter second number");
      b=sc.nextInt();
      c=addition(a,b);
      System.out.println(" Addition of two numbers is : "+c);
   } // Main Function End.

   // Start of Addition Method (Function)
   
   static int addition(int x,int y)
   {
	  return x+y;
   } // End of Function addition
   
}// End of Class Add