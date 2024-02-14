package com.genesis.pruebgn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genesis.pruebgn.modelo.Cliente;
import com.genesis.pruebgn.modelo.Prestamo;
import com.genesis.pruebgn.service.ClienteService;
import com.genesis.pruebgn.service.PrestamosService;



@RequestMapping("/ws")

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class ClienteController { 
	

	@Autowired
	private ClienteService ClientSrv;		
	
	@Autowired
	private PrestamosService prestamoSrv ;

	

	 @GetMapping("/clientes")
	    public ResponseEntity<List<Cliente>>  clientes() {										 
		return new ResponseEntity<List<Cliente>>(ClientSrv.findAll(), HttpStatus.OK);
		 		 		 	        	       	         	        	        	                
}
	 
	 
	 	@PostMapping("/cliente")
	    public ResponseEntity<Cliente>  cliente(@RequestBody  Cliente cliente  ) {
	 		ClientSrv.save(cliente);		 
		return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
		 		 		 	        	        	         	        	        	                
	    }	 
	 	
	 	
	 	
	 	
	 	@GetMapping("/prestamos")
	    public ResponseEntity<List<Prestamo>>  prestamos() {										 
		return new ResponseEntity<List<Prestamo>>(prestamoSrv.findAll(), HttpStatus.OK);
		 		 		 	        	       	         	        	        	                
}
	 
	 
	 	@PostMapping("/prestamo")
	    public ResponseEntity<Prestamo>  prestamo(@RequestBody  Prestamo cliente  ) {
	 		prestamoSrv.save(cliente);		 
		return new ResponseEntity<Prestamo>(cliente, HttpStatus.OK);
		 		 		 	        	        	         	        	        	                
	    }
	 	
	 	
	 	
	 

	 
		
	 
	 	 
	 
	
		
		
		
		
								 	 	 	 	 	 	 	 
}
