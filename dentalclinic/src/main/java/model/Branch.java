package model;

public class Branch implements IBranch {
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
	
	
	

	

}
