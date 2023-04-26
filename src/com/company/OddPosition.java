package com.company;

public class OddPosition {
	static int i;

	public static void main(String[] args) {
		int[] arr1 = { 2, 3, 5, 8, 9, 5, 8, 9 };
		int len = arr1.length;
		for (i = 0; i < len; i = i + 2)
			System.out.println(+arr1[i]);

		String s = "Showing 1 – 24 of 8,207 results for mobiles";
		char[] ss = s.toCharArray();
		// String ss1= ss.replaceAll(",", "");
		for (int i = 0; i < ss.length; i++) {
			System.out.println(ss[i]);
		}

	}
}
