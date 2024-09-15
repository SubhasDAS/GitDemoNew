package com.company;

import java.util.*;

public class ArrayList {
	public static void main(String[] args) {
		Integer[] n= {8,9,98};

		List<Integer> arrli = new java.util.ArrayList<Integer>();
		arrli.add(45);
		arrli.add(66);
		arrli.add(645);
		arrli.add(456);
		arrli.add(6745);
		arrli.add(4765);
		arrli.add(456);

		System.out.println(arrli);

		Object[] arr= arrli.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		int len = arr.length;
		for(int i= 0; i<len; i++) {
			System.out.println(arr[i]);
		}


		System.out.println(arrli);
		
List<Integer> ls=Arrays.asList(n);
		arrli.addAll(ls);
		System.out.println(arrli);


		  
	}
}
