package com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Country {
	
	@Id
	private int id;
	private String name;
	private String capital;
	@OneToMany(cascade = CascadeType.PERSIST)
	List<State> states;

}
