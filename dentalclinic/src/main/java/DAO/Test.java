package DAO;

import controller.AppointmentController;
import model.Appointment;
import model.Branch;
import model.Dentist;
import model.IAppointment;
import webservices.AppoinmentWebService;
import webservices.IWebServiceAppointment;

public class Test {

	public static void main(String[] args) {
		DentistDAO ddao = new DentistDAO();
		AppoinmentWebService test=  new AppoinmentWebService(); 
		BranchDAO nn = new BranchDAO();
		AppointmentDAO app = new AppointmentDAO();
		AppointmentController testcon = new AppointmentController();
		// PatientDAO pp = new PatientDAO();
		//Appointment neewapp = new Appointment(1, 1, "030284xxxx", 1);
		//Appointment newapp = new Appointment(2, 1, 3);
		//Branch branch = new Branch("DentistRy", "25268495", "denRy@mail.com");
			//nn.AddBranch(branch);
		 //app.AddAppointment(neewapp);
		//app.EditAppointment(newapp);
		//app.deleteAppointment(11);
		//ddao.AddDentist(new Dentist("Rachel", "Zhi", 1, "babyteeth"));
		System.out.println(nn.getAllBranch());
		//System.out.println(testcon.getAllAppointment());
		//System.out.println(test.getAllAppointment());
		//System.out.println(app.getAllAppointment());
		//System.out.println(app.getAppointmentByCprNo("030284xxxx"));
		//System.out.println(app.getAppointmentByDentistId(2));
		//System.out.println(app.getAppointmentById(1));
//		System.out.println(ddao.getDentist(1));
//		System.out.println(ddao.getAllDentistByBranchId(1));
		//System.out.println(ddao.getAllDentist());
		// System.out.println(pp.getPatientByCpr("030284xxxx"));
		// ddao.RemoveDentist(3);
	}

}
