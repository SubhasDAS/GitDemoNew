package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		// Initialize array
		int[] arr1 = { 1, 2, 3, 4, 5 };
		// Create another array arr2 with size of arr1
		int arr2[] = new int[arr1.length];
		// Copying all elements of one array into another
		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		// Displaying elements of array arr1
		System.out.println("Elements of original array: ");
		System.out.println(Arrays.toString(arr1));

		// Displaying elements of array arr2
		System.out.println("Elements of new array: ");
		System.out.println(Arrays.toString(arr2));
	}
}