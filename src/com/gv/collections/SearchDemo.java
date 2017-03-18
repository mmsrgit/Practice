package com.gv.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchDemo {
	
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		
		/*list.add("Ravi");
		list.add("Ram");
		list.add("Mada");
		list.add("Bobby");
		list.add("Arun");*/
		
		/*Collections.sort(list);
		System.out.println(Collections.binarySearch(list, "Bobby"));
		
		System.out.println(list.contains("Bobby"));
		System.out.println("Mada".compareTo("Bobby"));*/
		
		list.add("Zed");
		list.add("Amer");
		list.add("Moh");
		list.add("Kun");
		list.add("akam");
		list.add("Bob");
		System.out.println(list.contains("Moh"));
		
		
	}

}
