package com.genesis.pruebgn.serviceImp;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.base.service.BaseServiceImp;
import com.genesis.pruebgn.dao.ClienteDao;
import com.genesis.pruebgn.dao.PrestamoDao;
import com.genesis.pruebgn.modelo.Cliente;
import com.genesis.pruebgn.modelo.Prestamo;
import com.genesis.pruebgn.service.ClienteService;
import com.genesis.pruebgn.service.PrestamosService;



@Service
public class PrestamosServiceImp extends BaseServiceImp<Prestamo, String>  implements PrestamosService  {
	

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Autowired
	private ClienteDao clienteDao;
	
	@Autowired
	private PrestamoDao prestamoDao;


	@Override
	public void save(Prestamo entity) {
		prestamoDao.save(entity); 
		
	}


	@Override
	public List<Prestamo> findAll(Specification<Prestamo> spec) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
