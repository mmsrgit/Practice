package com.gv.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayC {
	
	public static void main(String[] args){
		
		int[] intA = new int[3];
		
		String[] stringA = {"abc", new String("def"), "ghi"};
		System.out.println(stringA[1]);
		
		Student[] studentA = new Student[2];
		
		Animal[] animalA = {new Cow(), new Horse(), new Lion()};
		System.out.println(animalA[2].makeSound());
		
		for(int i=0;i<intA.length;i++){
			intA[i] = i+1;
		}
		System.out.println(intA[0]);
		
		for(int i=0;i<studentA.length;i++){
			//studentA[i] = new Student();
		}
		
	}

}
