package com.unab.consultorioMedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultorioMedico.entity.Medicamento;

@Repository

public interface MedicamentoRepository extends JpaRepository<Medicamento,Integer> {

}
