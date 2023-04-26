package com.company;

import java.util.Arrays;

public class LeftRotate 
{
	public static void main(String[] args)
	{
		int[] arr1 = { 4, 5, 6, 7, 8, 9 };

		int[] arr2 = new int[arr1.length];

		int first = arr1[0];
		for (int i = 0; i < arr1.length - 1; i++)
		{
			arr2[i] = arr1[i + 1];

		}
		arr2[arr1.length - 1] = first;
		System.out.println("Original array is " + Arrays.toString(arr1));
		System.out.println("Left rotate array is " + Arrays.toString(arr2));
	}
}