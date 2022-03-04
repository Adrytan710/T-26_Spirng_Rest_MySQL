package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Proyecto;
import com.service.ProyectoService;


@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoService proyectoService;
	
	@GetMapping("/Proyectos")
	public List<Proyecto> listaProyectos(){
		return proyectoService.listaProyectos();
	}
	
	@PostMapping("/Proyectos")
	public Proyecto addNewProyecto(@RequestBody Proyecto Proyecto) {
		return proyectoService.addProyecto(Proyecto);
	};
	
	@GetMapping("/Proyectos/{id}")
	public Proyecto getEmpById(@PathVariable(name="id") Long id) {
		return proyectoService.getProyectoById(id);
	}
	
	@DeleteMapping("/Proyectos/{id}")
	public void deleteProyecto(@PathVariable(name="id")Long id) {
		proyectoService.deleteProyecto(id);
	}
}
