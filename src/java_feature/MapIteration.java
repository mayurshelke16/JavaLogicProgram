package java_feature;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapIteration {

	public static void main(String[] args) {
		
		
		Map<String, Integer> map= new HashMap<String, Integer>();
		map.put("raj", 2);
		map.put("swami", 1);
		map.put("karan", 3);
		map.put("rani", 4);
		
		System.out.println("java 8 feature using iterate map");
		map.forEach((k,v)->System.out.println("key: "+ k +"   value :"+ v));
		
		
		System.out.println("for entrySet");
		for(Map.Entry<String, Integer> entry :map.entrySet())
		{
			System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
		}
		
		System.out.println("for iterator");
	   Iterator itr=map.entrySet().iterator();
	   while(itr.hasNext())
	   {
		   Map.Entry entry=(Map.Entry) itr.next();
		   System.out.println("Key :"+entry.getKey()+" Value :"+entry.getValue());
	   }
		
	
	
	}
}
