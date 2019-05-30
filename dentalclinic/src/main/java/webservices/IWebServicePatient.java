package webservices;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import model.Patient;

@WebService
@SOAPBinding(style= Style.DOCUMENT)
public interface IWebServicePatient {

	@WebMethod
	public void AddPatient(Patient patient);
	
	@WebMethod
	public Patient getPatientByCprNo(String cprNo);
	@WebMethod
	public List<Patient> getAllPatientByCprNo();

	
	}
	