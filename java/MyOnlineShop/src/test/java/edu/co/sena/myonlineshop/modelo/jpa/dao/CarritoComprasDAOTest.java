/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao;

import edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion.CarritoComprasDAOImpl;
import edu.co.sena.myonlineshop.modelo.jpa.dao.interfaces.ICarritoComprasDAO;
import edu.co.sena.myonlineshop.modelo.jpa.entities.CarritoCompras;
import edu.co.sena.myonlineshop.modelo.factory.DAOAbstractFactory;
import edu.co.sena.myonlineshop.modelo.factory.DAOFactory;
import edu.co.sena.myonlineshop.modelo.factory.mysql.MysqlJPADAOFactory;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernando
 */
public class CarritoComprasDAOTest {
    
    
    CarritoCompras entity = new CarritoCompras();

    public CarritoComprasDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        entity.setIdCarrito("asdfasdfasdf");
        entity.setImpuestos(0);
        entity.setSubtotal(0);
        entity.setTotal(0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class CarritoComprasDAOImpl.
     * @throws java.lang.Exception
     */
    @Test
    public void testInsert() throws Exception{
        System.out.println("insert");
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        instance.insert(entity);
    }

    /**
     * Test of update method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testUpdate() throws Exception{
        System.out.println("update");
        entity.setImpuestos(2.9);
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        instance.update(entity);
    }

    /**
     * Test of delete method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testDelete() throws Exception {
        System.out.println("delete");
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        CarritoCompras ct = instance.findByIdCarrito("asdfasdfasdf");
        instance.delete(ct);
        
    }

    /**
     * Test of findByIdCarrito method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByIdCarrito() throws Exception {
        System.out.println("findByIdCarrito");
        CarritoCompras ct;
        String idcarrito = "asdfasdfasdf";
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        ct = instance.findByIdCarrito(idcarrito);
        System.out.println(ct.getIdCarrito());

    }

    /**
     * Test of findByAll method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByAll() throws Exception {
        System.out.println("findByAll");
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = instance.findByAll();
        for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findByTotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByTotal() throws Exception {
        System.out.println("findByTotal");
        double total = 0;
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = instance.findByTotal(total);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findBySubtotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindBySubtotal() throws Exception {
        System.out.println("findBySubtotal");
        double subtotal = 0;
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = instance.findBySubtotal(subtotal);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findByImpuestos method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByImpuestos() throws Exception{
        System.out.println("findByImpuestos");
        double impuesto = 0;
        DAOFactory fabrica = MysqlJPADAOFactory.getDAOFactory(DAOAbstractFactory.MYSQL_FACTORY);
        ICarritoComprasDAO instance = fabrica.createCarritoComprasDAO();
        List<CarritoCompras> result = instance.findByImpuestos(impuesto);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

}
