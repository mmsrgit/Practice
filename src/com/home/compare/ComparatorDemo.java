package com.home.compare;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args){
		Company company1 = new Company(23, "a");
		Company company2 = new Company(45, "a");
		Company company3 = new Company(10, "a");
		Company company4 = new Company(21, "a");
		Company company5 = new Company(13, "a");
		
		TreeSet<Company> set = new TreeSet<Company>(new Company());
		set.add(company3);
		set.add(company1);
		set.add(company2);
		set.add(company4);
		set.add(company5);
		
		Iterator<Company> iter = set.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next().getEmpStrength());
		}
	}

}
