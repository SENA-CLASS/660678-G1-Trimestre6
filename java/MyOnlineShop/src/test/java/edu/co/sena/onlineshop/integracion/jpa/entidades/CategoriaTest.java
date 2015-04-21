/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.onlineshop.integracion.jpa.entidades;

import edu.co.sena.myonlineshop.integracion.jpa.entities.Categoria;
import edu.co.sena.myonlineshop.integracion.jpa.entities.Producto;
import edu.co.sena.onlineshop.inegracion.jpa.util.EntityManagerHelper;
import java.util.Collection;
import javax.persistence.EntityManager;
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
public class CategoriaTest {
    
    public CategoriaTest() {
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
     * Test of getIdCategoria method, of class Categoria.
     */
    @Test
    public void testGetIdCategoria() {
        System.out.println("getIdCategoria");
        Categoria instance = new Categoria();
        Integer expResult = null;
        Integer result = instance.getIdCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdCategoria method, of class Categoria.
     */
    @Test
    public void testSetIdCategoria() {
        System.out.println("setIdCategoria");
        Integer idCategoria = null;
        Categoria instance = new Categoria();
        instance.setIdCategoria(idCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Categoria.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Categoria.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Categoria instance = new Categoria();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getActiva method, of class Categoria.
     */
    @Test
    public void testGetActiva() {
        System.out.println("getActiva");
        Categoria instance = new Categoria();
        Boolean expResult = null;
        Boolean result = instance.getActiva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setActiva method, of class Categoria.
     */
    @Test
    public void testSetActiva() {
        System.out.println("setActiva");
        Boolean activa = null;
        Categoria instance = new Categoria();
        instance.setActiva(activa);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoriaCollection method, of class Categoria.
     */
    @Test
    public void testGetCategoriaCollection() {
        System.out.println("getCategoriaCollection");
        Categoria instance = new Categoria();
        Collection<Categoria> expResult = null;
        Collection<Categoria> result = instance.getCategoriaCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaCollection method, of class Categoria.
     */
    @Test
    public void testSetCategoriaCollection() {
        System.out.println("setCategoriaCollection");
        Collection<Categoria> categoriaCollection = null;
        Categoria instance = new Categoria();
        instance.setCategoriaCollection(categoriaCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoriaIdCategoria method, of class Categoria.
     */
    @Test
    public void testGetCategoriaIdCategoria() {
        System.out.println("getCategoriaIdCategoria");
        Categoria instance = new Categoria();
        Categoria expResult = null;
        Categoria result = instance.getCategoriaIdCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoriaIdCategoria method, of class Categoria.
     */
    @Test
    public void testSetCategoriaIdCategoria() {
        System.out.println("setCategoriaIdCategoria");
        Categoria categoriaIdCategoria = null;
        Categoria instance = new Categoria();
        instance.setCategoriaIdCategoria(categoriaIdCategoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProductoCollection method, of class Categoria.
     */
    @Test
    public void testGetProductoCollection() {
        System.out.println("getProductoCollection");
        Categoria instance = new Categoria();
        Collection<Producto> expResult = null;
        Collection<Producto> result = instance.getProductoCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProductoCollection method, of class Categoria.
     */
    @Test
    public void testSetProductoCollection() {
        System.out.println("setProductoCollection");
        Collection<Producto> productoCollection = null;
        Categoria instance = new Categoria();
        instance.setProductoCollection(productoCollection);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Categoria.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Categoria instance = new Categoria();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Categoria.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Categoria instance = new Categoria();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Categoria instance = new Categoria();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class Categoria.
     */
    @Test
    public void insertCategoria() {
        System.out.println("Insertar categoria");
        Categoria instance = new Categoria();
        instance.setNombre("adfasdf");
        instance.setActiva(Boolean.TRUE);
        instance.setCategoriaIdCategoria(new Categoria(1));
        EntityManager em = EntityManagerHelper.getEntityManager();
        EntityManagerHelper.beginTransaction();
        em.persist(instance);
        EntityManagerHelper.commit();
        EntityManagerHelper.closeEntityManager();
        
        
        
    }
    
}
