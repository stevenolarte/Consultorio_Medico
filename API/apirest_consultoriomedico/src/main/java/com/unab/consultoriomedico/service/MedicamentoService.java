package com.unab.consultoriomedico.service;

import com.unab.consultoriomedico.entity.Medicamento;
import com.unab.consultoriomedico.repository.MedicamentoRepository;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service 
public class MedicamentoService {
	@Autowired
  private MedicamentoRepository medicamentoRepository;
  
  public List<Medicamento>findAll(){
	 return medicamentoRepository.findAll(); 
  }
  public Medicamento save(Medicamento medicamento) {
	  return medicamentoRepository.save(medicamento);
  }
  public Medicamento get(Integer id) {
	  return medicamentoRepository.getById(id);
  }
  public void delete(Integer id) {
	  medicamentoRepository.deleteById(id);
  }
}
