package com.codegnan.beans;

public class Address {
	private String city;
	private String street;
	private int pin;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String street, int pin) {
		super();
		this.city = city;
		this.street = street;
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + ", pin=" + pin + "]";
	}

}
