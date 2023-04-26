package com.company;

import java.util.Arrays;

public class OddEvenFromArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 8, 9 };
		int oddLength = 0;
		int evenLength = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenLength++;
			} else {
				oddLength++;
			}
		}
		System.out.println("oddl" + oddLength);
		System.out.println("evenl " + evenLength);

		int[] odd = new int[oddLength];
		int[] even = new int[evenLength];
		
		int m=0;
		int k=0;
		{
			for (int i = 0; i < arr.length; i++) {
			 {
					if (arr[i] % 2 == 0) {
						even[m] = arr[i];
						m++;
					} else {
						odd[k] = arr[i];
						k++;
					}
				}
			}

			System.out.println("Original " + Arrays.toString(arr));
			System.out.println("Odd " + Arrays.toString(odd));
			System.out.println("Even " + Arrays.toString(even));

		}
	}
}
