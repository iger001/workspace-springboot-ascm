package com.datacubik.springboot.estudiante.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.datacubik.springboot.estudiante.model.entity.Estudiante;

public interface EstudianteDAO extends CrudRepository<Estudiante, Integer>{
}
