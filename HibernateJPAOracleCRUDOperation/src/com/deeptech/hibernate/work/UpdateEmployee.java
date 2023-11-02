package com.deeptech.hibernate.work;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtility;

public class UpdateEmployee {

	public static void main(String[] args) {

		SessionFactory sf = HibernateUtility.connection();
		Session ses = sf.openSession();
		ses.beginTransaction();//perform DML operations(insert,delete,update,select)
		Employee s =ses.get(Employee.class, 4);
		s.setEmpName("Ammu Gowda");
		System.out.println("Updated successfully");
		ses.getTransaction().commit();
		ses.close();
		sf.close();
	}

	}

