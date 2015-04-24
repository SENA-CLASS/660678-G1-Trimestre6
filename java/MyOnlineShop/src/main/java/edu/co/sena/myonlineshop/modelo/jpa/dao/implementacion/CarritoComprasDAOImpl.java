/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion;

import edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.myonlineshop.modelo.jpa.entities.CarritoCompras;
import edu.co.sena.onlineshop.modelo.jpa.util.EntityManagerHelper;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Parameter;
import javax.persistence.Query;

/**
 *
 * @author hernando
 */
public class CarritoComprasDAOImpl implements ICarritoComprasDAO {

    public static final String TOTAL = "total";
    public static final String SUBTOTAL = "subtotal";
    public static final String IMPUESTOS = "impuestos";

    private EntityManager getEntityManager() {
        return EntityManagerHelper.getEntityManager();
    }

    @Override
    public void insert(CarritoCompras entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
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
    public void update(CarritoCompras entity) {
        EntityManager em = EntityManagerHelper.getEntityManager();
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
    public void delete(CarritoCompras entity) {
                 EntityManager em = EntityManagerHelper.getEntityManager();
        try {
            EntityManagerHelper.beginTransaction();
            em.remove(em.find(CarritoCompras.class, entity));
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
    public CarritoCompras findByIdCarrito(String idCarrito) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        CarritoCompras carritoTemporal = null;
        try {
            carritoTemporal = em.find(CarritoCompras.class, idCarrito);
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            if (em != null) {
                EntityManagerHelper.closeEntityManager();
            }
        }
        return carritoTemporal;
    }

    @Override
    public List<CarritoCompras> findByAll() {
        EntityManager em = EntityManagerHelper.getEntityManager();
        List<CarritoCompras> carritosTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findAll");
        try {
            carritosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritosTemporal;
    }

    @Override
    public List<CarritoCompras> findByTotal(double total) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        List<CarritoCompras> carritosTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findByTotal");
        query.setParameter(CarritoComprasDAOImpl.TOTAL, total);
        try {
            carritosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritosTemporal;
    }

    @Override
    public List<CarritoCompras> findBySubtotal(double subtotal) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        List<CarritoCompras> carritosTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findBySubtotal");
        query.setParameter(CarritoComprasDAOImpl.SUBTOTAL, SUBTOTAL);
        try {
            carritosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritosTemporal;
    }

    @Override
    public List<CarritoCompras> findByImpuestos(double impuesto) {
        EntityManager em = EntityManagerHelper.getEntityManager();
        List<CarritoCompras> carritosTemporal = null;
        Query query = em.createNamedQuery("CarritoCompras.findByTotal");
        query.setParameter(CarritoComprasDAOImpl.IMPUESTOS, impuesto);
        try {
            carritosTemporal = query.getResultList();
        } catch (RuntimeException re) {
            System.out.println("erorrr:----------------" + re.getMessage());
        } finally {
            EntityManagerHelper.closeEntityManager();
        }
        return carritosTemporal;
    }

}
