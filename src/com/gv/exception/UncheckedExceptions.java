package com.gv.exception;

public class UncheckedExceptions {
	
	public static void main(String[] args){
		String s = getSubString( "abcdef");
		System.out.println(s);
	}

	private static String getSubString(String s) {
		return s.substring(2,8);
	}

}
