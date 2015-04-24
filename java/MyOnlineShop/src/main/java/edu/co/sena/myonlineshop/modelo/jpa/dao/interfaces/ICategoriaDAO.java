/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces;

import edu.co.sena.myonlineshop.modelo.jpa.entities.Categoria;
import java.util.List;

/**
 *
 * @author hernando
 */
public interface ICategoriaDAO {
    
    public static final String IDCATEGORIA = "idCategoria";
    public static final String NOMBRE = "nombre";
    public static final String ACTIVA = "activa";
    
    public void insert(Categoria entity);
    public void update(Categoria entity);
    public void delete(Categoria entity);
    
    public Categoria findByIdCategoria(Integer idCategoria);
    
    public List<Categoria> findAll();
    public List<Categoria> findByNombre(String nombre);
    public List<Categoria> findByActiva(Boolean activa);
    
    
}
