package com.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.*;

@Repository
public class regdao {
	@Autowired
	
	SessionFactory sessionfactory;
	

	public void insert(regvo2 v) {
		try
		{
		Session session = sessionfactory.openSession();
		Transaction tr= session.beginTransaction();
		session.save(v);
		System.out.println("Done by Nehal");
		tr.commit();
	
	}
catch(HibernateException e)
		{
	e.printStackTrace();
		}
	}
}
