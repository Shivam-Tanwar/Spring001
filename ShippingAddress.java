package com.ef;

public class ShippingAddress {
private String housenumber;
private String country;
private String state;
private int phonenumber;
private int pincode;
public ShippingAddress(String housenumber, String country, String state, int phonenumber, int pincode) {
	
	this.housenumber = housenumber;
	this.country = country;
	this.state = state;
	this.phonenumber = phonenumber;
	this.pincode = pincode;
}
@Override
public String toString() {
	return "ShippingAddress [housenumber=" + housenumber + ", country=" + country + ", state=" + state
			+ ", phonenumber=" + phonenumber + ", pincode=" + pincode + "]";
}


}
