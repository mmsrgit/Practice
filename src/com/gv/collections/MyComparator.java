package com.gv.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator implements Comparator {
	
	public static void main(String[] args){
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);
	}

	@Override
	public int compare(Object obj1, Object obj2) {
		if((int)obj1<(int)obj2){
			return 2;
		}
		if((int)obj1>(int)obj2){
			return -2;
		}
		if((int)obj1==(int)obj2){
			return 0;
		}
		return 0;
	}

}
