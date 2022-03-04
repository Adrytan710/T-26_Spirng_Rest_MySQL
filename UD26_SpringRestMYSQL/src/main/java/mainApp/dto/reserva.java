package mainApp.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="reserva")
public class reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "investigador")
	investigadores investigadores;
	
	@ManyToOne
	@JoinColumn(name = "equipo")
	equipos equipos;
	
	@Temporal(TemporalType.DATE)
	private Date comienzo;
	
	@Temporal(TemporalType.DATE)
	private Date fin;

	public reserva() {
		super();
	}

	public reserva(int id, investigadores investigadores, equipos equipos, Date comienzo, Date fin) {
		super();
		this.id = id;
		this.investigadores = investigadores;
		this.equipos = equipos;
		this.comienzo = comienzo;
		this.fin = fin;
	}

	public int getId() {
		return id;
	}

	public investigadores getInvestigadores() {
		return investigadores;
	}

	public equipos getEquipos() {
		return equipos;
	}

	public Date getComienzo() {
		return comienzo;
	}

	public Date getFin() {
		return fin;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setInvestigadores(investigadores investigadores) {
		this.investigadores = investigadores;
	}

	public void setEquipos(equipos equipos) {
		this.equipos = equipos;
	}

	public void setComienzo(Date comienzo) {
		this.comienzo = comienzo;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	@Override
	public String toString() {
		return "reserva [id=" + id + ", investigadores=" + investigadores + ", equipos=" + equipos + ", comienzo="
				+ comienzo + ", fin=" + fin + "]";
	}
	
}

	