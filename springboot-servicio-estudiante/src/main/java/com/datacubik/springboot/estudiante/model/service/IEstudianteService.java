package com.datacubik.springboot.estudiante.model.service;

import java.util.List;

import com.datacubik.springboot.estudiante.model.entity.Estudiante;

public interface IEstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Integer id);
}
