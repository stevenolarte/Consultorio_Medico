package com.unab.consultorioMedico.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.consultorioMedico.entity.Paciente;
import com.unab.consultorioMedico.repository.PacienteRepository;

@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> findAll(){
		return pacienteRepository.findAll();
	}
	
	public Paciente save(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	
	public Paciente get(Integer Id) {
		return pacienteRepository.getById(Id);
	}
	public void delete(Integer id) {
		pacienteRepository.deleteById(id);
	}
}
