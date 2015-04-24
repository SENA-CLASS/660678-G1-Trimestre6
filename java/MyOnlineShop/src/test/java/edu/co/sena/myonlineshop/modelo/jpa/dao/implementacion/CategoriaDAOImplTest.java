/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion;

import edu.co.sena.myonlineshop.modelo.jpa.entities.Categoria;
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
public class CategoriaDAOImplTest {
    
    Categoria entidad;
    
    public CategoriaDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        entidad = new Categoria();
        entidad.setNombre("prueba");
        entidad.setActiva(Boolean.TRUE);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class CategoriaDAOImpl.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        Categoria categoriaPadre = instance.findByIdCategoria(1);
        entidad.setCategoriaIdCategoria(categoriaPadre);
        
        instance.insert(entidad);
        
    }

    /**
     * Test of update method, of class CategoriaDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Categoria entity = null;
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CategoriaDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Categoria entity = null;
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        instance.delete(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByIdCategoria method, of class CategoriaDAOImpl.
     */
    @Test
    public void testFindByIdCategoria() {
        System.out.println("findByIdCategoria");
        Integer idCategoria = null;
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        Categoria expResult = null;
        Categoria result = instance.findByIdCategoria(idCategoria);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class CategoriaDAOImpl.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByNombre method, of class CategoriaDAOImpl.
     */
    @Test
    public void testFindByNombre() {
        System.out.println("findByNombre");
        String nombre = "";
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.findByNombre(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByActiva method, of class CategoriaDAOImpl.
     */
    @Test
    public void testFindByActiva() {
        System.out.println("findByActiva");
        Boolean activa = null;
        CategoriaDAOImpl instance = new CategoriaDAOImpl();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.findByActiva(activa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
