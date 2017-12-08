package com.pratik.DAO;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;


import com.pratik.domain.demo;
import com.pratik.utility.HibernateUtil;

public class DAO_IMPL implements DAO_Interface {

	@Override
	public List<demo> getList() {
		//create the session
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
			//create the list of class object
			List<demo> list=null;
				//create the SQLquery
		SQLQuery query=ses.createSQLQuery("select * from product");
		query.addEntity(demo.class);
			//execute the query
			list=query.list();

				//close the session
			HibernateUtil.closeSession(ses);
			//return the list
			return list;
	}
}
