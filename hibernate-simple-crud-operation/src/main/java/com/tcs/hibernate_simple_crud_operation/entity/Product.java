package com.tcs.hibernate_simple_crud_operation.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	private int  id;
	@Column(name="product_name")
	private String name;
	@Column(name="productprice")
	private double price;
	private String color;
	private LocalDate mfd;
	private LocalDate expd;
	
	
	
}
