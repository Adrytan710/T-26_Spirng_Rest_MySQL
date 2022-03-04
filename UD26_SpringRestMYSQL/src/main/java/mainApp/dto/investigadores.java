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
@Table(name="investigadores")
public class investigadores {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dni;
	private String nomapels;
	@ManyToOne
	@JoinColumn(name = "facultad")
	facultad facultad;
	@OneToMany
	@JoinColumn(name = "dni")
	private List<reserva> reserva;

	public investigadores() {
		super();
	}


	public investigadores(int id, String dni, facultad facultad, String nomapels, List<reserva> reserva) {
		super();
		this.id = id;
		this.dni = dni;
		this.facultad = facultad;
		this.nomapels = nomapels;
		this.reserva = reserva;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public facultad getFacultad() {
		return facultad;
	}

	public void setFacultad(facultad facultad) {
		this.facultad = facultad;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}

	public List<reserva> getReserva() {
		return reserva;
	}

	public void setReserva(List<reserva> reserva) {
		this.reserva = reserva;
	}

	@Override
	public String toString() {
		return "InvestigadoresServiceIMPL [dni=" + dni + ", facultad=" + facultad + ", nomapels=" + nomapels
				+ ", reserva=" + reserva + "]";
	}
	
}
