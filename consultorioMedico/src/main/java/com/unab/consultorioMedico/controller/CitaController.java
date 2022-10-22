package com.unab.consultorioMedico.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unab.consultorioMedico.entity.Cita;
import com.unab.consultorioMedico.service.CitaService;

@RestController 
@RequestMapping("/Opciones")
public class CitaController {
private CitaService citaService;
	
	@PostMapping("/SaveCita")
	public ResponseEntity<Cita> save(@RequestBody Cita cita){
		return new ResponseEntity<>(citaService.save(cita), HttpStatus.CREATED);
		}
	
	@GetMapping ("/allCita")
	public ResponseEntity<List<Cita>> findAll(){
		return new ResponseEntity<>(citaService.findAll(), HttpStatus.OK);
	}
	@GetMapping ("/{idCita}")
	public ResponseEntity<Cita> findById(@PathVariable Integer id){
		return new ResponseEntity<>(citaService.get(id), HttpStatus.OK);
	}
	@DeleteMapping ("/{idCita}")
	public ResponseEntity delete(@PathVariable Integer id) {
		citaService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
