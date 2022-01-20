package com.logic;

public class Vowels {

	public static void main(String[] args) {
		int vcount=0;
		int ccount=0;
		
		String str ="this is really simple program";
		
		str=str.toLowerCase();
		
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='0' || str.charAt(i)=='i' || str.charAt(i)=='u')
		{
			
		vcount++;	
		}
		else
			if(str.charAt(i)>='a' || str.charAt(i)<='z')
			{
				ccount++;
			}
		}
	System.out.println("Total number of vowels:"+ vcount + "   :"+ccount);
	
	}
	
	
}
