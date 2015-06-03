/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.onlineshop.contoller.administrador.beans;

import edu.co.sena.onlineshop.model.entities.Catalogo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hernando
 */
@Stateless
public class CatalogoFacade extends AbstractFacade<Catalogo> {
    @PersistenceContext(unitName = "edu.co.sena_OnlineShop_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CatalogoFacade() {
        super(Catalogo.class);
    }
    
}
