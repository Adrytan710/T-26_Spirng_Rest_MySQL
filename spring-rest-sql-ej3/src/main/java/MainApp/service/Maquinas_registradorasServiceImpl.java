package MainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainApp.dao.IMaquinas_registradorasDAO;
import MainApp.dto.Maquinas_registradoras;



@Service
public class Maquinas_registradorasServiceImpl implements IMaquinas_registradorasService {
	
	@Autowired
	IMaquinas_registradorasDAO iMaquinas_registradorasDAO;

	@Override
	public List<Maquinas_registradoras> listarMaquinas_registradoras() {
		return iMaquinas_registradorasDAO.findAll();
	}

	@Override
	public Maquinas_registradoras guardarMaquinas_registradoras(Maquinas_registradoras Maquinas_registradoras) {
		return iMaquinas_registradorasDAO.save(Maquinas_registradoras);
	}

	@Override
	public Maquinas_registradoras Maquinas_registradorasXID(int id) {
		return iMaquinas_registradorasDAO.findById(id).get();
	}

	@Override
	public Maquinas_registradoras actualizarMaquinas_registradoras(Maquinas_registradoras Maquinas_registradoras) {
		return iMaquinas_registradorasDAO.save(Maquinas_registradoras);
	}

	@Override
	public void eliminarMaquinas_registradoras(int id) {
		iMaquinas_registradorasDAO.deleteById(id);
	}

}
