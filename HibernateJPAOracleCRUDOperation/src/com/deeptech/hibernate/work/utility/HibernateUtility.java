package com.deeptech.hibernate.work.utility;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {

	private static SessionFactory sessionfactory;
	

	static      //static block
	{
	sessionfactory = new Configuration().configure().buildSessionFactory();
	     //sessionfactory is used to call hibernate configuration file
	}
	public static SessionFactory connection()
	{
		return sessionfactory;
	}

}
