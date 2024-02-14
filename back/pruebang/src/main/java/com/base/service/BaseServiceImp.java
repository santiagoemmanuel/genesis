package com.base.service;

import java.io.Serializable;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Path;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import com.base.dao.BaseDao;

public class BaseServiceImp<T, ID extends Serializable >  implements BaseServiceI<T, ID>   {

	
	

	@Autowired
	public BaseDao<T, ID > baseDao; 

	
	@Override
	public List<T> findAll() {		
		return (List<T>) baseDao.findAll();			
	} 

	@Override
	public void save(T entity) {
		this.baseDao.save(entity);			
	}


	@Override
	public void delete(ID id) {
		this.baseDao.deleteById(id); 
	} 
	

	@Override
	public Optional<T> findById(ID id) {
		return this.baseDao.findById(id);
	}

	@Override
	public boolean exists(ID id) {
		return this.baseDao.existsById(id);
	}

	@Override
	public List<T> findAll(Specification<T> spec) {
		return this.baseDao.findAll(spec);
	}

	@Override
	public List<T> findByAssociation(String associationName,String nestedProperty,Serializable value) {
		// TODO Auto-generated method stub
		Specification<T> spec=getAndSpecByAssociation(associationName,nestedProperty,value);
		List<T> list = this.baseDao.findAll(spec);
		return list;
	} 

	@Override
	public List<T> findByAssociation(String nestedProperty, Serializable value) {
		// TODO Auto-generated method stub
		Specification<T> spec=getAndSpecByAttribute(nestedProperty,value);
		List<T> list = this.baseDao.findAll(spec);
		return list;
	}
	
	@Override
	public List<T> findByAssociationLike(String nestedProperty, Serializable value) {	
		Specification<T> spec=getAndSpecByAttributeLike(nestedProperty,value);
		List<T> list = this.baseDao.findAll(spec);
		return list;
	} 
	
	private Specification<T> getAndSpecByAssociation(String associationName,String attribute, Serializable valueAttribute){
		return new Specification<T>() {
			
			private static final long serialVersionUID = 5226062244076176093L;

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {				
				Path<T> path = root.join(associationName).get(attribute);
				return cb.equal(path, valueAttribute);
			}
		};
	}
	
	

	private Specification<T> getAndSpecByAttribute(String attribute, Serializable valueAttribute){
		return new Specification<T>() {

			private static final long serialVersionUID = -1494464532682923525L;

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {			
				Path<T> path = root.get(attribute);
				return cb.equal(path, valueAttribute);
			}
		};
	}
	
	private Specification<T> getAndSpecByAttributeLike(String attribute, Serializable valueAttribute){
		return new Specification<T>() {
		
			
			private static final long serialVersionUID = -1494464532682923525L;

			@Override
			public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				return cb.like(cb.lower(root.get(attribute)), "%" +valueAttribute.toString().toLowerCase()+ "%");
			}
		};
	} 

	
	
	
}
