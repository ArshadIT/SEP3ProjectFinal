package model;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Schedule implements ISchedule, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int dateAndTimeId;
	private java.util.Date date;
	private java.util.Date time;

	public Schedule(int dateAndTimeId, java.util.Date date2, java.util.Date time2) {

		this.dateAndTimeId = dateAndTimeId;
		this.date = date2;
		this.time = time2;
	}

	public Schedule(Date date, Date time) {

		this.date = date;
		this.time = time;
	}
	public Schedule(int dateAndTimeId,String date, String time) {
		this.dateAndTimeId=dateAndTimeId;
		try {
			this.date=new SimpleDateFormat("dd-MM-yyyy").parse(date);
			this.time=new SimpleDateFormat("HH:mm").parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	@Override
	public int getDateAndTimeId() {
		return dateAndTimeId;
	}

	public void setDateAndTimeId(int dateAndTimeId) {
		this.dateAndTimeId = dateAndTimeId;
	}

	@Override
	public java.util.Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String getTime() {
		return time.getHours()+":"+time.getMinutes();
	}

	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Schedule [dateAndTimeId=" + dateAndTimeId + ", date=" + date + ", time=" + time + "]";
	}

}
