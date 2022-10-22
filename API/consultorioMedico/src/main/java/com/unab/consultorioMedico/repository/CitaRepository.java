package com.unab.consultorioMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultorioMedico.entity.Cita;

@Repository

public interface CitaRepository extends JpaRepository<Cita,Integer> {

}
