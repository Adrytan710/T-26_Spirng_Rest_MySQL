package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICientificoDao;
import com.dto.Cientifico;


@Service
public class CientificoService implements ICientificoService {
	@Autowired
	ICientificoDao iCientificoDao;
	
	public List<Cientifico> listaCientificos() {
		return iCientificoDao.findAll();
	};
	
	public Cientifico addCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	public Cientifico getCientificoById(Long id) {
		return iCientificoDao.findById(id).get();
	}
	
	public void deleteCientifico(Long id) {	
		iCientificoDao.deleteById(id);
	}
}
