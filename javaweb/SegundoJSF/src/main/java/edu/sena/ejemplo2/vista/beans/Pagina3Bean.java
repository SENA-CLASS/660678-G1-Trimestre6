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
@Named(value = "pagina3Bean")
@Dependent
public class Pagina3Bean {
    
    private boolean botton1 = false;
    
    /**
     * Creates a new instance of pagina3Bean
     */
    public Pagina3Bean() {
    }

    public boolean isBotton1() {
        return botton1;
    }

    public void setBotton1(boolean botton1) {
        this.botton1 = botton1;
    }
    
}
