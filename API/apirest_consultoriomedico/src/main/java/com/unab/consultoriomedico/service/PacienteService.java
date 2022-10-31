package com.unab.consultoriomedico.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.consultoriomedico.entity.Paciente;
import com.unab.consultoriomedico.repository.PacienteRepository;
@Service
public class PacienteService {
	@Autowired
	private PacienteRepository pacienteRepository;
	
	public List<Paciente> findall(){
		return pacienteRepository.findAll();
		}
	
	public Paciente save(Paciente paciente) {
		return pacienteRepository.save(paciente);
	}
	public Paciente get(Integer id) {
		return pacienteRepository.getById(id);
	}
	public void delete(Integer id) {
		pacienteRepository.deleteById(id);
	}
}
