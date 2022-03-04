package mainApp.service;

import java.util.List;

import mainApp.dto.facultad;

public interface IfacultadService {
	public List<facultad> listarFacultad();

	public facultad guardarFacultad(facultad facultad);

	public facultad FacultadXID(int id);

	public facultad actualizarFacultad(facultad facultad);

	public void eliminarFacultad(int id);
}
