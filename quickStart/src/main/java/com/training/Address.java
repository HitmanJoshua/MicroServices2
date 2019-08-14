package com.training;

public class Address {

	private String addrLine1l;
	private String city;
	private long pinCode;
	public Address() {
		super();
		System.out.println("Address Called");
		// TODO Auto-generated constructor stub
	}
	public Address(String addrLine1l, String city, long pinCode) {
		super();
		this.addrLine1l = addrLine1l;
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [addrLine1l=" + addrLine1l + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
	
}
