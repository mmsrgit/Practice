package com.gv.collections;

import java.util.TreeSet;

import com.gv.arrays.Student;

public class TreeSetDemo {
	
	public static void main(String[] args){
		
		TreeSet set = new TreeSet();
		set.add("A");
		set.add("a");
		set.add("B");
		set.add("Z");
		set.add("L");
		//set.add((Integer)10);
		System.out.println(set);
		
		TreeSet<Student> ts = new TreeSet<Student>(new Student());
		Student s1 = new Student("Maruthi", 21, "M", "Physics");
		Student s2 = new Student("Sam", 25, "M", "Physics");
		Student s3 = new Student("Marc", 19, "M", "Physics");
		Student s4 = new Student("Jim", 32, "M", "Physics");
		Student s5 = new Student("Tino", 28, "M", "Physics");
		
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		
		for(Student s:ts){
			System.out.println(s.getAge());
		}
		
	}

}
