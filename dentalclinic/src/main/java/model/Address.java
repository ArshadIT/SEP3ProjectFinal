package model;

public class Address implements IAddress {
 private int AddressId;
 private String streetName;
 private String streetNo;
 private String postalCode;
 private String city;

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
	public int getAddressId() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getStreetName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStreetNo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPostalCode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getCity() {
		// TODO Auto-generated method stub
		return null;
	}

}
