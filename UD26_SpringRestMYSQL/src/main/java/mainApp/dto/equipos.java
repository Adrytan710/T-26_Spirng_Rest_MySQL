package mainApp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="equipos")
public class equipos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String numserie;
	
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "facultad")
	facultad facultad;	
	@OneToMany
	@JoinColumn(name = "numserie")
	private List<reserva> reserva;

	public equipos() {
		super();
	}

	public equipos(int id, String numserie, String nombre, facultad facultad, List<reserva> reserva) {
		super();
		this.id = id;
		this.numserie = numserie;
		this.nombre = nombre;
		this.facultad = facultad;
		this.reserva = reserva;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNumserie(String numserie) {
		this.numserie = numserie;
	}
	
	public String getNumserie() {
		return numserie;
	}

	public String getNombre_facultad() {
		return nombre;
	}

	public void setNombre_facultad(String nombre) {
		this.nombre = nombre;
	}

	public facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(facultad facultad) {
		this.facultad = facultad;
	}

	public List<reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "equipos [id=" + id + ", numserie=" + numserie + ", nombre=" + nombre + ", facultad=" + facultad
				+ ", reserva=" + reserva + "]";
	}

	
	
	
}
