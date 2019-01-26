package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;

@Repository
public class AlumnorepositoryImpl implements AlumnoRepository {

	private static List<Alumno> lstAlumnos = new ArrayList<Alumno>();
	
	static {
		Alumno alumno = new Alumno(1, "Eduardo", "Cruz", 29, "MAC");
		lstAlumnos.add(alumno);
	}
	
	@Override
	public Alumno add(Alumno alumno) {
		alumno.setEdad(lstAlumnos.size()+1);
		lstAlumnos.add(alumno);
		return alumno;
	}

	@Override
	public List<Alumno> findAll() {
		return lstAlumnos;
	}
	

}
