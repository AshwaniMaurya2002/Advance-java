package com.tcs.jdbc_servlet_prepared_crud_operation.controller;

import com.tcs.jdbc_servlet_prepared_crud_operation.dao.UpdateCustomerNameById;

public class UpdateCustomerByName {
	
	public static void main(String[] args) {
		
		UpdateCustomerNameById cust=new UpdateCustomerNameById();
		boolean res=cust.updateCustomerNameById();
		
		System.out.println(res);
		
	}

}
