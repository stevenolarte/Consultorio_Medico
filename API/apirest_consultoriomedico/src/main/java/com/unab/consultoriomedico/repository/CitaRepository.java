package com.unab.consultoriomedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultoriomedico.entity.Cita;
@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer>{

}
