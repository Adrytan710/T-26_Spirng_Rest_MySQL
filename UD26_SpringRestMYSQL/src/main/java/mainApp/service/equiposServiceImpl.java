package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IequiposDAO;
import mainApp.dto.equipos;

@Service
public class equiposServiceImpl implements IequiposService {
	@Autowired
	IequiposDAO iequiposDAO;
	
	@Override
	public List<equipos> listarEquipos() {
		// TODO Auto-generated method stub
		return iequiposDAO.findAll();
	}

	@Override
	public equipos guardarEquipos(equipos equipos) {
		// TODO Auto-generated method stub
		return iequiposDAO.save(equipos);
	}

	@Override
	public equipos EquiposXID(int id) {
		// TODO Auto-generated method stub
		return iequiposDAO.findById(id).get();
	}

	@Override
	public equipos actualizarEquipos(equipos equipos) {
		// TODO Auto-generated method stub
		return iequiposDAO.save(equipos);
	}

	@Override
	public void eliminarEquipos(int id) {
		// TODO Auto-generated method stub
		iequiposDAO.deleteById(id);
	}
}
