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

import mainApp.dto.facultad;
import mainApp.service.facultadServiceImpl;



@RestController
@RequestMapping("/api")
public class facultadController {

	@Autowired
	facultadServiceImpl FacultadServiceImpl;
	
	@GetMapping("/facultad")
	public List<facultad> listarFacultad(){
		return FacultadServiceImpl.listarFacultad();
	}
	
	
	@PostMapping("/Facultad")
	public facultad guardarFacultad(@RequestBody facultad facultad) {
		
		return FacultadServiceImpl.guardarFacultad(facultad);
	}
	
	
	@GetMapping("/facultad/{id}")
	public facultad FacultadXID(@PathVariable(name="id") int id) {
		
		facultad facultad_xid= new facultad();
		
		facultad_xid=FacultadServiceImpl.FacultadXID(id);
		
		System.out.println("Facultad XID: "+facultad_xid);
		
		return facultad_xid;
	}
	
	@PutMapping("/facultad/{id}")
	public facultad actualizarFacultad(@PathVariable(name="id")int id,@RequestBody facultad facultad) {
		
		facultad Facultad_seleccionado= new facultad();
		facultad Facultad_actualizado= new facultad();
		
		Facultad_seleccionado= FacultadServiceImpl.FacultadXID(id);
		
		
		Facultad_seleccionado.setNombre(facultad.getNombre());

		Facultad_actualizado = FacultadServiceImpl.actualizarFacultad(Facultad_seleccionado);
		
		System.out.println("El Facultad actualizado es: "+ Facultad_actualizado);
		
		return Facultad_actualizado;
	}
	
	@DeleteMapping("/facultad/{id}")
	public void eleiminarFacultad(@PathVariable(name="id")int id) {
		FacultadServiceImpl.eliminarFacultad(id);
	}
	
}
