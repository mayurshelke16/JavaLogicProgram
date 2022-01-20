package com.logic;

public class Largest_Word_string {

	public static void main(String[] args) {
		  String string = "Hardships often prepare ordinary people for an extraordinary destiny"; 
		  
		  String word="",small="",large="";
		  
		  String[] words= new String[100];
		  
		  int length=0;
		  
		     //Add extra space after string to get the last word in the given string 
		  string=string +"";
		  
		  
		  for( int i=0; i<string.length();i++)
		  {
			  if(string.charAt(i) != ' '){    
	              word = word + string.charAt(i);    
	          }  
			  else {
				words[length]=word;
				
				length++;
				
				word="";
			}//end of else
		  }// end of if

	
		  
		  small=large=words[0];
		  
		//Determine smallest and largest word in the string    
		  for(int k=0;k<length;k++)
		  {

			  if(small.length()>words[k].length())
				  small=words[k];
			  
			  if(large.length()<words[k].length())
				  large=words[k];
			  
		  }
		  
		  System.out.println("Smallest word: " + small);    
	      System.out.println("Largest word: " + large);    
	}
}
