package com.company;

import java.util.Iterator;

public class LrgestNoInArray 
{

	public static void main(String[] args) 
	{
		int[] arr = { 5, 7, 8, 77, 66, 33 };
		int max = 0;

		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i] > max) 
			{
				 max = arr[i];

			}
		}
		System.out.println(max);
	}

}
