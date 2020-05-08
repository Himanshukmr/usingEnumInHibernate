
package client;

import org.hibernate.Session;
import org.hibernate.Transaction;


import util.HibernateUtil;
import entity.Customer;
import entity.Passport;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		Transaction txn = session.getTransaction();
        		try {
        			txn.begin();
        	
        			Passport passport = new Passport("8765544");
        			Customer customer = new Customer("Adam",passport);
        			
        			session.persist(customer);
        			
        			
	        		txn.commit();
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(session != null) { session.close(); }
        		}
	
	}
}











