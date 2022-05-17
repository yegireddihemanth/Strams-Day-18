package ai.jobiak.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1 = new Product(1,"Laptop", "Dell",82000 );
		Product p2 = new Product(2,"mobile", "apple",56000);
		Product p3 = new Product(3,"Laptop", "apple",120000);
		
		ArrayList<Product> pro = new ArrayList<Product>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		
		System.out.println("printing the elements : ");
		
		// creating lambda function
		
		Collections.sort(pro,(p,q)->{
			return p1.getProduct().compareTo(p2.getProduct());
		});
		
		for(Product a: pro) {
			System.out.println(a);
		}
		System.out.println("\n_______________________________________________________________________\n");
		
		System.out.println(p1.getProductId()+" "+p1.getProduct()+ " " + p1.getProductCompany()+" "+ p1.getProductPrice());
		System.out.println(p2.getProductId()+" "+p2.getProduct()+ " " + p2.getProductCompany()+" "+ p2.getProductPrice());
		System.out.println(p3.getProductId()+" "+p3.getProduct()+ " " + p3.getProductCompany()+" "+ p3.getProductPrice());
		
		
		System.out.println("\n_______________________________________________________________________\n");
		System.out.println("The product which exceeds the 100000 is :");
		
		Stream<Product> filter = (Stream<Product>) pro.stream().filter(p-> (p.getProductPrice()>100000)).collect(Collectors.toList());
		System.out.println(filter);
		
		
	
		
		// using lambda iterator 
		
//		filter.forEach(
//				product->
//			System.out.println(product.getProduct()+ " "+  product.getProductCompany()+ " "+product.getProductPrice())
//		);
	}

}
