/* 
  This is the java program for adding the two matrix given by the user.
  Created By: Mani Agarwal
  Email : agarwalmani22@gmail.com
  Date  : 05-01-2019
*/

import java.util.Scanner;
class MatAdd
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no. of rows of the 1st matrix");
	 int r1=sc.nextInt();
	 System.out.println("Enter the no. of columns of the 1st matrix");
	 int c1=sc.nextInt();
	 System.out.println("Enter the no. of rows of the 2nd matrix");
	 int r2=sc.nextInt();
	 System.out.println("Enter the no. of columns of the 2nd matrix");
	 int c2=sc.nextInt();
	 if(r1!=r2 && c1!=c2)
	 {
	   System.out.println("Error");
	   System.exit(1);
	 }
	 int m1[][]=new int [r1][c1];
	 int m2[][]=new int [r2][c2];
	 int m3[][]=new int [r1][c1];

	 //input m1
	 System.out.println("Enter the elements in 1st matrix ");
	 for(int i=0;i<r1;i++)
	 {
		 for(int j=0;j<c1;j++)
		 {
			 System.out.print("Enter Element "+(i+1)+","+(j+1)+"\t");
			 m1[i][j]=sc.nextInt();
		 }
	 }

	 //input m2
	 System.out.println("Enter the elements in 2nd matrix ");
	 for(int i=0;i<r2;i++)
	 {
		 for(int j=0;j<c2;j++)
		 {
			 System.out.print("Enter Element:  "+(i+1)+","+(j+1)+"\t");
			 m2[i][j]=sc.nextInt();
		 }
	 }

	 //display of 1st matrix
	 System.out.println("1st matrix entered by you is \n" );
	 for(int i=0;i<r1;i++)
	 {
		 System.out.print("\n");
		 for(int j=0;j<c1;j++)
		 {
			 System.out.print(m1[i][j]+"\t");
		 }
	 }

	 //display of 2nd matrix
	 System.out.println("2nd matrix entered by you is ");
	 for(int i=0;i<r2;i++)
	 {
		 System.out.print("\n");
		 for(int j=0;j<c2;j++)
		 {
			 System.out.print(m2[i][j]+"\t");
		 }
	 }

	 //Matrix Addition
	 System.out.println("Matrix after addition is : \n" );
	 for(int i=0;i<r1;i++)
	 {
		 System.out.print("\n");
		 for(int j=0;j<c2;j++)
		 {
			 m3[i][j]=m1[i][j]+m2[i][j];
			 System.out.print(m3[i][j]+"\t ");
		 }
	 }
   }
}