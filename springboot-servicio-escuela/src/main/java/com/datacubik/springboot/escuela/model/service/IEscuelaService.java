package com.datacubik.springboot.escuela.model.service;

import java.util.List;

import com.datacubik.springboot.escuela.model.Estudiante;

public interface IEscuelaService {
	public List<Estudiante> findAll();
	public Estudiante findById(Integer id);
}
