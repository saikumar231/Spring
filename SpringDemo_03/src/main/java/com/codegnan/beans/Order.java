package com.codegnan.beans;

public class Order {
	private String orderId;
	private String orderName;
	private Customer customer;
	private Item item;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String orderId, String orderName, Customer customer, Item item) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.customer = customer;
		this.item = item;
	}
	
	public void displayOrderDetails() {
		System.out.println("Order Details");
		System.out.println("-------------------------------");
		System.out.println("Order Id: "+orderId);
		System.out.println("Order Name: "+orderName);
		System.out.println(" ");
		customer.displayCustomerDetails();
		System.out.println(" ");
		item.displayItemDetails();
		
	}

}
