package com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.dao;

import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty.Country;
import com.company.hibernate_unidirectional_mapping_crud_operation.onetomany.entitty.State;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class CountryStateDao {
	EntityManager em=Persistence.createEntityManagerFactory("hibernate").createEntityManager();
	EntityTransaction et= 	em.getTransaction();
	
	
	public Country saveCountryStateDao(Country country,State state) {
		
		et.begin();
		em.persist(country);
		et.commit();
		return country;
		
	}
	
	public Country getCountryStatesByCountryIdDao(int countryId) {
		return em.find(Country.class, countryId);
	}
	
	public boolean deleteStateByStateIdDao(int stateId) {
		
		State state = em.find(State.class, stateId);
		
		if(state!=null) {
			et.begin();
			
			String deleteStateByIdQuery = "Delete from country_state where states_id=?1";
			
			Query query=em.createNativeQuery(deleteStateByIdQuery);
			
			query.setParameter(1, stateId);
			
			query.executeUpdate();
			
			em.remove(state);
			
			et.commit();
			
			return true;
		}
		
		return false;
	}
}
	