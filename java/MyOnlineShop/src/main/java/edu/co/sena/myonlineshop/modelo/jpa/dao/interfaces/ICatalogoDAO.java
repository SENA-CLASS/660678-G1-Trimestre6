/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces;

import edu.co.sena.myonlineshop.modelo.jpa.entities.Catalogo;
import java.util.List;

/**
 *
 * @author hernando
 */
public interface ICatalogoDAO {
    public void insert(Catalogo entity);
    public void update(Catalogo entity);
    public void delete(Catalogo entity);
    
    public Catalogo findByIdCatalogo(Integer idCatalogo);
    
    public List<Catalogo> findAll();
    
}
