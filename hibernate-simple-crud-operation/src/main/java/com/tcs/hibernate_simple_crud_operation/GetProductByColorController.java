package com.tcs.hibernate_simple_crud_operation;

import java.util.List;

import com.tcs.hibernate_simple_crud_operation.entity.Product;
import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class GetProductByColorController {
	
	
	public static void main(String[] args) {
		List<Product> products=new ProductDao().getAllProductByColorDao("black");
		if(products.size()>0) {
			products.forEach(a->System.out.println(a));
		}else {
			System.out.println("Color not available");
		}
		
		
	}

}
