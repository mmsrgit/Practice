package com.home.equals;

import java.util.HashSet;
import java.util.Set;

public class HashDemo {

	public static void main(String[] args) {
		Product p1 = new Product("soap", 20, "dove");
		Product p2 = new Product("soap", 20, "dove");
		
		Set<Product> s = new HashSet<Product>();
		s.add(p2);
		s.add(p1);
		if(p1.equals(p2)){
			System.out.println("equal");
		}
		else{
			System.out.println("not equal");
		}
		
		System.out.println("size -> "+s.size());
		

	}

}
