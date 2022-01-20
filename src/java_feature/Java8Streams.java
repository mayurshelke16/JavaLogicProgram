package java_feature;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Streams {
	
	public static void main(String[] args) {
		
		List<String> lstream= new ArrayList<String>();

		lstream.add("");

		lstream.add("abjoijoic");
		lstream.add("def");
		lstream.add("eg");
		lstream.add("");
		lstream.add("jk");
		lstream.add("kribiubih");
		
		long count= lstream.stream().filter(x->x.isEmpty()).count();
		System.out.println("total count : "+ count +" list :" + lstream );
		
		long num = lstream.stream().filter(x->x.length()>3).count();
		System.out.println("total count : "+ num +" list :" + lstream );
		
		
		long stratwith_A= lstream.stream().filter(x->x.startsWith("a")).count();
		System.out.println("total count : "+ stratwith_A +" list :" + lstream );

		List<String> filtered = lstream.stream() .filter(x -> !x.isEmpty()) .collect(Collectors.toList());

		System.out.println("list :" + filtered);
		
		
		List<String> filtere= lstream.stream().filter(x->x.length()>2).collect(Collectors.toList());
		System.out.println("new arryalist withmore than two character:" + filtere);
		
		List<String> filtered1 = lstream.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println("new arryalist with uppercase  character:" + filtered1);

		List<Integer> number= Arrays.asList(2,3,4,5,6,7,8,9);
		List<Integer> list=number.stream().map(i->i*i).distinct().collect(Collectors.toList());
		System.out.println("square number :"+list);
		
	
		List<Integer> status= Arrays.asList(2,5,3,6,4,8,9,5,45,23,12,14);
		IntSummaryStatistics status1=status.stream().mapToInt((x)->x).summaryStatistics();
		
		System.out.println("high number in list :"+ status1.getMax());
		System.out.println("low number in list :"+ status1.getMin());
		System.out.println("low number in list :"+ status1.getSum());
		System.out.println("low number in list :"+ status1.getAverage());
	}

}
