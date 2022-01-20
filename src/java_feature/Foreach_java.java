package java_feature;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Foreach_java {

	public static void main(String[] args) {
		
		
		List<String> list= new ArrayList<String>();
		list.add("football");
		list.add("cricket");
		list.add("chess");
		list.add("hocky");
		
		
list.forEach(game->System.out.println(game));

list.stream().collect(Collectors.toSet());
System.out.println(list);
	}
}
