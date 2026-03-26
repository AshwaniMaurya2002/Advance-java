package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class deleteProductByIdController {
	
	public static void main(String[] args) {
		
		ProductDao productDao=new ProductDao();
		boolean isDeleted=productDao.deleteProductByIdDao(1);
		if(isDeleted) {
			System.out.println("Product deleted successfully");
		}
		else {
			System.out.println("Product not found with the given id");
		}
	}

}
