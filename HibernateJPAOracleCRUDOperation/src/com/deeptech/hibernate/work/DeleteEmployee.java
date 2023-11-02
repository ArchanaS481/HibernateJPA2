package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtility;

public class DeleteEmployee {

	public static void main(String[] args) {
		 SessionFactory sf = HibernateUtility.connection();
	      Session ses = sf.openSession();
	    	ses.beginTransaction();
	    	
	    	Employee s = ses.load(Employee.class, 4);
	    	ses.delete(s);
	    	ses.getTransaction().commit();
	    	ses.close();
	    	sf.close();
	        System.out.println("deleted successfully");
	}


	}

