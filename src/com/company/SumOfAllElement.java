package com.company;

public class SumOfAllElement 
{

	public static void main(String[] args) 
	{
		int[] arr = {3, 4, 5, 6, 78, 78, 82, 2 };

		int sum =0;
		for (int i = 0; i < arr.length; i++) 
		{

			sum=arr[i]+sum;
		}
		System.out.println("Sum of the all number in the array is "+sum);
	}

}
