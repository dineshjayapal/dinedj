package com.basic;

public class arr {
	public static void main(String args[])
	{
		int N=1234;
		int t=N;
		int arr[]=new int[10];
		int i=0;
		while(t>0)
		{
			int reminder =t%10;
			arr[i]=reminder;
			i++;
			t=t/10;
		}
		for(i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
	}

}
