/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.sessionBeans;

import com.mycompany.mavenproject3.InventarioCompras;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Enrique
 */
@Stateless
public class InventarioComprasFacade extends AbstractFacade<InventarioCompras> {
    @PersistenceContext(unitName = "com.mycompany_mavenproject3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InventarioComprasFacade() {
        super(InventarioCompras.class);
    }
    
}
