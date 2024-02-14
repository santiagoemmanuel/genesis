package com.genesis.pruebgn.modelo;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "GN_ESTADO_CIVIL")
@Getter
@Setter
@NoArgsConstructor

public class EstadoCivil implements java.io.Serializable {
	
	 
	@Id
	@Column(name = "ID_ESTADO_CIVIL", unique = true, nullable = false, length = 5)
	private String idEstadoCivil;
	
	@Column(length = 20)
	private String descripcion; 
	
	


}
