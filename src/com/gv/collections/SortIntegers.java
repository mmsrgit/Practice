package com.gv.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortIntegers {
	
	public static void main(String[] args){
		Set set = new HashSet();
		List list = new ArrayList();
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(8);
		list.add(6);
		list.add(3);
		Collections.sort(list);
		System.out.println(list);
	}

}
