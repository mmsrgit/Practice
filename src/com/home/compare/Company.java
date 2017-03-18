package com.home.compare;

import java.util.Comparator;

public class Company implements Comparator{
	
	private int empStrength;
	private String companyName;
	
	public int getEmpStrength() {
		return empStrength;
	}

	public Company(int empStrength, String companyName) {
		super();
		this.empStrength = empStrength;
		this.companyName = companyName;
	}
	
	public Company(){
		
	}

	public void setEmpStrength(int empStrength) {
		this.empStrength = empStrength;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public int compare(Object o1, Object o2) {
		Company company1 = null;
		Company company2 = null;
		if(o1 instanceof Company && o2 instanceof Company){
			company1 = (Company)o1;
			company2 = (Company)o2;
		}
		else{
			return -1;
		}
		if(company1.getEmpStrength()<company2.getEmpStrength()){
			return -1;
		}
		else if(company1.getEmpStrength()>company2.getEmpStrength()){
			return 1;
		}
		else{
			return 0;
		}
	}
	
	public String toString(){
		return getEmpStrength()+getCompanyName();
	}
	
}
