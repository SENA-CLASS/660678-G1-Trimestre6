/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion;

import edu.co.sena.myonlineshop.modelo.jpa.entities.CarritoCompras;
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
public class CarritoComprasDAOImplTest {

    CarritoCompras entity = new CarritoCompras();

    public CarritoComprasDAOImplTest() {
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
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.insert(entity);
    }

    /**
     * Test of update method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        entity.setImpuestos(2.6);
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.update(entity);
    }

    /**
     * Test of delete method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        CarritoCompras ct = instance.findByIdCarrito("asdfasdfasdf");
        instance.delete(ct);
        
    }

    /**
     * Test of findByIdCarrito method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByIdCarrito() {
        System.out.println("findByIdCarrito");
        CarritoCompras ct;
        String idcarrito = "asdfasdfasdf";
        CarritoComprasDAOImpl carrito = new CarritoComprasDAOImpl();
        ct = carrito.findByIdCarrito(idcarrito);
        System.out.println(ct.getIdCarrito());

    }

    /**
     * Test of findByAll method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByAll();
        for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findByTotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByTotal() {
        System.out.println("findByTotal");
        double total = 0;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByTotal(total);
        for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findBySubtotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindBySubtotal() {
        System.out.println("findBySubtotal");
        double subtotal = 0;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findBySubtotal(subtotal);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

    /**
     * Test of findByImpuestos method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByImpuestos() {
        System.out.println("findByImpuestos");
        double impuesto = 0;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> result = instance.findByImpuestos(impuesto);
         for (CarritoCompras result1 : result) {
            System.out.println(result1.getIdCarrito());
        }
    }

}
