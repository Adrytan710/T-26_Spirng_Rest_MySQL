package mainApp.service;

import java.util.List;

import mainApp.dto.equipos;

public interface IequiposService {

public List<equipos> listarEquipos(); 
	
	public equipos guardarEquipos(equipos equipos);	
	
	public equipos EquiposXID(int id);
	
	public equipos actualizarEquipos(equipos equipos); 
	
	public void eliminarEquipos(int id);
}
