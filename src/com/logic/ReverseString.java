package com.logic;

public class ReverseString {

	public static void main(String[] args) {
		
	
	String s= "perfect picture";
	char str[]=s.toCharArray();
	int i;
	String rev="";
	for(i=str.length-1;i>0;i--)
	{
		rev+=str[i];
		
	}
	System.out.println(rev);
	}
	
}
