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
@Table(name="Cajeros")//en caso que la tabala sea diferente
public class Cajeros {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int idcajeros;
	
	@Column(name = "nomapels")//no hace falta si se llama igual
	private String nomapels;

	@OneToMany
    @JoinColumn(name="idcajero")
    private List<Ventas> ventas;

	public Cajeros() {
		super();
	}

	public Cajeros(int idcajeros, String nomapels, List<Ventas> ventas) {
		super();
		this.idcajeros = idcajeros;
		this.nomapels = nomapels;
		this.ventas = ventas;
	}

	public int getidcajeros() {
		return idcajeros;
	}

	public void setidcajeros(int idcajeros) {
		this.idcajeros = idcajeros;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
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
		return "Cajeros [idcajeros=" + idcajeros + ", nomapels=" + nomapels + "]";
	}

}