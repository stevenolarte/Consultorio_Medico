package com.unab.consultorioMedico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unab.consultorioMedico.entity.Medicamento;
import com.unab.consultorioMedico.repository.MedicamentoRepository;

@Service
public class MedicamentoService {
	@Autowired
	private MedicamentoRepository medicamentoRepository;
	
	public List<Medicamento> findAll(){
		return medicamentoRepository.findAll();
	}
	public Medicamento save(Medicamento medicamento) {
		return medicamentoRepository.save(medicamento);
	}
	public Medicamento get(Integer Id){
		return medicamentoRepository.getById(Id);
	}
	public void delete (Integer Id) {
		medicamentoRepository.deleteById(Id);
	}
	
}
