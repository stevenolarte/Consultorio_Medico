package com.unab.consultoriomedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Citas")
public class Cita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombrePaciente;
	private String fechaConsulta;
	private String horaConsulta;
	private String especialista;
	private String medicoAsignado;
	private String paciente;
	private String centroMedico;
	private boolean menorDeEdad;
	private boolean citaEfectiva;
	
	public Cita() {
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public String getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(String horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getEspecialista() {
		return especialista;
	}

	public void setEspecialista(String especialista) {
		this.especialista = especialista;
	}

	public String getMedicoAsignado() {
		return medicoAsignado;
	}

	public void setMedicoAsignado(String medicoAsignado) {
		this.medicoAsignado = medicoAsignado;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public String getCentroMedico() {
		return centroMedico;
	}

	public void setCentroMedico(String centroMedico) {
		this.centroMedico = centroMedico;
	}

	public boolean isMenorDeEdad() {
		return menorDeEdad;
	}

	public void setMenorDeEdad(boolean menorDeEdad) {
		this.menorDeEdad = menorDeEdad;
	}

	public boolean isCitaEfectiva() {
		return citaEfectiva;
	}

	public void setCitaEfectiva(boolean citaEfectiva) {
		this.citaEfectiva = citaEfectiva;
	}
	
}
