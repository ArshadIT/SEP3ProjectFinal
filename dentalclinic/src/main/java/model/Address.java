package model;

import java.io.Serializable;

public class Address implements IAddress, Serializable {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int AddressId;
 private String streetName;
 private String streetNo;
 private String postalCode;
 private String city;
 
 
public Address() {
	
}
public Address(int addressId, String streetName, String streetNo, String postalCode, String city) {
	
	AddressId = addressId;
	this.streetName = streetName;
	this.streetNo = streetNo;
	this.postalCode = postalCode;
	this.city = city;
}
public Address(String streetName, String streetNo, String postalCode, String city) {
	
	this.streetName = streetName;
	this.streetNo = streetNo;
	this.postalCode = postalCode;
	this.city = city;
}

@Override
public int getAddressId() {
	
	return AddressId;
}
@Override
public String getStreetName() {
	
	return streetName;
}
@Override
public String getStreetNo() {
	
	return streetNo;
}
@Override
public String getPostalCode() {
	
	return postalCode;
}
@Override
public String getCity() {
	
	return city;
}
public void setAddressId(int addressId) {
	AddressId = addressId;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public void setStreetNo(String streetNo) {
	this.streetNo = streetNo;
}
public void setPostalCode(String postalCode) {
	this.postalCode = postalCode;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Address [streetName=" + streetName + ", streetNo=" + streetNo + ", postalCode=" + postalCode + ", city="
			+ city + "]";
}


}
