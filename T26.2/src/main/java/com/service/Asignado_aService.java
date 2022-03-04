package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IAsignado_aDao;
import com.dto.Asignado_a;

@Service
public class Asignado_aService implements IAsignado_aService{
	@Autowired
	IAsignado_aDao iAsignado_aDao;
	
	public List<Asignado_a> listaAsignado_a() {
		return iAsignado_aDao.findAll();
	};
	
	public Asignado_a addAsignado_a(Asignado_a asignado_a) {
		return iAsignado_aDao.save(asignado_a);
	}

	public Asignado_a getAsignado_aById(Long id) {
		return iAsignado_aDao.findById(id).get();
	}
	
	public void deleteAsignado_a(Long id) {	
		iAsignado_aDao.deleteById(id);
	}
}
