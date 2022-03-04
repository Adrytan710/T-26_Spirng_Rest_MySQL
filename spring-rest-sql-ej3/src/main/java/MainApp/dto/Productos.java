package MainApp.dto;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name="Productos")//en caso que la tabala sea diferente
public class Productos {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int idproductos;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "precio")//no hace falta si se llama igual
	private int precio;

	public Productos() {
		super();
	}

	@OneToMany
    @JoinColumn(name="idproducto")
    private List<Ventas> ventas;

	public Productos(int idproductos, String nombre, int precio, List<Ventas> ventas) {
		super();
		this.idproductos = idproductos;
		this.nombre = nombre;
		this.precio = precio;
		this.ventas = ventas;
	}

	public int getIdproductos() {
		return idproductos;
	}

	public void setIdproductos(int idproductos) {
		this.idproductos = idproductos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Ventas")
	public List<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(List<Ventas> ventas) {
		this.ventas = ventas;
	}

	@Override
	public String toString() {
		return "Productos [idproductos=" + idproductos + ", nombre=" + nombre + ", precio=" + precio + ", Ventas="
				+ ventas + "]";
	}
	
}
