package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IProyectoDao;
import com.dto.Proyecto;

@Service
public class ProyectoService implements IProyectoService{
	@Autowired
	IProyectoDao iProyectoDao;
	
	public List<Proyecto> listaProyectos() {
		return iProyectoDao.findAll();
	};
	
	public Proyecto addProyecto(Proyecto proyecto) {
		return iProyectoDao.save(proyecto);
	}

	public Proyecto getProyectoById(Long id) {
		return iProyectoDao.findById(id).get();
	}
	
	public void deleteProyecto(Long id) {	
		iProyectoDao.deleteById(id);
	}
}
