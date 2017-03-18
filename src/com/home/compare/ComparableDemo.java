package com.home.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class ComparableDemo {

	public static void main(String[] args) {
		Address address1 = new Address(23,"Brun","Halifax");
		Address address2 = new Address(21,"Brun","Halifax");
		Address address3 = new Address(12,"Brun","Halifax");
		Address address4 = new Address(46,"Brun","Halifax");
		Address address5 = new Address(10,"Brun","Halifax");
		
		//System.out.println(address2.compareTo(address1));
		
		/*TreeSet<Address> set = new TreeSet<Address>();
		set.add(address1);
		set.add(address2);
		set.add(address3);
		set.add(address4);
		set.add(address5);
		
		Iterator<Address> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getHno());
		}*/
		
		List<Address> list = new ArrayList<Address>();
		list.add(address1);
		list.add(address2);
		list.add(address3);
		list.add(address4);
		list.add(address5);
		
		Iterator<Address> iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getHno());
		}
		
		Collections.sort(list);
		System.out.println("after");
		Iterator<Address> iter1 = list.iterator();
		while(iter1.hasNext()){
			System.out.println(iter1.next().getHno());
		}

	}

}
