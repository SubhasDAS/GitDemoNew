package com.company;

import java.util.Arrays;

public class RightRotate 
{
	public static void main(String[] args)
	{
		int[] arr1 = { 4, 5, 6, 7, 8, 9 };

		int[] arr2 = new int[arr1.length];

		int last = arr1[arr1.length-1];
		for (int i = arr1.length - 1; i >0; i--)
		{
			arr2[i] = arr1[i - 1];

		}
		arr2[0] = last;
		System.out.println("Original array is " + Arrays.toString(arr1));
		System.out.println("Right rotate array is " + Arrays.toString(arr2));
	}
}