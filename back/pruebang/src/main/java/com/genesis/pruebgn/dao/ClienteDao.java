package com.genesis.pruebgn.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.base.dao.BaseDao;
import com.genesis.pruebgn.modelo.Cliente;



public interface ClienteDao extends BaseDao<Cliente, String>, JpaSpecificationExecutor<Cliente> {
	
		
	
}	
	



	
