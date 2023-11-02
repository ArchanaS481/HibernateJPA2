package com.deeptech.hibernate.work;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.deeptech.hibernate.work.dto.Employee;
import com.deeptech.hibernate.work.utility.HibernateUtility;


public class ReadEmployee {

	public static void main(String[] args) {

	      SessionFactory sf = HibernateUtility.connection();
	      Session ses = sf.openSession();
	    	ses.beginTransaction();//performs DML operation(insert,select,update,delete)
	    	//Collection Framework
	    	Query q =ses.createQuery("from Employee");
	        List<Employee> em = q.list();  
	        for(Employee e:em)
	        {
	        	System.out.println(e.getEmpName()+"\t"+e.getDesignation()+"\t"+e.getSalary());
	        }
	        ses.getTransaction().commit();
	        ses.close();
	        sf.close();
		}

	}

