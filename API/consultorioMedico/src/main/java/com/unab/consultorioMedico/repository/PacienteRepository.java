package com.unab.consultorioMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultorioMedico.entity.Paciente;

@Repository

public interface PacienteRepository extends JpaRepository<Paciente,Integer > {
	
}
