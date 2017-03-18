package com.gv.arrays;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	private String name;
	private int age;
	private String gender;
	private String branch;
	
	public Student(String name, int age, String gender, String branch) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.branch = branch;
	}
	
	public Student(String name,  String gender, String branch) {
		this(19);
		this.name = name;
		this.gender = gender;
		this.branch = branch;
	}
	
	public Student(){
		
	}
	
	public Student(int age){
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	/*
	 * (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 * 
	 * method to insert Student in treeSet in descending order of their ages
	 */
	/*@Override
	public int compare(Object o1, Object o2) {
		Student s1 = null; 
		Student s2 = null;
		if(o1 instanceof Student && o2 instanceof Student){
			s1 = (Student)o1;
			s2 = (Student)o2;
		}
		
		if(s1.getAge()<s2.getAge()){
			return 1;
		}
		else if(s1.getAge()>s2.getAge()){
			return -1;
		}
		else{
			return 0;
		}
	}*/

	@Override
	public int compare(Student s1, Student s2) {
		if(s1.getAge()<s2.getAge()){
			return 1;
		}
		else if(s1.getAge()>s2.getAge()){
			return -1;
		}
		else{
			return 0;
		}
	}
	
	public boolean equals(Object obj){
		Student s = null;
		if(null!=obj && obj instanceof Student){
			s=(Student)obj;
		}
		if(s.getName().equals(this.getName())){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int hashCode(){
		return super.hashCode();
	}
	
	public String toString(){
		return this.getName()+" "+getAge()+" "+getGender()+" "+getBranch();
	}

		

}
