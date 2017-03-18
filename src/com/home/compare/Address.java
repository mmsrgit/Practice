package com.home.compare;

import java.lang.Comparable;

public class Address implements Comparable{
	
	private int hno;
	private String street;
	private String city;
	
	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Object obj) {
		Address address = null;
		if(obj instanceof Address){
			address = (Address)obj;
		}
		else{
			return -1;
		}
		if(this.getHno() == address.getHno()){
			return 0;
		}
		return this.getHno() > address.getHno()? 1:-1;
		
	}

	public Address(int hno, String street, String city) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
	}
	

}
