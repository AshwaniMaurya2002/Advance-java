package com.tcs.hibernate_simple_crud_operation;

import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class DeleteProductByPriceController {
	
	public static void main(String[] args) {
		
		boolean b =new ProductDao().deleteProductByPriceDao(1200);
		
		String msg= b?"deleted":"check your price";
		
		System.out.println(b);
	}

}
