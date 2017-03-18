package com.home.equals;

public class Product {
	
	String name;
	int cost;
	String manufacture;
	public Product(String name, int cost, String manufacture) {
		super();
		this.name = name;
		this.cost = cost;
		this.manufacture = manufacture;
	}
	
	
	public boolean equals(Object o){
		if(null != o && o instanceof Product){
			Product p = (Product)o;
			if(p.name.equals(this.name) && p.cost == this.cost && 
					p.manufacture.equals(this.manufacture)){
				return true;
			}
			else{
				return false;
			}
		}
		else{
			return false;
		}
	}

}
