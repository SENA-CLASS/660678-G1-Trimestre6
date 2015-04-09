/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.ejemplo1.relaciones.unoamuchos;

import edu.co.sena.ejemplo1.relaciones.unoauno.*;
import edu.co.sena.ejemplo1.sinrelaciones.unoauno.*;
import edu.co.sena.ejemplo1.relaciones.unoauno.*;
import edu.co.sena.ejemplo1.anotaciones.*;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author hernando
 */

@Entity
@Table(name = "ESTUDIANTE3")
public class Estudiante3 implements Serializable {
    
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
  
    @JoinColumn(name = "MATERIA", referencedColumnName = "IDMATERIA" )
    @OneToOne
    private Materia3 materia;

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

    public Materia3 getMateria() {
        return materia;
    }

    public void setMateria(Materia3 materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Estudiante2{" + "idEstudiante=" + idEstudiante + ", nombre=" + nombre + ", telefono=" + telefono + ", correo=" + correo + ", direccion=" + direccion + ", materia=" + materia.getIdMateria() + '}';
    }

 
  
}
