/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.relaciones.unoauno;

import edu.co.sena.ejemplo1.anotaciones.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author hernando
 */
@Entity
@Table(name = "MATERIA2")
public class Materia2 implements Serializable {
    @Id
    @Column (name = "IDMATERIA",length = 45,nullable = false)
    private String idMateria;
    @Column (name = "NOMBRE",length = 45,nullable = false)
    private String nombre;
    @Column (name = "DESCRIPCION",length = 45,nullable = false)
    private String descripcion;

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
