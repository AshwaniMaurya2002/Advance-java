package com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class State {
	
	@Id
	private int id;
	private String stateName;
	private int noOfDistricts;
	private String capital;
	

}
