package com.consultorioUNAB.consultorioMedico.entity;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cita")
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Medi_ID;
    private BigDecimal Paciente_ID;
    private String Medi_Descripcion;
    private int Medi_Cantidadrecetada;
    private String Medi_Ubicacion;
    
    public Medicamento() {
    }
    
    public Integer getMedi_ID() {
        return Medi_ID;
    }
    public void setMedi_ID(Integer medi_ID) {
        Medi_ID = medi_ID;
    }
    public BigDecimal getPaciente_ID() {
        return Paciente_ID;
    }
    public void setPaciente_ID(BigDecimal paciente_ID) {
        Paciente_ID = paciente_ID;
    }
    public String getMedi_Descripcion() {
        return Medi_Descripcion;
    }
    public void setMedi_Descripcion(String medi_Descripcion) {
        Medi_Descripcion = medi_Descripcion;
    }
    public int getMedi_Cantidadrecetada() {
        return Medi_Cantidadrecetada;
    }
    public void setMedi_Cantidadrecetada(int medi_Cantidadrecetada) {
        Medi_Cantidadrecetada = medi_Cantidadrecetada;
    }
    public String getMedi_Ubicacion() {
        return Medi_Ubicacion;
    }
    public void setMedi_Ubicacion(String medi_Ubicacion) {
        Medi_Ubicacion = medi_Ubicacion;
    }
    
    
    
}
