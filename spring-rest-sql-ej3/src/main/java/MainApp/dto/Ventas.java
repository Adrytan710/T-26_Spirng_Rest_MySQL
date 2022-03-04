package MainApp.dto;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="Ventas")//en caso que la tabala sea diferente
public class Ventas {

	//Atributos de entidad registro_curso
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private int id;
	
	@ManyToOne
    @JoinColumn(name = "idcajero")
    private Cajeros idcajero;
 
    @ManyToOne
    @JoinColumn(name = "idproducto")
    private Productos idproducto;
    
    @ManyToOne
    @JoinColumn(name = "idmaquina")
    private Maquinas_registradoras idmaquina;

	public Ventas() {
		super();
	}

	public Ventas(int id, Cajeros idcajero, Productos idproducto, Maquinas_registradoras idmaquina) {
		super();
		this.id = id;
		this.idcajero = idcajero;
		this.idproducto = idproducto;
		this.idmaquina = idmaquina;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cajeros getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(Cajeros idcajero) {
		this.idcajero = idcajero;
	}

	public Productos getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Productos idproducto) {
		this.idproducto = idproducto;
	}

	public Maquinas_registradoras getIdmaquina() {
		return idmaquina;
	}

	public void setIdmaquina(Maquinas_registradoras idmaquina) {
		this.idmaquina = idmaquina;
	}

	@Override
	public String toString() {
		return "Ventas [id=" + id + ", idcajero=" + idcajero + ", idproducto=" + idproducto + ", idmaquina=" + idmaquina
				+ "]";
	}

}
