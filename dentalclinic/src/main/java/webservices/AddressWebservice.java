package webservices;

import javax.jws.WebService;

import model.Address;
@WebService(endpointInterface = "webservices.IWebServiceAddress")
public class AddressWebservice implements IWebServiceAddress {

	@Override
	public void AddAdress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EditAddress(Address address) {
		// TODO Auto-generated method stub

	}

	@Override
	public Address getAddress(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
