package model;



import java.io.Serializable;

public class Patient implements IPatient, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private String CprNo;
	private String Email;
	private int AddressId;
	
	

	
	public Patient() {
		
	}


		public Patient(String firstName, String lastName, String cprNo, String email, int addressId) {
		super();
		FirstName = firstName;
		LastName = lastName;
		CprNo = cprNo;
		Email = email;
		AddressId = addressId;
	}



	@Override
	public String getFirstname() {
		
		return FirstName;
	}


	@Override
	public String getLastName() {
		
		return LastName;
	}


	@Override
	public String getCprNo() {
			return CprNo;
	}


	@Override
	public String Email() {
		
		return Email;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public void setCprNo(String cprNo) {
		CprNo = cprNo;
	}


	@Override
	public int AddressId() {
		
		return AddressId;
	}


	public int getAddressId() {
		return AddressId;
	}


	public void setAddressId(int addressId) {
		AddressId = addressId;
	}


	@Override
	public String toString() {
		return "Patient [FirstName=" + FirstName + ", LastName=" + LastName + ", CprNo=" + CprNo + ", Email=" + Email
				+ ", AddressId=" + AddressId + "]";
	}


		 
}
