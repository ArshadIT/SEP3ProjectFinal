package model;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public interface ISchedule {
	
	public int getDateAndTimeId();
	public java.util.Date getDate();
	public String getTime();
	
	

}
