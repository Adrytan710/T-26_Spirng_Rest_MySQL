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
@Table(name="Maquinas_registradoras")//en caso que la tabala sea diferente
public class Maquinas_registradoras {

	//Atributos de entidad curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int idmaquina;
	@Column(name = "piso")//no hace falta si se llama igual
	private int piso;

	@OneToMany
    @JoinColumn(name="idmaquina")
    private List<Ventas> ventas;

	public Maquinas_registradoras() {
		super();
	}

	public Maquinas_registradoras(int idmaquina, int piso, List<Ventas> ventas) {
		super();
		this.idmaquina = idmaquina;
		this.piso = piso;
		this.ventas = ventas;
	}

	public int getIdmaquina() {
		return idmaquina;
	}

	public void setIdmaquina(int idmaquina) {
		this.idmaquina = idmaquina;
	}

	public int getPiso() {
		return piso;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "Maquinas_registradoras [idmaquina=" + idmaquina + ", piso=" + piso + ", ventas=" + ventas + "]";
	}
	
}
