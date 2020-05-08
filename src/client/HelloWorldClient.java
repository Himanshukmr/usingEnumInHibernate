package client;

import org.hibernate.Session;

import entity.EmployeeDetails;
import entity.EmployeeStatus;

import util.HibernateUtil;

public class HelloWorldClient {
	
	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		//persisting
		EmployeeDetails EmployeeDetails1 = new EmployeeDetails("Josh Stockham", "2014JA11001", EmployeeStatus.FULL_TIME);
		EmployeeDetails EmployeeDetails2 = new EmployeeDetails("Ammie Corrio", "2014AI21543", EmployeeStatus.PART_TIME);
		EmployeeDetails EmployeeDetails3 = new EmployeeDetails("Ernie Stenseth", "2014ET25100", EmployeeStatus.CONTRACT);
		
		session.persist(EmployeeDetails1);
		session.persist(EmployeeDetails2);
		session.persist(EmployeeDetails3);
		
		/*EmployeeDetails EmployeeDetails = (EmployeeDetails) session.get(EmployeeDetails.class, 2L);
		System.out.println(EmployeeDetails);*/
		
		session.getTransaction().commit();
		session.close();
		
	}	

}
