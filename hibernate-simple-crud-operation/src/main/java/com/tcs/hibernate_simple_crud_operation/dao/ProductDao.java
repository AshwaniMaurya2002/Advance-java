package com.tcs.hibernate_simple_crud_operation.product;

import java.util.List;

import com.tcs.hibernate_simple_crud_operation.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;


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
	
	public boolean deleteProductByIdDao(int id) {
		Product product =em.find(Product.class,id);
		if(product!=null) {
			et.begin();
			em.remove(product);
			et.commit();
		return true;
		}
			return false;
		
	}
	
	public boolean updateProductPriceByIdDao(int id,double price) {
		
		Product product =em.find(Product.class,id);
		if(product!=null) {
			et.begin();
			product.setPrice(price);
			em.merge(product);
			et.commit();
			return true;
		}
		return false;
	}
	
	
	public List<Product> getAllProductByColorDao(String color){
		String displayProductByColorQuery="select p from Product p where p.color=?1";
		
		Query query=em.createQuery(displayProductByColorQuery);
		
		query.setParameter(1, color);
		return query.getResultList();
		
	}
	
	
	public boolean deleteProductByPriceDao(double price) {
		
		String deleteProductByPriceQuery="Delete from Product p where p.price=?1";
		
	Query query=	em.createQuery(deleteProductByPriceQuery);
	
	
	query.setParameter(1, price);
		et.begin();
	int a=query.executeUpdate();
		et.commit();
		
		if(a!=0) {
			return true;
		}
		else return false;
		
		
		
	}
	
	
	
	
	
}
