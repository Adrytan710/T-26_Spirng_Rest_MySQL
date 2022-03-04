package MainApp.service;

import java.util.List;

import MainApp.dto.Ventas;

public interface IVentasService {

	//Metodos del CRUD
	public List<Ventas> listarVentas(); //Listar All 
	
	public Ventas guardarVentas(Ventas Ventas);	//Guarda un Ventas CREATE
	
	public Ventas VentasXID(int id); //Leer datos de un Ventas READ
	
	public Ventas actualizarVentas(Ventas Ventas); //Actualiza datos del Ventas UPDATE
	
	public void eliminarVentas(int id);// Elimina el Ventas DELETE
	
}
