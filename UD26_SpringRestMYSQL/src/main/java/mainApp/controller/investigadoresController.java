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

import mainApp.dto.investigadores;
import mainApp.service.investigadoresServiceImpl;



@RestController
@RequestMapping("/api")
public class investigadoresController {

	@Autowired
	investigadoresServiceImpl InvestigadoresServiceImpl;
	
	@GetMapping("/investigadores")
	public List<investigadores> listarInvestigadores(){
		return InvestigadoresServiceImpl.listarInvestigadores();
	}
	
	
	@PostMapping("/investigadores")
	public investigadores guardarInvestigadores(@RequestBody investigadores investigadores) {
		
		return InvestigadoresServiceImpl.guardarInvestigadores(investigadores);
	}
	
	
	@GetMapping("/Investigadores/{id}")
	public investigadores InvestigadoresXID(@PathVariable(name="id") int id) {
		
		investigadores Investigadores_xid= new investigadores();
		
		Investigadores_xid=InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		System.out.println("Investigadores XID: "+Investigadores_xid);
		
		return Investigadores_xid;
	}
	
	@PutMapping("/investigadores/{id}")
	public investigadores actualizarInvestigadores(@PathVariable(name="id")int id,@RequestBody investigadores investigadores) {
		
		investigadores Investigadores_seleccionado= new investigadores();
		investigadores Investigadores_actualizado= new investigadores();
		
		Investigadores_seleccionado= InvestigadoresServiceImpl.InvestigadoresXID(id);
		
		Investigadores_seleccionado.setFacultad(investigadores.getFacultad());
		Investigadores_seleccionado.setNomapels(investigadores.getNomapels());
		
		Investigadores_actualizado = InvestigadoresServiceImpl.actualizarInvestigadores(Investigadores_seleccionado);
		
		System.out.println("El Investigadores actualizado es: "+ Investigadores_actualizado);
		
		return Investigadores_actualizado;
	}
	
	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigadores(@PathVariable(name="id")int id) {
		InvestigadoresServiceImpl.eliminarInvestigadores(id);
	}
	
}