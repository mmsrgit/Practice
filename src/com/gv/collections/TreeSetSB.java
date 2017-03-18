package com.gv.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetSB {
	
	public static void main(String[] args){
		TreeSet<StringBuffer> s = new TreeSet<StringBuffer>(new MyComparator1());
		s.add(new StringBuffer("A"));
		s.add(new StringBuffer("Z"));
		s.add(new StringBuffer("d"));
		s.add(new StringBuffer("F"));
		s.add(new StringBuffer("k"));
		System.out.println(s);
		
	}
	
}

class MyComparator1 implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		String s1 = ((StringBuffer)arg0).toString();
		String s2 = ((StringBuffer)arg1).toString();
		return -s1.compareTo(s2);
	}
	
}
