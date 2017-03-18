package com.home.compare;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchObject {

	public static void main(String[] args) {
		
		Company company1 = new Company(23, "a");
		Company company2 = new Company(45, "a");
		Company company3 = new Company(10, "a");
		Company company4 = new Company(21, "a");
		Company company5 = new Company(13, "a");
		
		List<Company> list = new ArrayList<Company>();
		list.add(company1);
		list.add(company2);
		list.add(company3);
		list.add(company4);
		list.add(company5);
		Collections.sort(list, new Company());
		System.out.println(list);
		System.out.println(Collections.binarySearch(list, new Company(22,null), new Company()));
		/*for(Company c:list){
			System.out.println(c.getEmpStrength());
		}
		System.out.println(Collections.binarySearch(list, company5, new Company()));*/
		/*int[] a = {6,2,8,9,4};
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 1));*/

	}

}
