package com.logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayListToHashmap {

	public static void main(String[] args) {
		
		ArrayList<String> languageList= new ArrayList<>(Arrays.asList("Java",
				                                                       "C++", 
				                                                       "Python", 
				                                                       "PHP", 
				                                                       "NodeJS"));
		
		for(String language: languageList)
		{
			System.out.println(language);
		}
		
		HashMap<String, Integer> langaugemap= convertArrayListToHashMap(languageList);
		
		for(Map.Entry<String,Integer>  entry : langaugemap.entrySet())
		{
			System.out.println(entry.getKey()+"     :"+ entry.getValue());
		}
	}
	
	public static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList)
	{
		
		HashMap<String, Integer> hashmap= new HashMap<String, Integer>();
		for(String str : arrayList)
		{
			hashmap.put(str, str.length());
		}
		
		
		return hashmap;
		
	}
}
