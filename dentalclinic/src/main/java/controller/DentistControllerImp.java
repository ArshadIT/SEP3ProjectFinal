package controller;

import java.util.List;

import DAO.DentistDAO;
import DAO.IDentistDAO;
import model.Dentist;

public class DentistControllerImp implements IDentistController   {

	private IDentistDAO dentistDAO = new DentistDAO();
	
	public DentistControllerImp() {
		
	}
		

	@Override
	public void AddDentist(Dentist newDentist) {
		dentistDAO.AddDentist(newDentist);
	}

	@Override
	public Dentist getDentistByDentistId(int Id) {

		return dentistDAO.getDentist(Id);
	}

	@Override
	public List<Dentist> getAllDentistByBranchId(int branchId) {
		return  dentistDAO.getAllDentistByBranchId(branchId);
	}

	@Override
	public List<Dentist> getAllDentist() {
		return dentistDAO.getAllDentist();
	}

	@Override
	public void RemoveDentistById(int id) {
		dentistDAO.RemoveDentist(id);
	}


	@Override
	public void EditDentist(Dentist dentist) {
		dentistDAO.EditDentist(dentist);
	}

}