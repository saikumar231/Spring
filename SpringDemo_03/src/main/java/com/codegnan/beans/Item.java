package com.codegnan.beans;

public class Item {
	private String itemId;
	private String itemName ;
	private String itemPrice;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(String itemId, String itemName, String itemPrice) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}
	
	public void displayItemDetails() {
		System.out.println("Item Details");
		System.out.println("-------------------------------");
		System.out.println("Item Id: "+itemId);
		System.out.println("Item Name: "+itemName);
		System.out.println("Item Price: "+itemPrice);
		
	}

}
