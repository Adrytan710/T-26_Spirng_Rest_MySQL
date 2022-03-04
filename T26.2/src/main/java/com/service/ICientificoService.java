package com.service;

import java.util.List;

import com.dto.Cientifico;

public interface ICientificoService {
	//Metodos del CRUD
	public List<Cientifico> listaCientificos(); 
	
	public Cientifico addCientifico(Cientifico cientifico);
	
	public Cientifico getCientificoById(Long id);
	
	public void deleteCientifico(Long id);
}
