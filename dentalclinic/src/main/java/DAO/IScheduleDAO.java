package DAO;

import java.util.List;

import model.Schedule;

public interface IScheduleDAO {

public void AddSchedule(Schedule schedule);
	
	public Schedule getScheduleById(int timeDateId);
	
	public void updateSchedule(Schedule schedule);
	
	public void deleteSchedule(Schedule schedule);
	
	public List<Schedule> getAllSchedule();

}
