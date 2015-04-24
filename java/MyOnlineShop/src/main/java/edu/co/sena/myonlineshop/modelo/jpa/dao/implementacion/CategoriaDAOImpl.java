/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion;

import edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces.ICategoriaDAO;
import edu.co.sena.myonlineshop.modelo.jpa.entities.Categoria;
import edu.co.sena.myonlineshop.modelo.jpa.util.EntityManagerHelper;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author hernando
 */
public class CategoriaDAOImpl implements ICategoriaDAO{

      private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }
    
    @Override
    public void insert(Categoria entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.persist(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
    }

    @Override
    public void update(Categoria entity) {
         EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.merge(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
    }

    @Override
    public void delete(Categoria entity) {
            EntityManager em = getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            entity = em.getReference(Categoria.class,
                    entity.getCategoriaIdCategoria());
            em.remove(entity);
            EntityManagerHelper.commit();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
    }

    @Override
    public Categoria findByIdCategoria(Integer idCategoria) {
        EntityManager em = getEntityManager();
        Categoria categoriaTemporal = null;
        try {
            categoriaTemporal = em.find(Categoria.class, idCategoria);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return categoriaTemporal;
    }

    @Override
    public List<Categoria> findAll() {
        EntityManager em = getEntityManager();
        List<Categoria> categoriasTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findAll");
        try {
            categoriasTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriasTemporal;
    }

    @Override
    public List<Categoria> findByNombre(String nombre) {
        EntityManager em = getEntityManager();
        List<Categoria> categoriasTemporal = null;
        Query query = em.createNamedQuery("Categoria.findByNombre");
        query.setParameter(ICategoriaDAO.NOMBRE, nombre);
        try {
            categoriasTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriasTemporal;
    }

    @Override
    public List<Categoria> findByActiva(Boolean activa) {
        EntityManager em = getEntityManager();
        List<Categoria> categoriasTemporal = null;
        Query query = em.createNamedQuery("Categoria.findByActiva");
        query.setParameter(ICategoriaDAO.ACTIVA, activa);
        try {
            categoriasTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return categoriasTemporal;
    }
    
}
