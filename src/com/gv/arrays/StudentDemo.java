package com.gv.arrays;

import java.util.ArrayList;
import java.util.List;

public class StudentDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException{
		/*Student s1 = new Student("Ram", 20, "Male", "CSE");
		Student s2 = new Student("Lakshmi", "Female", "EEE");
		Student s3 = new Student("Vijay", "Male", "EEE");*/
		/*Student s4 = new Student();
		
		System.out.println(s4.getAge());
		System.out.println(s4.getName());*/
		
		Employee emp = new Employee();
		emp.setEmail("msr@gmail.com");
		emp.setEmpID(563l);
		emp.setEmpName("Maruthi");
		emp.setManager(false);
		
		Employee emp2 = new Employee();
		emp2.setEmail("msr@gmail.com");
		emp2.setEmpID(568l);
		emp2.setEmpName("Maruthi");
		emp2.setManager(false);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp2);
		
		ArrayList<Employee> list2 = (ArrayList<Employee>) list.clone();
		
		Employee emp1 = (Employee) emp.clone();
		//System.out.println(emp1.getEmpID());
		emp.setEmpID(567l);
		System.out.println(emp.getEmpID());
		System.out.println(emp1.getEmpID());
		
		System.out.println(list2.get(1).getEmpID());
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("A");
		a.add("B");
		
		ArrayList<String> b = (ArrayList<String>) a.clone();
		//a.clear();
		System.out.println(a);
		System.out.println(b);
	}

}
