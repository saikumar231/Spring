package com.codegnan.beans;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private String customerMobileNo;
	
	
	public Customer(String customerId, String customerName, String customerAddress, String customerMobileNo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.customerMobileNo = customerMobileNo;
	}

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void displayCustomerDetails(){
		System.out.println("Customer Details");
		System.out.println("------------------------------------------");
		System.out.println("Customer Id: "+customerId);
		System.out.println("Customer Name: "+customerName);
		System.out.println("Customer Address: "+customerAddress);
		System.out.println("Customer Mobile Number: "+customerMobileNo);
	}

}
