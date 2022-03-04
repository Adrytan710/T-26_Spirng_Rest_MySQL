package MainApp.controller;
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

import MainApp.dto.Cajeros;
import MainApp.service.CajerosServiceImpl;


@RestController
@RequestMapping("/api")
public class CajerosController {
	
	@Autowired
	CajerosServiceImpl CajerosServiceImpl;
	
	@GetMapping("/Cajeros")
	public List<Cajeros> listarCCajeross(){
		return CajerosServiceImpl.listarCajeros();
	}
	
	
	@PostMapping("/Cajeros")
	public Cajeros salvarCajeros(@RequestBody Cajeros Cajeros) {
		
		return CajerosServiceImpl.guardarCajeros(Cajeros);
	}
	
	
	@GetMapping("/Cajeros/{id}")
	public Cajeros CajerosXID(@PathVariable(name="id") int id) {
		
		Cajeros Cajeros_xid= new Cajeros();
		
		Cajeros_xid=CajerosServiceImpl.CajerosXID(id);
		
		System.out.println("Cajeros XID: "+Cajeros_xid);
		
		return Cajeros_xid;
	}
	
	@PutMapping("/Cajeros/{id}")
	public Cajeros actualizarCajeros(@PathVariable(name="id")int id,@RequestBody Cajeros Cajeros) {
		
		Cajeros Cajeros_seleccionado= new Cajeros();
		Cajeros Cajeros_actualizado= new Cajeros();
		
		Cajeros_seleccionado= CajerosServiceImpl.CajerosXID(id);
		
		Cajeros_seleccionado.setNomapels(Cajeros.getNomapels());

		
		Cajeros_actualizado = CajerosServiceImpl.actualizarCajeros(Cajeros_seleccionado);
		
		System.out.println("El Cajeros actualizado es: "+ Cajeros_actualizado);
		
		return Cajeros_actualizado;
	}
	
	@DeleteMapping("/Cajeros/{id}")
	public void eleiminarCajeros(@PathVariable(name="id")int id) {
		CajerosServiceImpl.eliminarCajeros(id);
	}
	
	
}
