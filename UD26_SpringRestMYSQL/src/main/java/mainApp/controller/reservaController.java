package mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mainApp.dto.reserva;
import mainApp.service.reservaServiceImpl;



@RestController
@RequestMapping("/api")
public class reservaController {

	@Autowired
	reservaServiceImpl ReservaServiceImpl;
	
	@GetMapping("/reserva")
	public List<reserva> listarReserva(){
		return ReservaServiceImpl.listarReservas();
	}
	
	
	@PostMapping("/reserva")
	public reserva guardarReserva(@RequestBody reserva reserva) {
		
		return ReservaServiceImpl.guardarReserva(reserva);
	}
	
	
	@GetMapping("/Reserva/{id}")
	public reserva ReservaXID(@PathVariable(name="id") int id) {
		
		reserva Reserva_xid= new reserva();
		
		Reserva_xid=ReservaServiceImpl.ReservaXID(id);
		
		System.out.println("Reserva XID: "+Reserva_xid);
		
		return Reserva_xid;
	}
	
	@PutMapping("/reserva/{id}")
	public reserva actualizarReserva(@PathVariable(name="id")int id,@RequestBody reserva reserva) {
		
		reserva Reserva_seleccionado= new reserva();
		reserva Reserva_actualizado= new reserva();
		
		Reserva_seleccionado= ReservaServiceImpl.ReservaXID(id);
		
		
		Reserva_seleccionado.setInvestigadores(reserva.getInvestigadores());
		Reserva_seleccionado.setEquipos(reserva.getEquipos());
		Reserva_seleccionado.setComienzo(reserva.getComienzo());
		Reserva_seleccionado.setFin(reserva.getFin());
		
		Reserva_actualizado = ReservaServiceImpl.actualizarReserva(Reserva_seleccionado);
		
		System.out.println("El Reserva actualizado es: "+ Reserva_actualizado);
		
		return Reserva_actualizado;
	}
	
	@DeleteMapping("/Reserva/{id}")
	public void eleiminarReserva(@PathVariable(name="id")int id) {
		ReservaServiceImpl.eliminarReserva(id);
	}
	
}