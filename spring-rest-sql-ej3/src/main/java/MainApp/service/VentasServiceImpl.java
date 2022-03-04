package MainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MainApp.dao.IVentasDAO;
import MainApp.dto.Ventas;



@Service
public class VentasServiceImpl implements IVentasService {
	
	@Autowired
	IVentasDAO iVentasDAO;

	@Override
	public List<Ventas> listarVentas() {
		return iVentasDAO.findAll();
	}

	@Override
	public Ventas guardarVentas(Ventas Ventas) {
		return iVentasDAO.save(Ventas);
	}

	@Override
	public Ventas VentasXID(int id) {
		return iVentasDAO.findById(id).get();
	}

	@Override
	public Ventas actualizarVentas(Ventas Ventas) {
		return iVentasDAO.save(Ventas);
	}

	@Override
	public void eliminarVentas(int id) {
		iVentasDAO.deleteById(id);
	}

}
