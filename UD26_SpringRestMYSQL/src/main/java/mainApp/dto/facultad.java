package mainApp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="facultad")
public class facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<investigadores> investigadores;
	
	@OneToMany
	@JoinColumn(name="id")
	private List<equipos> equipos;

	public facultad() {
		super();
	}

	public facultad(int id, String nombre, List<investigadores> investigadores, List<equipos> equipos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.investigadores = investigadores;
		this.equipos = equipos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<investigadores> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	public List<equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<equipos> equipos) {
		this.equipos = equipos;
	}

	@Override
	public String toString() {
		return "Facultad [id=" + id + ", nombre=" + nombre + ", investigadores=" + investigadores + ", equipos="
				+ equipos + "]";
	}
	
}