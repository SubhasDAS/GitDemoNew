package com.company;

import java.util.Arrays;

public class ReverceArray
{

	public static void main(String[] args) 
	{

		int[] arr1 = { 4, 5, 9, 3, 1, 7,76,865,8 };
		int len = arr1.length;
		int j = len-1;		
		int[] arr2 = new int[len];
		for (int i = 0; i < len; i++)
		{
			
			while (j>=0)
			{
				arr2[i] = arr1[j];
				j--;
				break;
			}

		}

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));


	}
}
