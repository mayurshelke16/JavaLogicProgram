package com.logic;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

	
	public static void main(String[] args) {
		
		Integer [] arr= {1,2,4,5,6,8,3,4,5,7};
//using method		
		Arrays.sort(arr);
		for(int i=0 ;i<arr.length;i++)
		{
		
			System.out.println("assending order :"+arr[i]);
		}
		
		//using for loop
		
		
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=0;
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println("sort array using for loop: "+arr[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Arrays.sort(arr, Collections.reverseOrder());   
		for(int i=0 ;i<arr.length;i++)
		{
		
			System.out.println("decending order :"+arr[i]);
		}
	}
}
