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

import com.unab.consultorioMedico.entity.Medicamento;
import com.unab.consultorioMedico.service.MedicamentoService;

@RestController 
@RequestMapping("/Opciones")
public class MedicamentoController {
	private MedicamentoService medicamentoService;
	
	@PostMapping("/SaveMedicamento")
	public ResponseEntity<Medicamento> save(@RequestBody Medicamento medicamento){
		return new ResponseEntity<>(medicamentoService.save(medicamento), HttpStatus.CREATED);
		}
	@GetMapping ("/allMedicamento")
	public ResponseEntity<List<Medicamento>> findAll(){
		return new ResponseEntity<>(medicamentoService.findAll(), HttpStatus.OK);
	}
	@GetMapping ("/{idMedicamento}")
	public ResponseEntity<Medicamento> findById(@PathVariable Integer id){
		return new ResponseEntity<>(medicamentoService.get(id), HttpStatus.OK);
	}
	@DeleteMapping ("/{idMedicamento}")
	public ResponseEntity delete(@PathVariable Integer id) {
		medicamentoService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
