package multithreading;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		
		Map<Product,Integer> cart=new HashMap<>();
		Product product=new Product();
		product.setProdId(101);
		product.setProdName("Mobile");
		product.setProdPrice(10000.20);
		
		Product product1=new Product();
		product1.setProdId(102);
		product1.setProdName("Market");
		product1.setProdPrice(120000.20);
		
		Product product2=new Product();
		product2.setProdId(103);
		product2.setProdName("LapTop");
		product2.setProdPrice(20000.20);
		
		Product product4=new Product();
		product4.setProdId(101);
		product4.setProdName("Mobile");
		product4.setProdPrice(10000.20);
		
		System.out.println(product.hashCode()+" "+product1.hashCode()+" "+product2.hashCode()+" "+product4.hashCode());
		cart.put(product, 1);
		cart.put(product1, 1);
		cart.put(product2, 1);
		cart.put(product4, 4);
		System.out.println(cart);
		
		System.out.println(cart.get(product));
		
		

	}

}
