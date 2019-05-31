package controller;

import javax.jws.WebMethod;

import model.Address;

public interface IAddressController {
	public void AddAdress(Address address);

	public void deleteAddress(Address address);

	public void EditAddress(Address address);

	public Address getAddress(int addressId);

}
