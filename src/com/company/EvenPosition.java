package com.company;

public class EvenPosition
{
	static int i;
	public static void main(String[] args) 
	{
	int[] arr1 = {2,3,5,8,9,5,8,9};
	int len= arr1.length;
	for( i=1; i<len; i=i+2) 
	System.out.println(+ arr1[i]);
	}
}
