package com.datacubit.springboot.estudiante.model.service;

import java.util.List;

import com.datacubit.springboot.estudiante.model.entity.Estudiante;

public interface IEstudianteService {
	
	public List<Estudiante> findAll();
	public Estudiante findById(Integer id);
}
