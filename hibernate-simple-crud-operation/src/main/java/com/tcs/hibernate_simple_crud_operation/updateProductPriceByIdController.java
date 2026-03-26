package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class updateProductPriceByIdController {
	public static void main(String[] args) {
		
		ProductDao productDao=new ProductDao();
		boolean isUpdated=productDao.updateProductPriceByIdDao(101,1200);
		if(isUpdated) {
			System.out.println("Product price updated successfully");
		}
		else {
			System.out.println("Product not found with the given id");
		}
	}

}
