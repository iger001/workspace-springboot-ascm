package com.datacubit.springboot.estudiante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.datacubit.springboot.estudiante.model.entity.Estudiante;
import com.datacubit.springboot.estudiante.model.service.IEstudianteService;

@RestController
public class EstudianteController {
	
	@Autowired
	private IEstudianteService estudianteService;
	
	@Autowired
	private Environment env;
	
	@GetMapping("/getEstudiantes")
	public List<Estudiante> getEstudiantes(){
		List<Estudiante> estudiantes = estudianteService.findAll();
		for(Estudiante e:estudiantes) e.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return estudianteService.findAll();
	}
	
	@GetMapping("/getEstudiante/{id}")
	public Estudiante getEstudiante(@PathVariable int id) {
		Estudiante estudiante = estudianteService.findById(id);
		estudiante.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return estudiante;
	}
}
