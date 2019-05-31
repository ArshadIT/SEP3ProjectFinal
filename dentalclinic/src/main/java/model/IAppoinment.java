package model;

import java.sql.Date;

public interface IAppoinment {
	public int getAppointmentId();
	public int  getDentistId();
	public Date getDateAndTime();
	public String getCprNo();
	public int getBranchId();
	

}
