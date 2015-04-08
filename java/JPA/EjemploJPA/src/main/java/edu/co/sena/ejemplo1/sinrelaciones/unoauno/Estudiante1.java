/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.sinrelaciones.unoauno;

import edu.co.sena.ejemplo1.relaciones.unoauno.*;
import edu.co.sena.ejemplo1.anotaciones.*;
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
@Table(name = "ESTUDIANTE1", indexes = {@Index(name = "pruebaIndice",columnList = "NOMBREESTUDIANTE,IDESTUDIANTE")})
public class Estudiante1 implements Serializable {
    
    @Id
    @Column (name = "IDESTUDIANTE",length = 45,nullable = false)
    private String idEstudiante;
    
    @Column (name = "NOMBREESTUDIANTE", nullable = false, length = 200)
    private String nombre;
    
    @Column (name = "TELEFONO", nullable = false, length = 40)
    private String telefono;
    
    @Column (name = "CORREO", nullable = false, length = 200)
    private String correo;
    
    @Column (name = "DIRECCION", nullable = false, length = 100)
    private String direccion;
    
    @Column (name = "IDMATERA", nullable = false, length = 100)
    private String idMateria;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
    
    
    
    
}
