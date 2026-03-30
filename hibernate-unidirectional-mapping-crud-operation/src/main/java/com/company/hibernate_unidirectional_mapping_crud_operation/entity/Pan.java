package com.company.hibernate_unidirectional_mapping_crud_operation.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Pan {
	
	@Id
	private int id;
	
	@Column(unique = true)
	private String panNumber;

}
