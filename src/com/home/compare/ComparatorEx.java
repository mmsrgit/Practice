package com.home.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEx {
	
	public static void main(String[] args){
		
		Hotel hotel1 = new Hotel(45, "add1");
		Hotel hotel6 = new Hotel(23, "add6");
		Hotel hotel5 = new Hotel(66, "add5");
		Hotel hotel4 = new Hotel(54, "add4");
		Hotel hotel3 = new Hotel(38, "add3");
		Hotel hotel2 = new Hotel(28, "add2");
		
		List<Hotel> list = new ArrayList<Hotel>();
		
		list.add(hotel1);
		list.add(hotel2);
		list.add(hotel3);
		list.add(hotel4);
		list.add(hotel5);
		list.add(hotel6);
		
		Comparator<Hotel> compar = new Comparator<Hotel>(){

			@Override
			public int compare(Hotel o1, Hotel o2) {
				return -o1.getRooms().compareTo(o2.getRooms());
			}
			
		};
		
		Collections.sort(list,compar);
		
		for(Hotel h:list){
			System.out.println(h.getRooms());
		}
		
		
	}

}
