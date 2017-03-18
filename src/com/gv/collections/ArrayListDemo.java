package com.gv.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args){
		List list = new ArrayList();
		list.add("A");
		list.add(10);
		list.add("A");
		list.add(null);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		list.add(2,"M");
		list.add("N");
		System.out.println(list);
		list.add(1,"S");
		System.out.println(list);
		
	}

}
