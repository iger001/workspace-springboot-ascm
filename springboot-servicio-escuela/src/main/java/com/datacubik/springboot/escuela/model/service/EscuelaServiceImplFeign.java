package com.datacubik.springboot.escuela.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datacubik.springboot.escuela.client.EstudianteClientRest;
import com.datacubik.springboot.escuela.model.Estudiante;

@Service("serviceFeign")
public class EscuelaServiceImplFeign implements IEscuelaService {
	
	@Autowired
	private EstudianteClientRest clienteFeign;

	@Override
	public List<Estudiante> findAll() {
		return clienteFeign.getEstudiantes();
	}

	@Override
	public Estudiante findById(Integer id) {
		return clienteFeign.getEstudiante(id);
	}

}
