package com.genesis.pruebgn.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.base.service.BaseServiceImp;
import com.genesis.pruebgn.dao.ClienteDao;
import com.genesis.pruebgn.modelo.Cliente;
import com.genesis.pruebgn.service.ClienteService;






@Service
public class ClienteServiceImp extends BaseServiceImp<Cliente, String>  implements ClienteService  {
	
	

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private ClienteDao clienteDao;


	@Override
	public void save(Cliente entity) {
		this.clienteDao.save(entity); 
		
	}


	@Override
	public List<Cliente> findAll(Specification<Cliente> spec) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
