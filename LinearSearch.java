/* 
  This is the java program for performing the linear search.
  Created By: Mani Agarwal
  Email : agarwalmani22@gmail.com
  Date  : 05-01-2019
*/
import java.util.Scanner;
class LinearSearch
{
   public static void main(String args[])
   {
         Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the no.of elements in the array");
	 int n=sc.nextInt();
	 int a[]=new int[n];
	 int i;

	 //input array
	 for(i=0;i<n;i++)
	 {
		 System.out.println("Enter element : "+(i+1)+" ");
		 a[i]=sc.nextInt();
	 }
	 System.out.println("Enter the element you want to search");
	 int item=sc.nextInt();

	 //Searching
	 boolean found=false;
	 for(i=0;i<n;i++)
	 {
		 if(a[i]==item)
		 {
			 found=true;
			 break;
		 }
	 }
	 if(found=true)
		 System.out.println("Found at position : "+(i+1));
	 else
		 System.out.println("Not found");
   }
}   	 