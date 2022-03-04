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
@Table(name="proyecto")//en caso que la tabala sea diferente
public class Proyecto {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name ="nombre")
	private String nombre;
	@Column(name = "horas")//no hace falta si se llama igual
	private int horas;
	@OneToMany
    @JoinColumn(name="id")
    private List<Asignado_a> empleado;
    
    //constructores
    
	public Proyecto() {
		super();
	}

	public Proyecto(Long id, String nombre, int horas, List<Asignado_a> empleado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.empleado = empleado;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public List<Asignado_a> getEmpleado() {
		return empleado;
	}

	public void setEmpleado(List<Asignado_a> empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + ", empleado=" + empleado + "]";
	}
	
	
	
    
    
}
