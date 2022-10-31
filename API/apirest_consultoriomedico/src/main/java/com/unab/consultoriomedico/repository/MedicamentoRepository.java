package com.unab.consultoriomedico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unab.consultoriomedico.entity.Medicamento;
@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer> {

}
