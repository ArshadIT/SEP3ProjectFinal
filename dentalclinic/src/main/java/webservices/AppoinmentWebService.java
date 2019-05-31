package webservices;

import java.util.List;

import javax.jws.WebService;

import model.Appointment;
@WebService(endpointInterface="webservices.IWebServiceAppointment")
public class AppoinmentWebService implements IWebServiceAppointment {

	@Override
	public void AddAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAppointment(int appointmentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void EditAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Appointment> getAllAppointment() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Appointment getAppointmentById(int appointmentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentByDentistId(int dentist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Appointment> getAppointmentByCprNo(String CprNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
