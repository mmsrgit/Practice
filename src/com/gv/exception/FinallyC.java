package com.gv.exception;

public class FinallyC {
	
	public static void main(String[] args){
		
		System.out.println("Starting execution");
		
		int[] a = {1,2};
		String s = null;
		printArray(a, s);
		System.out.println("End execution");
	}

	private static void printArray(int[] a, String s) {
		try{
			System.out.println(a[0]);
			System.out.println(a[1]);
			//System.out.println(a[2]);
			//System.out.println(s.length());
		}
		catch(ArrayIndexOutOfBoundsException ex){
			ex.printStackTrace();
			System.out.println("Inside ArrayIndexOutOfBoundsException catch block ");
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Inside Exception catch block");
		}
		finally{
			System.out.println("Inside finally");
		}
		
	}

}
