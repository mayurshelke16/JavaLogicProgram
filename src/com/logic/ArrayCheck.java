package com.logic;

import java.util.Arrays;

public class ArrayCheck {
	public static void main(String[] args) {
		boolean isArrayEqual=true;
		
		int arr1[]= {1,2,3,4,5,6,7};
		int arr2[]= {1,2,3,4,5,6};
		
		
		int count=arr1.length;
		System.out.println(count);
		isArrayEqual = Arrays.equals(arr1, arr2);
		if(isArrayEqual) {
			System.out.println("array are equal");
		}else
		{
			System.out.println("array are not  equal");
		}
	}

}
