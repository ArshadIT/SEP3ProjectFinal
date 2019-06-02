package model;

import java.io.Serializable;

public class Branch implements IBranch, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Branch(int branchId, String branchName, String phoneNumber, String branchEmail) {
		
		BranchId = branchId;
		this.branchName = branchName;
		this.phoneNumber = phoneNumber;
		this.branchEmail = branchEmail;
	}
	
	public Branch( String branchName, String phoneNumber, String branchEmail) {
		
		this.branchName = branchName;
		this.phoneNumber = phoneNumber;
		this.branchEmail = branchEmail;
	}

	private int BranchId;
	private String branchName;
	private String phoneNumber;
	private String branchEmail;

	@Override
	public int getBranchId() {
		return BranchId;
	}

	public void setBranchId(int branchId) {
		BranchId = branchId;
	}

	@Override
	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNo(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String getBranchEmail() {
		return branchEmail;
	}

	public void setBranchEmail(String branchEmail) {
		this.branchEmail = branchEmail;
	}

	@Override
	public String toString() {
		return "Branch [BranchId=" + BranchId + ", branchName=" + branchName + ", phoneNumber=" + phoneNumber
				+ ", branchEmail=" + branchEmail + "]";
	}

}
