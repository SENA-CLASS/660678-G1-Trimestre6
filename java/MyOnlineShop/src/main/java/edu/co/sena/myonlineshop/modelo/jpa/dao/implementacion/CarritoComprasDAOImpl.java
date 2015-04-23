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

/**
 *
 * @author hernando
 */
public class CarritoComprasDAOImpl implements ICarritoComprasDAO {

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
        }finally{
            if(em != null){
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
        }finally{
            if(em != null){
             EntityManagerHelper.closeEntityManager();
            }
        }
    }

    @Override
    public void delete(CarritoCompras entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CarritoCompras findByIdCarrito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findByAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findByTotal(Object total) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findBySubtotal(Object subtotal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CarritoCompras> findByImpuestos(Object impuesto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
