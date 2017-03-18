package com.gv.arrays;

public class Employee implements Cloneable, Comparable{
	
	long empID;
	String empName;
	String email;
	boolean isManager;
	
	public Employee(long empID, String empName, String email, boolean isManager) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.email = email;
		this.isManager = isManager;
	}
	
	public Employee(){
		
	}


	public long getEmpID() {
		return empID;
	}


	public void setEmpID(long empID) {
		this.empID = empID;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isManager() {
		return isManager;
	}


	public void setManager(boolean isManager) {
		this.isManager = isManager;
	}


	public Object clone() throws CloneNotSupportedException{
		return (Employee)super.clone();
	}
	
	public int hashCode(){
		return (int)empID;
	}
	




	@Override
	public int compareTo(Object arg0) {
		long curEmpID = this.getEmpID();
		long addingEmpID = ((Employee)arg0).getEmpID();
		int a = curEmpID<addingEmpID?1:0;
		return a;
	}
	
	public boolean equals(Object arg){
		Employee emp = null;
		if(arg!=null && arg instanceof Employee){
			emp = (Employee) arg;
		}
		else{
			return false;
		}
		if(this.getEmpID() == emp.getEmpID() &&
				(null!=this.getEmpName() && this.getEmpName().equals(emp.getEmpName()))){
			return true;
		}
		else{
			return false;
		}
		
	}
	
}