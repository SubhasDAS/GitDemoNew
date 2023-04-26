package com.company;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayOddEven {
	public static void getTheVale(int arr[]) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i] + " ");
//		}

		System.out.print(Arrays.toString(arr));
		
	}

	public static void main(String[] args) {
		int[] arr = { 32, 323, 23234, 4343, 4554, 565, 43, 4, 6, 78 };

		int evenSize = 0, oddSize = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSize++;
			} else {
				oddSize++;
			}

		}
		int[] even = new int[evenSize];
		int[] odd = new int[oddSize];
		int j = 0, k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[j] = arr[i];
				j++;
			} else {
				odd[k] = arr[i];
				k++;
			}

		}
		System.out.println("Original ");
		getTheVale(arr);
		System.out.println("\n\nEven ");
		getTheVale(even);
		System.out.println("\n\nOdd ");
		getTheVale(odd);
	}

}
