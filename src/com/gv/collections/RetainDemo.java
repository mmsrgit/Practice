package com.gv.collections;

import java.util.HashSet;
import java.util.Set;

import com.gv.arrays.Employee;

public class RetainDemo {
	
	public static void main(String[] args){
		Set<Employee> set = new HashSet<Employee>();
		Employee emp1 = new Employee(20l,"Maruthi","email1",false);
		Employee emp2 = new Employee(21l,"Srin","email2",false);
		Employee emp3 = new Employee(22l,"Rao","email3",false);
		Employee emp4 = new Employee(20l,"Maruthi","email4",false);
		Employee emp5 = new Employee(23l,"Jay","email5",false);
		set.add(emp5);
		set.add(emp4);
		set.add(emp3);
		set.add(emp2);
		set.add(emp1);
		System.out.println(set.size());
		
		Set<Employee> set2 = new HashSet<Employee>();
		Employee emp6 = new Employee(23l,"Jay","email5",false);
		Employee emp7 = new Employee(22l,"Rao","email3",false);
		set2.add(emp7);
		set2.add(emp6);
		set.retainAll(set2);
		System.out.println(set.size());
		
	}

}
