package MainApp.service;

import java.util.List;

import MainApp.dto.Maquinas_registradoras;

public interface IMaquinas_registradorasService {

	//Metodos del CRUD
	public List<Maquinas_registradoras> listarMaquinas_registradoras(); //Listar All 
	
	public Maquinas_registradoras guardarMaquinas_registradoras(Maquinas_registradoras Maquinas_registradoras);	//Guarda un Maquinas_registradoras CREATE
	
	public Maquinas_registradoras Maquinas_registradorasXID(int id); //Leer datos de un Maquinas_registradoras READ
	
	public Maquinas_registradoras actualizarMaquinas_registradoras(Maquinas_registradoras Maquinas_registradoras); //Actualiza datos del Maquinas_registradoras UPDATE
	
	public void eliminarMaquinas_registradoras(int id);// Elimina el Maquinas_registradoras DELETE
	
}
