package com.gv.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.gv.arrays.Student;

public class ComparatorDemo {
	
	public static void main(String[] args){
		Student s1 = new Student("Mar", 20, "M", "ECE");
		Student s2 = new Student("Ram", 22, "M", "CEC");
		Student s3 = new Student("Pri", 19, "M", "MPC");
		Student s4 = new Student("Sam", 23, "M", "BPC");
		Student s5 = new Student("Joe", 21, "M", "EEE");
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		Collections.sort(list,new Student());
		/*for(Student s:list){
			System.out.println(s.getAge());
		}*/
		System.out.println(list);
		
		int index = Collections.binarySearch(list, new Student("Mar", 22, "M", "DUM"), new Student());
		System.out.println(index);
		/*System.out.println(list.contains(new Student("Mar", 22, "M", "DUM")));
		
		if(list.contains(new Student("Mar", 22, "M", "ECE"))){
			int index = Collections.binarySearch(list, new Student("Mar", 22, "M", "DUM"), new Student());
			System.out.println(index);
			Student sFound = list.get(index);
			System.out.println(sFound.getBranch());
			
		}*/
	}
	
	

}
