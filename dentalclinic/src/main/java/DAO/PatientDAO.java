package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Patient;

public class PatientDAO implements IPatientDAO{

	private DatabaseConnection dbconn;
	
	public PatientDAO() {
		dbconn = new DatabaseConnection();
	}
	@Override
	public void AddPatient(Patient patient) {
	
		
	}



	@Override
	public void updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePatient(String cprNo) {
		// TODO Auto-generated method stub
		
	}
//	@Override
//	public Patient getPatientByCprNo(String cprNo) {
//		List<Patient> list = new ArrayList<Patient>();
//		String sql = "select * from \"DentalClinic1\".patient where cprNo= '" + cprNo + "' ;";
//	
//		ResultSet rs = dbconn.retriveData(sql);
//		
//		try {
//			while(rs.next()) {
//				Patient patient = new Patient();
//				
//					patient.setFirstName(rs.getString(1));
//					patient.setLastName(rs.getString(2));
//					patient.setCprNo(rs.getString(3));
//					patient.setEmail(rs.getString(4));
//					list.add(patient);
//					System.out.println("PatientList" + list.toString());
//					
//					return list;
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				
//		
//	
//	}
//}
//	Connection c = null;
//	PreparedStatement stmt = null;
//	Statement statement = null;
//	
//	public void AddPatient(Patient patient) {
//		try {
//
//			Class.forName("org.postgresql.Driver");
//			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DentalClinic1", "postgres", "2699");
//
//			System.out.println("Opened database successfully");
//
//			stmt = c.prepareStatement(
//					"INSERT INTO \"DentalClinic1\".patient( firstName, lastName, cprNo, email) "
//							+ "VALUES (?, ?, ?,?);");
//
//			stmt.setString(1, patient.getFirstname());
//			stmt.setString(2, patient.getLastName());
//			stmt.setString(3, patient.getCprNo());
//			stmt.setString(4, patient.getCprNo());
//
//			stmt.executeUpdate();
//			System.out.println("Table in database Updated");
//			c.close();
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("database not updated");
//		
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			
//		}
//
//	}
//
//	
//
//	@Override
//	public Patient getPatientByCpr(String cprNo) {
//		Patient patient = new Patient();
//		try {
//
//			Class.forName("org.postgresql.Driver");
//			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "2699");
//
//		}catch (SQLException e) {
//				
//				e.printStackTrace();
//				} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//				try{
//					System.out.println("Loading the database");
//					
//			statement = c.createStatement();
//			ResultSet rs= statement.executeQuery("Select *from \"DentalClinic1\".patient");
//			while(rs.next()) {
//				patient.setFirstName(rs.getString("FirstName"));
//				patient.setLastName(rs.getString("lastName"));
//			patient.setCprNo(rs.getString("cprNo"));
//			patient.setEmail(rs.getString("email"));
//			//if(cprNo.equals(patient.getCprNo()))break;
//		}
//			rs.close();
//			statement.close();
//			c.close();
//			}
//			catch (SQLException e) {
//					
//				
//				} 
//		return patient;
//	}
//
//	@Override
//	public void updatePatient(Patient patient) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void deletePatient(String cprNo) {
//		// TODO Auto-generated method stub
//		
//	}


	@Override
	public Patient getPatientByCpr(String cprNo) {
		
		int i =0;
			Patient temPatient = null;

		String sql = "select * from \"DentalClinic1\".patient where cprNo= '" + cprNo + "' ;";
		
		ResultSet rs = dbconn.retriveData(sql);
		try {
			while (rs.next()) {
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastName");
					String cprNo1 = rs.getString("cprNo");
					String email = rs.getString("email");
					i++;
				//String Email = rs.getString("Email");
				// String Address= rs.getString("Address");
				temPatient= new Patient(firstName, lastName, cprNo,email);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(i);
		return temPatient;
	}
	@Override
	public List<Patient> getAllPatientByCprNo() {
		List<Patient> plist = new ArrayList<Patient>();
		String sql = "select * from \"DentalClinic1\".patient;";
		ResultSet rs = dbconn.retriveData(sql);
		try {
			while(rs.next()) {
				String firstName = rs.getString("firstname");
				String lastName = rs.getString("lastName");
					String cprNo1 = rs.getString("cprNo");
					String email = rs.getString("email");
					plist.add(new Patient(firstName, lastName, cprNo1, email));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return plist;
	}
	}