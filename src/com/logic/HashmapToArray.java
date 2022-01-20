package com.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HashmapToArray {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hashmap= new HashMap<Integer, String>();
		
		hashmap.put(1001, "ravi");
		hashmap.put(1002, "raj");
		hashmap.put(1003, "rani");
		hashmap.put(1004, "raju");
		hashmap.put(1005, "karan");
		
		List<Integer> listId= hashmap.keySet().stream().collect(Collectors.toList());
		
		System.out.println(listId);
		
		
		List<String> listString= hashmap.values().stream()
  .collect(Collectors.toList());
		
		System.out.println(listString);
		
		
		
		List<Entry<Integer, String>> entryIdString= 
				hashmap.entrySet().stream().collect(Collectors.toList());
		
		
		System.out.println(entryIdString);
	
	}
}
