package com.genesis.pruebgn.dao;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.base.dao.BaseDao;
import com.genesis.pruebgn.modelo.Prestamo;

public interface PrestamoDao extends BaseDao<Prestamo, String>, JpaSpecificationExecutor<Prestamo> {	
		
	
}	
	



	
