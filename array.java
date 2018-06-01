package com.basic;

import java.util.Scanner;

public class array {
	public static void main(String args[])
	{
		{
		       int i, j, temp;
		       int arr[] = new int[10];
		       Scanner scan = new Scanner(System.in);
			   System.out.print("Enter Array Elements : ");
		       for(i=0; i<10; i++)
		       {
		           arr[i] = scan.nextInt();
		       } 
		       j=i-1;
		       i=0;
		       while(i<j)
		       {
		           temp = arr[i];
		           arr[i] = arr[j];
		           arr[j] = temp;
		           i++;
		           j--;
		       }
			    System.out.print("Now the Reverse of Array is : \n");
		      for(i=0; i<10; i++)
		       {
		          System.out.print(arr[i]+ "  ");
		       }       
		   
		}
	 
	}

}


