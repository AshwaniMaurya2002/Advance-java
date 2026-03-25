package com.tcs.hibernate_simple_crud_operation;

import java.time.LocalDate;

import com.tcs.hibernate_simple_crud_operation.entity.Product;
import com.tcs.hibernate_simple_crud_operation.product.ProductDao;

public class SaveEmployeController 
{
    public static void main( String[] args )
    {
      
    	Product product=new Product();
    	ProductDao productDao=new ProductDao();
    	product.setId(101);
    	product.setName("Laptop");
    	product.setPrice(50000);
    	product.setColor("Black");
    	product.setMfd(LocalDate.parse("1969-08-10"));
    	product.setExpd(LocalDate.parse("1970-06-10"));
    	
    	Product savedProduct=productDao.saveProduct(product);
    	
    }
}
