package webservices;

import java.util.List;

import javax.jws.WebService;

import controller.DentistControllerImp;
import model.Dentist;

@WebService(endpointInterface="webservices.IWebServiceDentist")
public class DentistWebService implements IWebServiceDentist {

	@Override
	public void AddDentist(Dentist newDentist) {
		
	}

	@Override
	public Dentist getDentisttByDentistId(int dentistId) {
		DentistControllerImp dentistcontroller = new DentistControllerImp();
		
		return dentistcontroller.getDentistByDentistId(dentistId);
		
	}

	@Override
	public List<Dentist> getAllDentist() {
		DentistControllerImp dentistcontroller = new DentistControllerImp();
		return dentistcontroller.getAllDentist();
	}

}

