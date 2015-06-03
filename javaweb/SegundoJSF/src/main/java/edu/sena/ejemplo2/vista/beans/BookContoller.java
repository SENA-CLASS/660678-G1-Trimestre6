/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.sena.ejemplo2.vista.beans;

import edu.sena.ejemplo2.modelo.pojos.Autor;
import edu.sena.ejemplo2.modelo.pojos.Book;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author hernando
 */
@Named(value = "bookContoller")
@Dependent
public class BookContoller {
    
    private Book libro;
    private int  arreglo[]={1,2,3,4,5,6,7,8,9,10};
    
    /**
     * Creates a new instance of BookContoller
     */
    public BookContoller() {
        libro= new Book();
        Autor autorT = new Autor();
        autorT.setNombre("hernando moreno");
        libro.setAutor(autorT);
        libro.setTituloLibro("la nuevas historia de java");
        
        
    }

    public Book getLibro() {
        return libro;
    }

    public void setLibro(Book libro) {
        this.libro = libro;
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }
    
    
}
