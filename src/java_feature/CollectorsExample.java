package java_feature;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

	private static final DecimalFormat dfZero = new DecimalFormat("0.0");

	public static void main(String[] args) {

		
		List<Product> productlist= new ArrayList<Product>();
		productlist.add(new Product(1, "hp laptop", 240078));
		productlist.add(new Product(2, "lenovo laptop", 240078));
		productlist.add(new Product(3, "dell laptop", 250078));
		productlist.add(new Product(4, "asus laptop", 300078));
		productlist.add(new Product(5, "sony laptop", 350078));
		productlist.add(new Product(6, "sony laptop", 350078));
		
		
		
		List<Float> list=productlist.stream().map(p->p.price).collect(Collectors.toList());
		System.out.println(list);

		
		Double sum= productlist.stream() .collect(Collectors.summingDouble(x->x.price));
		System.out.println(sum);
		
		Double avg= productlist.stream().collect(Collectors.averagingDouble(x->x.price));
		System.out.println(Double.valueOf(dfZero.format(avg)));
		System.out.println(dfZero.format(avg));
		
		long noflist= productlist.stream().collect(Collectors.counting());
		System.out.println("number of count:" + noflist);
		
		
	}
}
