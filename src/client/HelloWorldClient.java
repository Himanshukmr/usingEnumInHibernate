
package client;


import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Actor;
import entity.Movie;
import util.HibernateUtil;


public class HelloWorldClient {
	public static void main(String[] args) {
		
				Session session = HibernateUtil.getSessionFactory().openSession();
        		Transaction txn = session.getTransaction();
        		try {
//        			txn.begin();
//        	
//        			Movie movie1 = new Movie("Ganjam");
//        			Movie movie2 = new Movie("Destination");
//        			
//        			Actor actor1 = new Actor("Deol");
//        			Actor actor2 = new Actor("Rajni");
//        			
//        			movie1.getActor().add(actor1);
//        			
//        			movie2.getActor().add(actor2);
//        			movie2.getActor().add(actor1);
//        			
//        			session.persist(movie1);
//        			session.persist(movie2);
//        			
//	        		txn.commit();
	        		
        			txn.begin();
                	
        			Movie movie1 = (Movie)session.get(Movie.class, 1l);
        			
        			Actor actor1 = (Actor)session.get(Actor.class, 2l);
        			
        			movie1.getActor().add(actor1);
        			
        			session.persist(movie1);
	        		txn.commit();
	        		
	        		
	        		
        		}	catch(Exception e) {
	        			if(txn != null) { txn.rollback(); }
	        			e.printStackTrace();
        		}	finally {
        				if(session != null) { session.close(); }
        		}
	
	}
}











