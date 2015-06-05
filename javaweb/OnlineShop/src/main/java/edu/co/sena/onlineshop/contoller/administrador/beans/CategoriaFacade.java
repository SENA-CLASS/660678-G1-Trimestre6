/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.onlineshop.contoller.administrador.beans;

import edu.co.sena.onlineshop.model.entities.Categoria;
import edu.co.sena.onlineshop.model.entities.Departamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author hernando
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> {
    @PersistenceContext(unitName = "edu.co.sena_OnlineShop_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }

    @Override
    public void remove(Categoria entity) {
        getEntityManager().remove(getEntityManager().find(Categoria.class, entity.getIdCategoria()));
        
    }
    
    
    public List<Categoria> findById(Object id) {
        Query queryJPQL =getEntityManager().createNamedQuery("Categoria.findByIdCategoria");
        queryJPQL.setParameter("idCategoria",id);
        return queryJPQL.getResultList();
    }
    
    public List<Categoria> findByNombre(Object parteNombre) {
        String querySQL = "SELECT * FROM categoria cat where  cat.NOMBRE like '%"+parteNombre+"%';";
        Query queryJPQL =getEntityManager().createNativeQuery(querySQL,Categoria.class);
        return queryJPQL.getResultList();
    }
    
    public List<Categoria> findEstado(Object estado) {
        Query queryJPQL =getEntityManager().createNamedQuery("Categoria.findByActiva");
        queryJPQL.setParameter("activa",estado);
        return queryJPQL.getResultList();
    }
    
    
    
}
