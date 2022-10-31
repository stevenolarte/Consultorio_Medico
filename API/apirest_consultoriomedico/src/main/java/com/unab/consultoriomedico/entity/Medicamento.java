package com.unab.consultoriomedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicamentos")
public class Medicamento {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String documento;
	private String nombrePaciente;
	private String nombreMedicamento;
	private String formula;
	private String cantidadRecetada;
	private boolean disponible;
	
	public Medicamento() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getNombreMedicamento() {
		return nombreMedicamento;
	}

	public void setNombreMedicamento(String nombreMedicamento) {
		this.nombreMedicamento = nombreMedicamento;
	}

	public String getFormula() {
		return formula;
	}

	public void setFormula(String formula) {
		this.formula = formula;
	}

	public String getCantidadRecetada() {
		return cantidadRecetada;
	}

	public void setCantidadRecetada(String cantidadRecetada) {
		this.cantidadRecetada = cantidadRecetada;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}
	
	
}
