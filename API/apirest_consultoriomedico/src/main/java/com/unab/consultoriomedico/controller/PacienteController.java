package com.unab.consultoriomedico.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.unab.consultoriomedico.entity.Paciente;
import com.unab.consultoriomedico.service.PacienteService;

@RestController
@RequestMapping("/apirestPaciente")
public class PacienteController {
	@Autowired
	private PacienteService pacienteService;
	
	@PostMapping("/savePaciente")
	public ResponseEntity<Paciente> save(@RequestBody Paciente paciente){
		return new ResponseEntity<>(pacienteService.save(paciente), HttpStatus.CREATED);
	}
	@GetMapping("/allPaciente")
	public ResponseEntity<List<Paciente>>findAll(){
		return new ResponseEntity<>(pacienteService.findall(), HttpStatus.OK);
	}
	@GetMapping("/{id}")
	public ResponseEntity<Paciente>findById(@PathVariable Integer id){
		return new ResponseEntity<>(pacienteService.get(id), HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public ResponseEntity delete(@PathVariable Integer id) {
		pacienteService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}
	
}
