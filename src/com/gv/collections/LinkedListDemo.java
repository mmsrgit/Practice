package com.gv.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gv.arrays.Student;

public class LinkedListDemo {
	
	public static void main(String[] args){
		
		@SuppressWarnings("rawtypes")
		LinkedList list = new LinkedList();
		list.add("gvk");
		list.add(30);
		list.add(null);
		list.add("gvk");
		list.set(0, "hadoop");
		list.add(0, "hive");
		list.removeLast();
		list.addFirst("CCC");
		System.out.println(list);
		Student s = new Student("gvk","M","ECE");
		System.out.println(s.hashCode());
		
		Map<String,String> map = new HashMap<String,String>();
		map.put("a", "b");
		map.put("c", "d");
		Set<Entry<String, String>> entry = map.entrySet();
		map.keySet();
		Iterator<Entry<String, String>> iter = entry.iterator();
		
		while(iter.hasNext()){
			System.out.println(iter.next().getKey());
		}
		
	}

}
