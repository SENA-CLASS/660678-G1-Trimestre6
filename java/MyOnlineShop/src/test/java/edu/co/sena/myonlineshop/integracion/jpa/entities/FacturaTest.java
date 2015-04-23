/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.integracion.jpa.entities;

import edu.co.sena.myonlineshop.modelo.jpa.entities.Pedido;
import edu.co.sena.myonlineshop.modelo.jpa.entities.Cuenta;
import edu.co.sena.myonlineshop.modelo.jpa.entities.Pago;
import edu.co.sena.myonlineshop.modelo.jpa.entities.Factura;
import java.util.Date;
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
public class FacturaTest {
    
    public FacturaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getIdFactura method, of class Factura.
     */
    @Test
    public void testGetIdFactura() {
        System.out.println("getIdFactura");
        Factura instance = new Factura();
        Integer expResult = null;
        Integer result = instance.getIdFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdFactura method, of class Factura.
     */
    @Test
    public void testSetIdFactura() {
        System.out.println("setIdFactura");
        Integer idFactura = null;
        Factura instance = new Factura();
        instance.setIdFactura(idFactura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechaFactura method, of class Factura.
     */
    @Test
    public void testGetFechaFactura() {
        System.out.println("getFechaFactura");
        Factura instance = new Factura();
        Date expResult = null;
        Date result = instance.getFechaFactura();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechaFactura method, of class Factura.
     */
    @Test
    public void testSetFechaFactura() {
        System.out.println("setFechaFactura");
        Date fechaFactura = null;
        Factura instance = new Factura();
        instance.setFechaFactura(fechaFactura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFormaPago method, of class Factura.
     */
    @Test
    public void testGetFormaPago() {
        System.out.println("getFormaPago");
        Factura instance = new Factura();
        String expResult = "";
        String result = instance.getFormaPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFormaPago method, of class Factura.
     */
    @Test
    public void testSetFormaPago() {
        System.out.println("setFormaPago");
        String formaPago = "";
        Factura instance = new Factura();
        instance.setFormaPago(formaPago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstado method, of class Factura.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Factura instance = new Factura();
        String expResult = "";
        String result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Factura.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        String estado = "";
        Factura instance = new Factura();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPago method, of class Factura.
     */
    @Test
    public void testGetPago() {
        System.out.println("getPago");
        Factura instance = new Factura();
        Pago expResult = null;
        Pago result = instance.getPago();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPago method, of class Factura.
     */
    @Test
    public void testSetPago() {
        System.out.println("setPago");
        Pago pago = null;
        Factura instance = new Factura();
        instance.setPago(pago);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuenta method, of class Factura.
     */
    @Test
    public void testGetCuenta() {
        System.out.println("getCuenta");
        Factura instance = new Factura();
        Cuenta expResult = null;
        Cuenta result = instance.getCuenta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCuenta method, of class Factura.
     */
    @Test
    public void testSetCuenta() {
        System.out.println("setCuenta");
        Cuenta cuenta = null;
        Factura instance = new Factura();
        instance.setCuenta(cuenta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPedido method, of class Factura.
     */
    @Test
    public void testGetPedido() {
        System.out.println("getPedido");
        Factura instance = new Factura();
        Pedido expResult = null;
        Pedido result = instance.getPedido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPedido method, of class Factura.
     */
    @Test
    public void testSetPedido() {
        System.out.println("setPedido");
        Pedido pedido = null;
        Factura instance = new Factura();
        instance.setPedido(pedido);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Factura.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Factura instance = new Factura();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Factura.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Factura instance = new Factura();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Factura.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Factura instance = new Factura();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
