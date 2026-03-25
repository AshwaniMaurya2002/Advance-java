package com.tcs.hibernate_simple_crud_operation.product;

import com.tcs.hibernate_simple_crud_operation.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class ProductDao {
	
	EntityManagerFactory emf
	=Persistence.createEntityManagerFactory("hibernate");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	
	public Product saveProduct(Product product) {
		et.begin();
		em.persist(product);
		et.commit();
		return  product;
	}
	
	public Product getProductByIdDao(int id) {
		Product product=em.find(Product.class, id);
		return product;
	}
	

}
