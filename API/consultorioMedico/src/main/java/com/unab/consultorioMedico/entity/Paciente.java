package com.unab.consultorioMedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")

public class Paciente {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer Paci_ID;
	private String Paci_Nombre;
	private String Paci_Sexo;
	private String Paci_Direccion;
	private boolean Activo;
	
	public Paciente () {
		
	}

	public Integer getPaci_ID() {
		return Paci_ID;
	}

	public void setPaci_ID(Integer paci_ID) {
		Paci_ID = paci_ID;
	}

	public String getPaci_Nombre() {
		return Paci_Nombre;
	}

	public void setPaci_Nombre(String paci_Nombre) {
		Paci_Nombre = paci_Nombre;
	}

	public String getPaci_Sexo() {
		return Paci_Sexo;
	}

	public void setPaci_Sexo(String paci_Sexo) {
		Paci_Sexo = paci_Sexo;
	}

	public String getPaci_Direccion() {
		return Paci_Direccion;
	}

	public void setPaci_Direccion(String paci_Direccion) {
		Paci_Direccion = paci_Direccion;
	}

	public boolean isActivo() {
		return Activo;
	}

	public void setActivo(boolean activo) {
		Activo = activo;
	}
	
	
}
