package com.service;

import java.util.List;

import com.dto.Proyecto;

public interface IProyectoService {

	//Metodos del CRUD
	public List<Proyecto> listaProyectos(); 
	
	public Proyecto addProyecto(Proyecto proyecto);
	
	public Proyecto getProyectoById(Long id);
	
	public void deleteProyecto(Long id);
}
