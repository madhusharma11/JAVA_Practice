package com.ArrayAssignment;

public class JavaPropgram {

	int findMax(int[] arr)
	{
		int maximum = 0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				maximum=arr[i]>arr[j]?arr[i]:arr[j];
			}

		}
		return maximum;
	}
	
	int findSum(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	
	float calculateAverage(int[] arr)
	{
		float avg;
		avg=findSum(arr)/arr.length;
		return avg;
	}
	
	static int[] sortingArrayAscending(int[] arr)	
	{

		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int c=arr[i];
					arr[i]=arr[j];
					arr[j]=c;
				}
			}
		}
		return arr;
}
}
