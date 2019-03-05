/*
This is a java program to perform arithmetic operations on two numbers.
Created By: Mani Agarwal
Email : agarwalmani22@gmail.com
Date  : 05-03-2019
*/

import java.util.*;
public class Arithmetic {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the 1st number");
		a=sc.nextInt();
		System.out.println("Enter the 2nd number");
		b=sc.nextInt();
		System.out.println("Sum of the numbers is"+(a+b));
		System.out.println("Subtraction of the numbers is"+(a-b));
		System.out.println("Division of the numbers is"+(a/b));
		System.out.println("Multiplication of the numbers is"+(a*b));
		System.out.println("Remainder of "+a+" % "+b+" is "+(a%b));
	}

}
