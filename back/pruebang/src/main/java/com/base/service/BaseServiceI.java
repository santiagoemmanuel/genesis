package com.base.service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.domain.Specification;


public interface BaseServiceI<T, ID extends Serializable> {
	
	public List<T> findAll();	
	public void save(T entity);
	public void delete(ID id);
	
	public Optional<T> findById(ID id);	
	public boolean exists(ID id);

  	public List<T> findAll(Specification<T> spec);
  		
	public List<T> findByAssociation(String associationName, String nestedProperty,Serializable value); 
	public List<T> findByAssociation(String nestedProperty,Serializable value);
	public List<T> findByAssociationLike(String nestedProperty,Serializable value); 
}
