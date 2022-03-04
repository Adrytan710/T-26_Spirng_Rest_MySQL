package com.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="cientificos")//en caso que la tabala sea diferente
public class Cientifico {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name ="dni")
	private String dni;
	@Column(name = "nomapels")
	private String nomapels;
	
	@OneToMany
    @JoinColumn(name="Id")
    private List<Asignado_a> asignado_a ;
    
    //constructores
    
	public Cientifico() {
		super();
	}

	public Cientifico(Long id, String dni, String nomapels, List<Asignado_a> asignado_a) {
		this.id = id;
		this.dni = dni;
		this.nomapels = nomapels;
		this.asignado_a = asignado_a;
	}
	
	//getters y setters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getnomapels() {
		return nomapels;
	}

	public void setnomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public List<Asignado_a> getAsignado_a() {
		return asignado_a;
	}

	public void setEmpleado(List<Asignado_a> asignado_a) {
		this.asignado_a = asignado_a;
	}

	
	@Override
	public String toString() {
		return "Cientifico [id=" + id + ", dni=" + dni + ", nomapels=" + nomapels + ", empleado=" + asignado_a + "]";
	}
	
	
	
	
	
	
    
    

}
