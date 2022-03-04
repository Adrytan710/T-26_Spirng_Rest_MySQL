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

import mainApp.dto.equipos;
import mainApp.service.equiposServiceImpl;





@RestController
@RequestMapping("/api")
public class equiposController {

	@Autowired
	equiposServiceImpl EquiposServiceImpl;
	
	@GetMapping("/equipos")
	public List<equipos> listarEquipos(){
		return EquiposServiceImpl.listarEquipos();
	}
	
	
	@PostMapping("/equipos")
	public equipos guardarEquipos(@RequestBody equipos equipos) {
		
		return EquiposServiceImpl.guardarEquipos(equipos);
	}
	
	
	@GetMapping("/equipos/{id}")
	public equipos EquiposXID(@PathVariable(name="id") int id) {
		
		equipos equipos_xid= new equipos();
		
		equipos_xid=EquiposServiceImpl.EquiposXID(id);
		
		System.out.println("Equipos XID: "+equipos_xid);
		
		return equipos_xid;
	}
	
	@PutMapping("/equipos/{id}")
	public equipos actualizarEquipos(@PathVariable(name="id")int id,@RequestBody equipos equipos) {
		
		equipos Equipos_seleccionado= new equipos();
		equipos Equipos_actualizado= new equipos();
		
		Equipos_seleccionado= EquiposServiceImpl.EquiposXID(id);
		
		Equipos_seleccionado.setNumserie(equipos.getNumserie());
		Equipos_seleccionado.setNombre_facultad(equipos.getNombre_facultad());
		Equipos_seleccionado.setFacultad(equipos.getFacultad());
		
		Equipos_actualizado = EquiposServiceImpl.actualizarEquipos(Equipos_seleccionado);
		
		System.out.println("El Equipos actualizado es: "+ Equipos_actualizado);
		
		return Equipos_actualizado;
	}
	
	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipos(@PathVariable(name="id")int id) {
		EquiposServiceImpl.eliminarEquipos(id);
	}
	
}