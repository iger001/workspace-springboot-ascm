package com.datacubit.springboot.escuela.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.datacubit.springboot.escuela.model.Escuela;
import com.datacubit.springboot.escuela.model.Estudiante;
import com.datacubit.springboot.escuela.model.service.IEscuelaService;



@RestController
public class EscuelaController {
	
	@Autowired
	@Qualifier("serviceFeign")
	private IEscuelaService escuelaService;
	
	@GetMapping("/echoEscuela")
	public Escuela echoEscuela() {
		return new Escuela();
	}
	
	@GetMapping("/listarEstudiantes")
	public List<Estudiante> listarEstudiantes(){
		return escuelaService.findAll();
	}
	
	@GetMapping("/detalleEstudiante/{id}")
	public Estudiante detatalle(@PathVariable int id) {
		return escuelaService.findById(id);
	}

}