/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject3.sessionBeans;

import com.mycompany.mavenproject3.Departamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Enrique
 */
@Stateless
public class DepartamentoFacade extends AbstractFacade<Departamento> {
    @PersistenceContext(unitName = "com.mycompany_mavenproject3_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public DepartamentoFacade() {
        super(Departamento.class);
    }

    
    public List<Departamento> findById(int id) {
        Query query = getEntityManager().createNamedQuery("Departamento.findByIdDEPARTAMENTO");
        query.setParameter("idDEPARTAMENTO", id);
        return query.getResultList();
    }

    public List<Departamento> findByParteNombre(String nombreDepBuscar) {
        String sqlQuery = "SELECT * FROM departamento dep where dep.NOMBRE_DEPARTAMENTO like '%"+nombreDepBuscar+"%';";
        Query query2 = getEntityManager().createNativeQuery(sqlQuery, Departamento.class);
        return query2.getResultList();
    }
    
    
    
}
