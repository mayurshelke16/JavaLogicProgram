package com.logic;

public class DuplicateWorld {

	public static void main(String[] args) {
		String string="Big black dog bit a big black dog his big black nose";
		int count;
	string=string.toLowerCase();
	
	String world[]=string.split(" ");
	 for(int i=0; i<world.length; i++)
	 {
		 count=1;
		 for(int j=i+1;j<world.length;j++) {
			 
		  if(world[i].equals(world[j]))
		 {
			count++; 
			world[j] ="0";
		 }
	 }
		 if(count>1 && world[i]!="0")
		 {
			 System.out.println(world[i]+" ="+count);
		 }
		 }
	}
}
