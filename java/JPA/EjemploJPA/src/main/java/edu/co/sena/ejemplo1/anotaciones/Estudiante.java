/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.anotaciones;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.Table;

/**
 *
 * @author hernando
 */

@Entity
@Table(name = "ESTUDIANTE", indexes = {@Index(name = "pruebaIndice",columnList = "NOMBREESTUDIANTE,IDESTUDIANTE")})
public class Estudiante implements Serializable {
    
    @Id
    @Column (name = "IDESTUDIANTE")
    private String idEstudiante;
    
    @Column (name = "NOMBREESTUDIANTE", nullable = false)
    private String nombre;

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
