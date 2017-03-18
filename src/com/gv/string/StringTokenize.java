package com.gv.string;

import java.util.StringTokenizer;

public class StringTokenize {
	
	public static void main(String[] args){
		StringTokenizer st = new StringTokenizer("pack my box"," ");
	     while (st.hasMoreTokens()) {
	         System.out.println(st.nextToken().trim());
	     }
	     
	     
	     
	}

}
