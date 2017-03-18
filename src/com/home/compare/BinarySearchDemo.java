package com.home.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchDemo {
	
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		
		list.add("Z");
		list.add("A");
		list.add("M");
		list.add("K");
		list.add("a");
		list.add("B");
		
		System.out.println(Collections.binarySearch(list, "M"));
		Collections.sort(list);
		System.out.println(list);
		//System.out.println(Collections.binarySearch(list, "B"));
		System.out.println(Collections.binarySearch(list, "Y"));
	}

}
