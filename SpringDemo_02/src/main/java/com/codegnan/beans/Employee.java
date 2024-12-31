package com.codegnan.beans;

public class Employee {

	private int eno;

	private String ename;

	private float esal;

	private Address address;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eno, String ename, float esal) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
	}
	
	public Employee(int eno, String ename, float esal, Address address) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.address = address;
	}



	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public float getEsal() {
		return esal;
	}

	public void setEsal(float esal) {
		this.esal = esal;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", address=" + address + "]";
	}



}
