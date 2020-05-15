package com.klef;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClient {
	public static void main(String[] args) {
		//load configuration file
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Employee e = new Employee();
		e.setEmpId(1001);
		e.setEmpName("Rajesh");
		e.setEmpDesig("Asst.Professor");
		e.setEmpSal(40000);
		
		s.save(e);
		
		Transaction tx = s.beginTransaction();
		tx.commit();
		
		s.close();
		sf.close();
	}
}
