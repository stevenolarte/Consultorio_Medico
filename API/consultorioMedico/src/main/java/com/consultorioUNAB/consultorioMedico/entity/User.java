package com.consultorioUNAB.consultorioMedico.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paci_ID;
    private String paci_Nombre;
    private String paci_Direccion;
    private String paci_Sexo;
    private boolean activo;
    
    public User() {
        
    }

    public Integer getPaci_ID() {
        return paci_ID;
    }

    public void setPaci_ID(Integer paci_ID) {
        this.paci_ID = paci_ID;
    }

    public String getPaci_Nombre() {
        return paci_Nombre;
    }

    public void setPaci_Nombre(String paci_Nombre) {
        this.paci_Nombre = paci_Nombre;
    }

    public String getPaci_Direccion() {
        return paci_Direccion;
    }

    public void setPaci_Direccion(String paci_Direccion) {
        this.paci_Direccion = paci_Direccion;
    }

    public String getPaci_Sexo() {
        return paci_Sexo;
    }

    public void setPaci_Sexo(String paci_Sexo) {
        this.paci_Sexo = paci_Sexo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
}
