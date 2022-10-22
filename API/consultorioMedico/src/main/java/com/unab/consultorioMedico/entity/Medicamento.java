package com.unab.consultorioMedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Medicamento")
public class Medicamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Medi_ID;
	private int PacienteID;
	private String Medi_Descripcion;
	private int Medi_CantidadRecetada;
	private String Medi_Ubicacion;
	private boolean Disponible;
	
	public Medicamento () {
		
	}

	public int getMedi_ID() {
		return Medi_ID;
	}

	public void setMedi_ID(int medi_ID) {
		Medi_ID = medi_ID;
	}

	public int getPacienteID() {
		return PacienteID;
	}

	public void setPacienteID(int pacienteID) {
		PacienteID = pacienteID;
	}

	public String getMedi_Descripcion() {
		return Medi_Descripcion;
	}

	public void setMedi_Descripcion(String medi_Descripcion) {
		Medi_Descripcion = medi_Descripcion;
	}

	public int getMedi_CantidadRecetada() {
		return Medi_CantidadRecetada;
	}

	public void setMedi_CantidadRecetada(int medi_CantidadRecetada) {
		Medi_CantidadRecetada = medi_CantidadRecetada;
	}

	public String getMedi_Ubicacion() {
		return Medi_Ubicacion;
	}

	public void setMedi_Ubicacion(String medi_Ubicacion) {
		Medi_Ubicacion = medi_Ubicacion;
	}

	public boolean isDisponible() {
		return Disponible;
	}

	public void setDisponible(boolean disponible) {
		Disponible = disponible;
	}
	
	

}
