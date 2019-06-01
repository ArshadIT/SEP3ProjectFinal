package model;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

public class Schedule implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int timeDateId;
	private Date date;
	private Time time;
	public Schedule(int timeDateId, Date date, Time time) {
	
		this.timeDateId = timeDateId;
		this.date = date;
		this.time = time;
	}
	
	public Schedule(Date date, Time time) {
		super();
		this.date = date;
		this.time = time;
	}

	public int getTimeDateId() {
		return timeDateId;
	}
	public void setTimeDateId(int timeDateId) {
		this.timeDateId = timeDateId;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Schedule [timeDateId=" + timeDateId + ", date=" + date + ", time=" + time + "]";
	}
	
	

}
