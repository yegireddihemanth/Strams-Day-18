package ai.jobiak.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestProductMobile {

	/* @SuppressWarnings("unchecked") */
	public static <Product> void main(String[] args) {
		// TODO Auto-generated method stub

		ProductMobile p1 = new ProductMobile(1,"Laptop", "Dell",82000 );
		ProductMobile p2 = new ProductMobile(2,"mobile", "apple",56000);
		ProductMobile p3 = new ProductMobile(3,"Laptop", "apple",120000);
		ProductMobile p4 = new ProductMobile(4, "iphone", "apple",300000);
		
		ArrayList<ProductMobile> pro = new ArrayList<ProductMobile>();
		pro.add(p1);
		pro.add(p2);
		pro.add(p3);
		pro.add(p4);
		
		System.out.println("printing the elements : ");
		
		// creating lambda function
		
		/*
		 * Collections.sort(pro,(p,q)->{ return
		 * p1.getProduct().compareTo(p2.getProduct()); });
		 */
		
		for(ProductMobile a: pro) {
			System.out.println(a);
		}
		System.out.println("\n_________________________\n");
		
		System.out.println(p1.getProductId()+" "+p1.getProduct()+ " " + p1.getProductCompany()+" "+ p1.getProductPrice());
		System.out.println(p2.getProductId()+" "+p2.getProduct()+ " " + p2.getProductCompany()+" "+ p2.getProductPrice());
		System.out.println(p3.getProductId()+" "+p3.getProduct()+ " " + p3.getProductCompany()+" "+ p3.getProductPrice());
		
		
		System.out.println("\n_________________________\n");
		System.out.println("The product which exceeds the 100000 is :");
		
		List<ProductMobile> filters =  pro.stream().filter(p-> (p.getProductPrice()>100000)).collect(Collectors.toList());
		System.out.println(filters);
		
	
		

}}
