package com.genesis.pruebgn.modelo;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="GN_PRESTAMO")
@Getter
@Setter
@NoArgsConstructor
public class Prestamo  implements java.io.Serializable {
	
private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="CODIGO_PRESTAMO", unique=true, nullable=false, length=20)
    private String codigoPrestamo;
    
    @Column(name="CODIGO_CLIENTE", length=50)
    private String codigoCliente;
    
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="CODIGO_CLIENTE", referencedColumnName = "DPI" , insertable = false, updatable =  false )
    private Cliente cliente;
    
    
    @Column(name="MONTO", precision=22, scale=5)
    private BigDecimal monto;
    
    @Column(name="CANTIDAD_COUTAS", precision=5, scale=0)
    private BigDecimal cantidadCoutas;
    
    @Temporal(TemporalType.TIMESTAMP )
    @Column(name="FECHA_REGISTRO", columnDefinition = "DATE")
    private LocalDateTime fechaRegistro;
    
                                                             
              
    }


