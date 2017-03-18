package com.gv.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args){
		
		Set set = new HashSet();
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("Z");
		set.add(null);
		set.add(10);
		System.out.println(set.add("Z"));
		System.out.println(set);
		
	}

}
