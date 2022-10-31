package com.unab.consultoriomedico.service;

import com.unab.consultoriomedico.entity.Cita;
import com.unab.consultoriomedico.repository.CitaRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CitaService {
	@Autowired
	private CitaRepository citaRepository;
	
	public List<Cita>findAll(){
		return citaRepository.findAll();
		}
	public Cita save(Cita cita) {
		return citaRepository.save(cita);
	}
	public Cita get(Integer id) {
		return citaRepository.getById(id);
	}
	public void delete(Integer id) {
		citaRepository.deleteById(id);
	}
	
	
}
