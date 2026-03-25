package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation.entity.Product;
import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class getProductByIdController {
	public static void main(String[] args) {
		ProductDao productDao=new ProductDao();
		
		Product product=productDao.getProductByIdDao(101);
		
		if(product!=null) {
		System.out.println(product);
		}
		else {
			System.out.println("Oopise product not found");
		}
		
		
	}

}
