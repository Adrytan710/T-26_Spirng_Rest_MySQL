package mainApp.service;

import java.util.List;

import mainApp.dto.reserva;

public interface IreservaService {
public List<reserva> listarReservas(); 
	
	public reserva guardarReserva(reserva reserva);	
	
	public reserva ReservaXID(int id);
	
	public reserva actualizarReserva(reserva reserva); 
	
	public void eliminarReserva(int id);
}
