package com.datacubit.springboot.escuela.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.datacubit.springboot.escuela.model.Estudiante;

@FeignClient(name = "servicio-estudiantes")
public interface EstudianteClientRest {
	
	@GetMapping("/getEstudiantes")
	public List<Estudiante> getEstudiantes();
	
	@GetMapping("/getEstudiante/{id}")
	public Estudiante getEstudiante(@PathVariable int id);

}
