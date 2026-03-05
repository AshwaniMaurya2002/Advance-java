package com.tcs.jdbc_servlet_prepared_crud_operation.controller;

import com.tcs.jdbc_servlet_prepared_crud_operation.dao.InsertIntoCustomerDao;

public class InsertIntoCustomerController {
	public static void main(String[] args) {
		
		InsertIntoCustomerDao insertIntoCustomerDao=new InsertIntoCustomerDao();
		
		boolean res=insertIntoCustomerDao.insertIntoCustomer();
		System.out.println(res);
		
	}

}
