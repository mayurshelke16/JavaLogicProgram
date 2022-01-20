package com.logic;

public class CharacterCount {

	
	public static void main(String[] args) {
		/*
		 * 
		 * String s="I am the best"; int count=0;
		 * 
		 * for(int i=0;i<s.length(); i++) { if(s.charAt(i)!=' ') count++;
		 * 
		 * } System.out.println(count);
		 * 
		 */	
		
	
	
	String str="picture perect";
	int [] freq= new int[str.length()];
	int i,j;
	char string[]= str.toCharArray();
	
	for(i=0; i<str.length();i++)
	{     freq[i] = 1;  
	 for(j = i+1; j <str.length(); j++) {  
		if(string[i]==string[j])
		{
			freq[i]++;
			 //Set string[j] to 0 to avoid printing visited character  
			string[j]='0';
		}
	}
	}
	
	System.out.println("Characters and their corresponding frequencies");
for(i=0; i<freq.length; i++)
{
	if(string[i] != ' ' && string[i] != '0')  
    System.out.println(string[i] + "-" + freq[i]);  
}  
	}
}
