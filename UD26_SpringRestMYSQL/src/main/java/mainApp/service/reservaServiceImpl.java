package mainApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mainApp.dao.IreservaDAO;
import mainApp.dto.reserva;

@Service
public class reservaServiceImpl implements IreservaService {

	@Autowired
	IreservaDAO ireservaDAO;

	@Override
	public List<reserva> listarReservas() {
		// TODO Auto-generated method stub
		return ireservaDAO.findAll();
	}

	@Override
	public reserva guardarReserva(reserva reserva) {
		// TODO Auto-generated method stub
		return ireservaDAO.save(reserva);
	}

	@Override
	public reserva ReservaXID(int id) {
		// TODO Auto-generated method stub
		return ireservaDAO.findById(id).get();
	}

	@Override
	public reserva actualizarReserva(reserva reserva) {
		// TODO Auto-generated method stub
		return ireservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		// TODO Auto-generated method stub
		ireservaDAO.deleteById(id);
	}

}
