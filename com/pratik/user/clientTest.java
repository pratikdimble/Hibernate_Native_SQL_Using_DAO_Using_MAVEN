package com.pratik.user;

import java.util.List;

import com.pratik.DAO.DAO_Factory;
import com.pratik.DAO.DAO_Interface;
import com.pratik.domain.demo;
import com.pratik.utility.HibernateUtil;

public class clientTest {

	public static void main(String[] args) 
	{
		//use dao
		DAO_Interface dao=DAO_Factory.getInstance();
		//call getList method
		List<demo> list=dao.getList();
		//display the list
					for(demo row:list) {

						System.out.println("\n"+row);
					}
	//close the session factory
					HibernateUtil.closeFactory();
	}//main()
}//class
