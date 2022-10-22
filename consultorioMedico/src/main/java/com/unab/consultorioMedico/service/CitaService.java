package com.unab.consultorioMedico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.consultorioMedico.entity.Cita;
import com.unab.consultorioMedico.repository.CitaRepository;

@Service
public class CitaService {
	@Autowired
	private CitaRepository citaRepository;
	
	public List<Cita> findAll(){
		return citaRepository.findAll();
	}
	public Cita save(Cita cita) {
		return citaRepository.save(cita);
	}
	public Cita get(Integer Id) {
		return citaRepository.getById(Id);
	}
	public void delete (Integer Id) {
		citaRepository.deleteById(Id);
	}
	
}
