package webservices;

import java.util.List;

import javax.jws.WebService;

import controller.DentistControllerImp;
import controller.IDentistController;
import model.Dentist;

@WebService(endpointInterface = "webservices.IWebServiceDentist")
public class DentistWebService implements IWebServiceDentist {
 private IDentistController dentistcontroller;
	public DentistWebService() {
	 dentistcontroller = new DentistControllerImp();}
	@Override
	public void AddDentist(Dentist newDentist) {
		
	}

	@Override
	public Dentist getDentisttByDentistId(int dentistId) {
		
		
		return dentistcontroller.getDentistByDentistId(dentistId);
		
	}

	@Override
	public List<Dentist> getAllDentist() {
		return dentistcontroller.getAllDentist();
	}

	@Override
	public void EditDentist(Dentist dentist) {
		dentistcontroller.EditDentist(dentist);
	}

}

