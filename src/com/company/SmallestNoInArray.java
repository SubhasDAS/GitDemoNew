package com.company;

public class SmallestNoInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = {3, 4, 5, 6, 78, 78, 82, 2 };

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) 
		{

			if (arr[i] < min)
			{
				min = arr[i];

			}

		}
		System.out.println("smallest number in the array is "+min);
	}

}
