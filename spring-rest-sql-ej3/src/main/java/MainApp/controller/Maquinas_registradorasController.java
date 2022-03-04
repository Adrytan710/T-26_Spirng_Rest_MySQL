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

import MainApp.dto.Maquinas_registradoras;
import MainApp.service.Maquinas_registradorasServiceImpl;


@RestController
@RequestMapping("/api")
public class Maquinas_registradorasController {
	
	@Autowired
	Maquinas_registradorasServiceImpl Maquinas_registradorasServiceImpl;
	
	@GetMapping("/Maquinas_registradoras")
	public List<Maquinas_registradoras> listarCMaquinas_registradorass(){
		return Maquinas_registradorasServiceImpl.listarMaquinas_registradoras();
	}
	
	
	@PostMapping("/Maquinas_registradoras")
	public Maquinas_registradoras salvarMaquinas_registradoras(@RequestBody Maquinas_registradoras Maquinas_registradoras) {
		
		return Maquinas_registradorasServiceImpl.guardarMaquinas_registradoras(Maquinas_registradoras);
	}
	
	
	@GetMapping("/Maquinas_registradoras/{id}")
	public Maquinas_registradoras Maquinas_registradorasXID(@PathVariable(name="id") int id) {
		
		Maquinas_registradoras Maquinas_registradoras_xid= new Maquinas_registradoras();
		
		Maquinas_registradoras_xid=Maquinas_registradorasServiceImpl.Maquinas_registradorasXID(id);
		
		System.out.println("Maquinas_registradoras XID: "+Maquinas_registradoras_xid);
		
		return Maquinas_registradoras_xid;
	}
	
	@PutMapping("/Maquinas_registradoras/{id}")
	public Maquinas_registradoras actualizarMaquinas_registradoras(@PathVariable(name="id")int id,@RequestBody Maquinas_registradoras Maquinas_registradoras) {
		
		Maquinas_registradoras Maquinas_registradoras_seleccionado= new Maquinas_registradoras();
		Maquinas_registradoras Maquinas_registradoras_actualizado= new Maquinas_registradoras();
		
		Maquinas_registradoras_seleccionado= Maquinas_registradorasServiceImpl.Maquinas_registradorasXID(id);
		
		Maquinas_registradoras_seleccionado.setPiso(Maquinas_registradoras.getPiso());

		
		Maquinas_registradoras_actualizado = Maquinas_registradorasServiceImpl.actualizarMaquinas_registradoras(Maquinas_registradoras_seleccionado);
		
		System.out.println("El Maquinas_registradoras actualizado es: "+ Maquinas_registradoras_actualizado);
		
		return Maquinas_registradoras_actualizado;
	}
	
	@DeleteMapping("/Maquinas_registradoras/{id}")
	public void eleiminarMaquinas_registradoras(@PathVariable(name="id")int id) {
		Maquinas_registradorasServiceImpl.eliminarMaquinas_registradoras(id);
	}
	
	
}
