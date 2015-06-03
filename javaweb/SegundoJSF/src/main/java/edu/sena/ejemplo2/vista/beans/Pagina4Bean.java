/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.ejemplo2.vista.beans;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author hernando
 */
@Named(value = "pagina4Bean")
@Dependent
public class Pagina4Bean {
    
    private boolean verdadero = true;
    private boolean falso = false;
    private boolean activo= false;
    
    private int a= 1;
    private int b= 2;
    /**
     * Creates a new instance of Pagina4Bean
     */
    public Pagina4Bean() {
    }
    
    public String suma(){
    return "hola mundo";
    }
    public int suma(int a, int b){
    return a+b;
    }
    
    
    
    public boolean isVerdadero() {
        return verdadero;
    }

    public void setVerdadero(boolean verdadero) {
        this.verdadero = verdadero;
    }

    public boolean isFalso() {
        return falso;
    }

    public void setFalso(boolean falso) {
        this.falso = falso;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
    
    
}
