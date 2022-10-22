package com.unab.consultorioMedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cita")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Cita_ID;
	private int Paciente_ID;
	private boolean Cita_Activa;
	private String Cita_Tipoconsulta;
	private String Cita_Hora;
	private String Medico_Asignado;
	private boolean Cita_Cumplida;
	
	public Cita() {
		
	}

	public int getCita_ID() {
		return Cita_ID;
	}

	public void setCita_ID(int cita_ID) {
		Cita_ID = cita_ID;
	}

	public int getPaciente_ID() {
		return Paciente_ID;
	}

	public void setPaciente_ID(int paciente_ID) {
		Paciente_ID = paciente_ID;
	}

	public boolean isCita_Activa() {
		return Cita_Activa;
	}

	public void setCita_Activa(boolean cita_Activa) {
		Cita_Activa = cita_Activa;
	}

	public String getCita_TipoConsulta() {
		return Cita_Tipoconsulta;
	}

	public void setCita_TipoConsulta(String cita_TipoConsulta) {
		Cita_Tipoconsulta = cita_TipoConsulta;
	}

	public String getCita_Hora() {
		return Cita_Hora;
	}

	public void setCita_Hora(String cita_Hora) {
		Cita_Hora = cita_Hora;
	}

	public String getMedico_Asignado() {
		return Medico_Asignado;
	}

	public void setMedico_Asignado(String medico_Asignado) {
		Medico_Asignado = medico_Asignado;
	}

	public boolean isCita_Cumplida() {
		return Cita_Cumplida;
	}

	public void setCita_Cumplida(boolean cita_Cumplida) {
		Cita_Cumplida = cita_Cumplida;
	}
	
	
	
	
	
}
