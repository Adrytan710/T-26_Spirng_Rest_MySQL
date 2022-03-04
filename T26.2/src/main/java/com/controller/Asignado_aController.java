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

import com.dto.Asignado_a;
import com.service.Asignado_aService;


@RestController
@RequestMapping("/api")
public class Asignado_aController {

	@Autowired
	Asignado_aService asignado_aService;
	
	@GetMapping("/Asignado_as")
	public List<Asignado_a> listaAsignado_as(){
		return asignado_aService.listaAsignado_a();
	}
	
	@PostMapping("/Asignado_as")
	public Asignado_a addNewAsignado_a(@RequestBody Asignado_a Asignado_a) {
		return asignado_aService.addAsignado_a(Asignado_a);
	};
	
	@GetMapping("/Asignado_as/{id}")
	public Asignado_a getEmpById(@PathVariable(name="id") Long id) {
		return asignado_aService.getAsignado_aById(id);
	}
	
	@DeleteMapping("/Asignado_as/{id}")
	public void deleteAsignado_a(@PathVariable(name="id")Long id) {
		asignado_aService.deleteAsignado_a(id);
	}
}
