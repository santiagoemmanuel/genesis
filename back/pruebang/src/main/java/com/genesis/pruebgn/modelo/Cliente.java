package com.genesis.pruebgn.modelo;
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
@Table(name="GN_CLIENTE")
@Getter
@Setter
@NoArgsConstructor
public class Cliente  implements java.io.Serializable {
	
private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name="DPI", unique=true, nullable=false, length=20)
    private String dpi;
    
    @Column(name="NOMBRE_COMPLETO", length=50)
    private String nombreCompleto;
    
    @Temporal(TemporalType.TIMESTAMP )
    @Column(name="FECHA_NACIMIENTO", columnDefinition = "DATE")
    private LocalDateTime fechaNacimiento;
    
    @Column(name="DIRECCION", length=8)
    private String direccion;
            
    @Column(name="TELEFONO", length=8)
    private String telefono; 
    
    @Column(name="ID_ESTADO_CIVIL", length=5)
    private String idEstadoCivil;
    
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="ID_ESTADO_CIVIL", referencedColumnName = "ID_ESTADO_CIVIL" , insertable = false, updatable =  false )
    private EstadoCivil estadoCivil;
    
    
    
    @Temporal(TemporalType.TIMESTAMP )
    @Column(name="FECHA_REGISTO", columnDefinition = "DATE")
    private LocalDateTime fechaRegistro;
                                
              
    }


