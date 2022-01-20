package com.logic;

import java.util.Arrays;

public class RemoveDuplicate {

	static int removeDuplicate(int arr[],int n)
	{
		if(n==0 ||n==1)
		{
			return n;
		}

		
		int j=0;
		int[] temp=new int [n];
	
		for(int i=0;i<n-1;i++)
			{
				if(arr[i]!=arr[i+1]) {
				temp[j++]=arr[i];
				}
 			
			}
		
		temp[j++]=arr[n-1];
		
		for(int i=0; i<j;i++)
		{
			arr[i]=temp[i];
			
		}
		return j;
			}
	
	public static void main(String[] args) {
		int ar[]= {1,1,1,2,2,2,1,3,4};
	Arrays.sort(ar);
		int a=ar.length;
		a=removeDuplicate(ar, a);
		for(int i=0;i<a;i++)
		{
			System.out.println(ar[i]);
		}
	
	}
}