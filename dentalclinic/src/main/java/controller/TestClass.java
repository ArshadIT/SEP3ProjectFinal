package controller;

public class TestClass {

	public static void main(String[] args) {
		
		
		PatientControllerImp  pacimp = new PatientControllerImp();
		IDentistController den = new DentistControllerImp();
		den.getAllDentist();
	}

}
