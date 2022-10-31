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

import com.unab.consultoriomedico.entity.Cita;
import com.unab.consultoriomedico.entity.Medicamento;
import com.unab.consultoriomedico.service.CitaService;
import com.unab.consultoriomedico.service.MedicamentoService;

@RestController
@RequestMapping("/apirestCita")
public class CitaController {
		@Autowired
		private CitaService citaService;
		
		@PostMapping("/saveCita")
		public ResponseEntity<Cita> save(@RequestBody Cita medicamento){
			return new ResponseEntity<>(citaService.save(medicamento), HttpStatus.CREATED);
		}
		
		@GetMapping("/allCita")
		public ResponseEntity<List<Cita>>findAll(){
			return new ResponseEntity<>(citaService.findAll(), HttpStatus.OK);
		}
		
		@GetMapping("/{id}")
		public ResponseEntity<Cita>findById(@PathVariable Integer id){
			return new ResponseEntity<>(citaService.get(id), HttpStatus.OK);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity delete(@PathVariable Integer id) {
			citaService.delete(id);
			return new ResponseEntity(HttpStatus.OK);
		}
}
