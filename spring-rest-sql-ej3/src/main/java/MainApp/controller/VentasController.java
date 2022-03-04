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

import MainApp.dto.Ventas;
import MainApp.service.VentasServiceImpl;


@RestController
@RequestMapping("/api")
public class VentasController {
	
	@Autowired
	VentasServiceImpl VentasServiceImpl;
	
	@GetMapping("/Ventas")
	public List<Ventas> listarCVentass(){
		return VentasServiceImpl.listarVentas();
	}
	
	
	@PostMapping("/Ventas")
	public Ventas salvarVentas(@RequestBody Ventas Ventas) {
		
		return VentasServiceImpl.guardarVentas(Ventas);
	}
	
	
	@GetMapping("/Ventas/{id}")
	public Ventas VentasXID(@PathVariable(name="id") int id) {
		
		Ventas Ventas_xid= new Ventas();
		
		Ventas_xid=VentasServiceImpl.VentasXID(id);
		
		System.out.println("Ventas XID: "+Ventas_xid);
		
		return Ventas_xid;
	}
	
	@PutMapping("/Ventas/{id}")
	public Ventas actualizarVentas(@PathVariable(name="id")int id,@RequestBody Ventas Ventas) {
		
		Ventas Ventas_seleccionado= new Ventas();
		Ventas Ventas_actualizado= new Ventas();
		
		Ventas_seleccionado= VentasServiceImpl.VentasXID(id);
		
		Ventas_seleccionado.setIdcajero(Ventas.getIdcajero());
		Ventas_seleccionado.setIdproducto(Ventas.getIdproducto());
		Ventas_seleccionado.setIdmaquina(Ventas.getIdmaquina());
		
		Ventas_actualizado = VentasServiceImpl.actualizarVentas(Ventas_seleccionado);
		
		System.out.println("El Ventas actualizado es: "+ Ventas_actualizado);
		
		return Ventas_actualizado;
	}
	
	@DeleteMapping("/Ventas/{id}")
	public void eleiminarVentas(@PathVariable(name="id")int id) {
		VentasServiceImpl.eliminarVentas(id);
	}
	
	
}
