package com.service;

import java.util.List;

import com.dto.Asignado_a;

public interface IAsignado_aService {

	//Metodos del CRUD
	public List<Asignado_a> listaAsignado_a(); 
	
	public Asignado_a addAsignado_a(Asignado_a asignado_a);
	
	public Asignado_a getAsignado_aById(Long id);
	
	public void deleteAsignado_a(Long id);
}
