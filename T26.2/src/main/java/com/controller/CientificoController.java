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

import com.dto.Cientifico;
import com.service.CientificoService;


@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoService cientifoService;
	
	@GetMapping("/cientificos")
	public List<Cientifico> listaEmpleados(){
		return cientifoService.listaCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientifico addNewCientifico(@RequestBody Cientifico empleado) {
		return cientifoService.addCientifico(empleado);
	};
	
	@GetMapping("/cientificos/{id}")
	public Cientifico getEmpById(@PathVariable(name="id") Long id) {
		return cientifoService.getCientificoById(id);
	}
	
	@DeleteMapping("/cientificos/{id}")
	public void deleteCientifico(@PathVariable(name="id")Long id) {
		cientifoService.deleteCientifico(id);
	}
}
