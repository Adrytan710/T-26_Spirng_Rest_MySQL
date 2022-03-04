package com.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="asignado_a")
public class Asignado_a {
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@ManyToOne
	    @JoinColumn(name="cientifico")
	    private Cientifico cientifico;
		@ManyToOne
	    @JoinColumn(name="proyecto")
	    private Proyecto proyecto;
		
		//constructores
		
		public Asignado_a() {
			super();
		}

		public Asignado_a(Long id, Cientifico cientifico, Proyecto proyecto) {
			super();
			this.id = id;
			this.cientifico = cientifico;
			this.proyecto = proyecto;
		}

		//getters y setters
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Cientifico getCientifico() {
			return cientifico;
		}

		public void setCientifico(Cientifico cientifico) {
			this.cientifico = cientifico;
		}

		public Proyecto getProyecto() {
			return proyecto;
		}

		public void setProyecto(Proyecto proyecto) {
			this.proyecto = proyecto;
		}

		@Override
		public String toString() {
			return "Asignado_a [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
		}
		
		
		
		

}
