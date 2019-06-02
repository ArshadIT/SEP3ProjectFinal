package model;



import java.io.Serializable;

public class Patient implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String FirstName;
	private String LastName;
	private String CprNo;
	private String Email;
	//private String Password;
	
	
//	public Patient(String firstName, String lastName, String CprNo, String email, String password) {
//
//		this.FirstName = firstName;
//		this.LastName = lastName;
//		this.CprNo = CprNo;
//		this.Email = email;
//		this.Password = password;
//	}
	

	
	public Patient() {
		
	}





	public Patient(String firstName, String lastName, String cprNo, String email) {
		
		FirstName = firstName;
		LastName = lastName;
		CprNo = cprNo;
		Email = email;
	}





	public String getEmail() {
		return Email;
	}



	public void setEmail(String email) {
		Email = email;
	}



	@Override
	public String toString() {
		return "Patient [FirstName=" + FirstName + ", LastName=" + LastName + ", CprNo=" + CprNo + ", Email=" + Email
				+ "]";
	}



	public String getFirstname() {
		// TODO Auto-generated method stub
		return null;
	}




	public String getFirstName() {
		return FirstName;
	}




	public void setFirstName(String firstName) {
		FirstName = firstName;
	}




	public String getLastName() {
		return LastName;
	}




	public void setLastName(String lastName) {
		LastName = lastName;
	}




	public String getCprNo() {
		return CprNo;
	}




	public void setCprNo(String cprNo) {
		CprNo = cprNo;
	}





	
	
}
