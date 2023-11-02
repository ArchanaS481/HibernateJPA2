package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.*;

public class CreateEmployee {

	public static void main(String[] args) {
	

		Employee e = new Employee();
		e.setEmpName("Anu");
		e.setDesignation("Developer");
		e.setSalary(25000.00);
		
		
		SessionFactory sf = HibernateUtility.connection();	
		Session ses = sf.openSession();
		ses.beginTransaction();
		ses.save(e);
		System.out.println("Record inserted successfully");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
	}


}
