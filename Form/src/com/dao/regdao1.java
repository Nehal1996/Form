package com.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vo.regvo;
import com.vo.regvo2;

@Repository
public class regdao1 {
	
	@Autowired
	SessionFactory sessionfactory;
	public List search(regvo2 c)
	{
		
		Session session = sessionfactory.openSession();
		Query q=session.createQuery("from regvo2 where fn='"+c.getFn()+"'");
	List ls=q.list();
	return ls;
	}
	
	
	public List update(regvo2 v)
	{
		
		Session session = sessionfactory.openSession();
		Query q=session.createQuery("from regvo2 where id='"+v.getId()+"'");
	List ls=q.list();
	return ls;
	}
	
	public void edit(regvo2 vo) {

		try {
			Session session = sessionfactory.openSession();
			Transaction tr = session.beginTransaction();
			session.saveOrUpdate(vo);
			System.out.println("done baby!!!!");
			tr.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	}

	

}
