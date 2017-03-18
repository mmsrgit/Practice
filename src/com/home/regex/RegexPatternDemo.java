package com.home.regex;

import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPatternDemo {
	
	public static void main(String[] args){


		Pattern pattern = 
				Pattern.compile(".*");

		Matcher matcher = 
				pattern.matcher("Hello World");
		
		if(matcher.find()){
			System.out.println(matcher.group());
		}

		/*boolean found = false;
		while (matcher.find()) {
			console.format("I found the text" +
					" \"%s\" starting at " +
					"index %d and ending at index %d.%n",
					matcher.group(),
					matcher.start(),
					matcher.end());
			found = true;
		}
		if(!found){
			console.format("No match found.%n");
		}*/
	}

}
