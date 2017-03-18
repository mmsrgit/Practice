package com.gv.exception;

public class StackTrace {
	
	public static void main(String[] args){
		int[] intA = {1,2,3};
		System.out.println(method1(intA));
	}

	private static int method1(int[] is) {
		System.out.println("inside method1");
		int a = method2(is);
		System.out.println("exiting method1");
		return a;
	}

	private static int method2(int[] is) {
		System.out.println("inside method2");
		return is[3];
	}

}
