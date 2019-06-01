package model;

import java.sql.Date;

public class Appointment implements IAppointment {

	private int appointmentID;
	private int dentistId;
	private int DateAndTimeID;
	private String CprNo;
	private int branchID;

	public Appointment(int appointmentID, int dentistId, int DateAndTimeID, String cprNo, int branchID) {

		this.appointmentID = appointmentID;
		this.dentistId = dentistId;
		this.DateAndTimeID = DateAndTimeID;
		CprNo = cprNo;
		this.branchID = branchID;
	}
	//used for add methods.
	public Appointment(int dentistId, int DateAndTimeID, String cprNo, int branchID) {
		this.dentistId = dentistId;
		this.DateAndTimeID = DateAndTimeID;
		CprNo = cprNo;
		this.branchID = branchID;
	}

	public Appointment(int appointmentID, int dentistId, int DateAndTimeID) {

		this.appointmentID = appointmentID;
		this.dentistId = dentistId;
		this.DateAndTimeID = DateAndTimeID;

	}

	@Override
	public String toString() {
		return "Appointment [appointmentID=" + appointmentID + ", dentistId=" + dentistId + ", DateAndTimeID="
				+ DateAndTimeID + ", CprNo=" + CprNo + ", branchID=" + branchID + "]";
	}

	@Override
	public int getAppointmentID() {
		return appointmentID;
	}

	public void setAppointmentID(int appointmentID) {
		this.appointmentID = appointmentID;
	}

	@Override
	public int getDentistId() {
		return dentistId;
	}

	public void setDentistId(int dentistId) {
		this.dentistId = dentistId;
	}

	@Override
	public int getDateAndTimeID() {
		return DateAndTimeID;
	}

	public void setDateAndTimeD(int DateAndTimeID) {
		this.DateAndTimeID = DateAndTimeID;
	}

	@Override
	public String getCprNo() {
		return CprNo;
	}

	public void setCprNo(String cprNo) {
		CprNo = cprNo;
	}

	@Override
	public int getBranchID() {
		return branchID;
	}

	public void setBranchID(int branchID) {
		this.branchID = branchID;
	}

}
