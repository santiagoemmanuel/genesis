package com.base.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean  
public interface BaseDao <T, ID extends Serializable> extends JpaRepository<T, ID> ,  JpaSpecificationExecutor<T> {
 
}


