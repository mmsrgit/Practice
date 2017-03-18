package com.home.java8;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

	public static void main(String[] args) {
		
		Greet myGreet = () -> System.out.println("Hello World!");
		myGreet.greet();
		
		List<String> list = new ArrayList<String>();
		list.add("Maru");
		list.add("Remy");
		list.add("Mahi");
		list.add("John");
		list.add("Sam");
		
		Search mySearch = (List<String> searchList,String lookupString) -> list.contains(lookupString);
		System.out.println(mySearch.stringLookup(list, "amaur"));

	}
	
	interface Greet{
		public void greet();
	}
	
	interface Search{
		public boolean stringLookup(List<String> searchList, String lookupString);
	}

}
