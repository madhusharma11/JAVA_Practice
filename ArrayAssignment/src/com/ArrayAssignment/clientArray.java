package com.ArrayAssignment;

import java.util.Arrays;

public class clientArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaPropgram obj=new JavaPropgram();

		int[] arr =  new int[] {20,10,50,30,40};

		System.out.println("Maximum number= "+obj.findMax(arr));
		System.out.println("Sum of all element = "+obj.findSum(arr));
		System.out.println("Average = "+obj.calculateAverage(arr));
		System.out.println("Array in sorted order = "+
		Arrays.toString(JavaPropgram.sortingArrayAscending(arr)));
	}

}
