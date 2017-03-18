package com.gv.collections;

import java.util.TreeSet;

import com.gv.arrays.Employee;

public class TreeSetDemo1 {
	
	public static void main(String[] args){
		
		/*TreeSet set = new TreeSet();
		set.add(new StringBuffer("A"));
		set.add(new StringBuffer("B"));
		set.add(new StringBuffer("Z"));
		set.add(new StringBuffer("L"));
		System.out.println(set);*/
		
		TreeSet<Employee> set1 = new TreeSet<Employee>();
		
		Employee emp2 = new Employee();
		emp2.setEmail("msr@gmail.com");
		emp2.setEmpID(561l);
		emp2.setEmpName("Maruthi");
		emp2.setManager(false);
		
		Employee emp3 = new Employee();
		emp3.setEmail("msr@gmail.com");
		emp3.setEmpID(562l);
		emp3.setEmpName("Maruthi");
		emp3.setManager(false);
		
		Employee emp4 = new Employee();
		emp4.setEmail("msr@gmail.com");
		emp4.setEmpID(563l);
		emp4.setEmpName("Maruthi");
		emp4.setManager(false);
		
		Employee emp5 = new Employee();
		emp5.setEmail("msr@gmail.com");
		emp5.setEmpID(564l);
		emp5.setEmpName("Maruthi");
		emp5.setManager(false);
		
		set1.add(emp2);
		set1.add(emp3);
		set1.add(emp5);
		set1.add(emp4);
		
		for(Employee emp:set1){
			System.out.println(emp.getEmpID());
		}
		
		System.out.println(set1.size());
	}

}
