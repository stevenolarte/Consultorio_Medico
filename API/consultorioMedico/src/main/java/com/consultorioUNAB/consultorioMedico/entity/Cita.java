package com.consultorioUNAB.consultorioMedico.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cita")

public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Cita_ID;
    private BigDecimal Paciente_ID;
    private int Cita_Activa;
    private String Cita_Tipoconsulta;
    private String Cita_Hora;
    
    public Cita() {    
    }
    
    public Integer getCita_ID() {
        return Cita_ID;
    }
    public void setCita_ID(Integer cita_ID) {
        Cita_ID = cita_ID;
    }
    public BigDecimal getPaciente_ID() {
        return Paciente_ID;
    }
    public void setPaciente_ID(BigDecimal paciente_ID) {
        Paciente_ID = paciente_ID;
    }
    public int getCita_Activa() {
        return Cita_Activa;
    }
    public void setCita_Activa(int cita_Activa) {
        Cita_Activa = cita_Activa;
    }
    public String getCita_Tipoconsulta() {
        return Cita_Tipoconsulta;
    }
    public void setCita_Tipoconsulta(String cita_Tipoconsulta) {
        Cita_Tipoconsulta = cita_Tipoconsulta;
    }
    public String getCita_Hora() {
        return Cita_Hora;
    }
    public void setCita_Hora(String cita_Hora) {
        Cita_Hora = cita_Hora;
    }
    
    
    
    
}
