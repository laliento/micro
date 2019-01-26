package com.example.demo.repository;

import java.util.List;

import com.example.demo.model.Alumno;

public interface AlumnoRepository {
	
	public Alumno add(Alumno alumno);
	
	public List<Alumno> findAll();
	
	
}
