package com.gv.string;

public class StringBuilderProps {
	
	public static void main(String[] args){
		
		StringBuilder sb = new StringBuilder("abc");
		sb.append("def");
		System.out.println("sb = " + sb);
		
		
		StringBuffer sb1 = new StringBuffer("set ");
		sb1.append("point");
		System.out.println(sb1); 
		StringBuffer sb2 = new StringBuffer("pi = ");
		sb2.append(3.14159f);
		System.out.println(sb2); 
		
		
		StringBuilder sb3 = new StringBuilder("0123456789");
		System.out.println(sb3.delete(4,6));
		
		StringBuilder sb4 = new StringBuilder("01234567");
		sb4.insert(4, "---");
		System.out.println( sb4 );
		
		
		
		StringBuffer sb5 = new StringBuffer("A man a plan a canal Panama");
		sb5.reverse();
		System.out.println(sb5);
	}

}
