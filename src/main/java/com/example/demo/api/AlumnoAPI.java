package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alumno;
import com.example.demo.repository.AlumnoRepository;

@RestController
@RequestMapping("/api/v1/alumno")
public class AlumnoAPI {

	@Autowired
	private AlumnoRepository alumnoRepository;
	
	@GetMapping
	public List<Alumno> getAll(){
		return alumnoRepository.findAll();
	}
	@PostMapping
	public Alumno add(@RequestBody Alumno alumno) {
		alumnoRepository.add(alumno);
		return alumno;
	}
}
