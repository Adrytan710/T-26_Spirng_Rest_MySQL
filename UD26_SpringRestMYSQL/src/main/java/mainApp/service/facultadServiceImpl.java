package mainApp.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IfacultadDAO;
import mainApp.dto.facultad;

@Service
public class facultadServiceImpl implements IfacultadService {
	@Autowired
	IfacultadDAO ifacultadDAO;

	@Override
	public List<facultad> listarFacultad() {
		// TODO Auto-generated method stub
		return ifacultadDAO.findAll();
	}

	@Override
	public facultad guardarFacultad(facultad facultad) {
		// TODO Auto-generated method stub
		return ifacultadDAO.save(facultad);
	}

	@Override
	public facultad FacultadXID(int id) {
		// TODO Auto-generated method stub
		return ifacultadDAO.findById(id).get();
	}

	@Override
	public facultad actualizarFacultad(facultad facultad) {
		// TODO Auto-generated method stub
		return ifacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int id) {
		// TODO Auto-generated method stub
		ifacultadDAO.deleteById(id);
	}
}
