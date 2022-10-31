package com.unab.consultoriomedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultoriomedico.entity.Paciente;
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	
}
